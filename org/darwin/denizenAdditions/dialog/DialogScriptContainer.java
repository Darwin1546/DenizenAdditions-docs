    // <--[language]
    // @name Dialog Script Containers
    // @group Script Container System
    // @description
    // Dialog script containers define native client-side dialog windows (Paper's dialog API).
    // Show one with <@link command showdialog> or <@link mechanism PlayerTag.show_dialog>.
    //
    // Each dialog requires a 'base' section with a 'title' and a 'type'.
    //
    // TYPES:
    // - confirm : Two-button confirmation dialog, uses 'yes:' and 'no:'
    // - notice  : Simple dialog with a single 'button:'
    // - list    : Shows buttons that open other dialog scripts, listed under 'dialogs:'
    // - multi   : Grid of action buttons, listed under 'buttons:'
    //
    // 'base.after action' decides what happens after a button is clicked: 'close' (default), 'none' (stay open)
    // or 'wait_for_response' (stays open until the server shows another dialog or closes it).
    //
    // Every tag in the container is parsed when the dialog is shown, for the player it is shown to,
    // with the definitions passed to the command (and the definitions of the queue that showed it).
    // Button 'script' sections run when clicked, with the same definitions.
    // 'condition' on an input, body or button hides it unless the tag returns true.
    //
    // DYNAMIC GENERATION (Procedural):
    // A 'procedural' script section at the root of the container runs when the dialog is shown,
    // and can 'determine' maps for 'inputs', 'bodies' or 'buttons'. Their entries are added on top of
    // (and replace same-named) entries of the static section.
    // Tags inside 'script' keys and '<context.inputs...>' tags are escaped automatically when the script loads,
    // so inside 'procedural' they are only parsed when the button is clicked.
    //
    // <code>
    // Dialog_Script_Name:
    //     type: dialog
    //
    //     # Names the definitions passed with 'showdialog ... def:'.
    //     definitions: target
    //
    //     base:
    //         title: <yellow>Main Menu
    //         type: multi
    //
    //         # Optional window settings
    //         external title: App Title
    //         can close with escape: true
    //         after action: close
    //
    //         # Layout columns (list or multi)
    //         columns: 3
    //
    //         # Button width (only for 'list')
    //         button width: 100
    //
    //     # Exit button (list or multi)
    //     exit button:
    //         label: Exit
    //
    //     # Procedural queue to generate elements dynamically
    //     procedural:
    //     - repeat 15 as:x:
    //         - definemap button:
    //             label: <[x]>
    //             width: 15
    //             script:
    //             - announce "Clicked button <context.button_id>"
    //         - define buttons.<[x]>:<[button]>
    //     - determine buttons:<[buttons]>
    //
    //     # only for 'list'
    //     dialogs:
    //     - other_dialog_script
    //
    //     # Static content displayed in the dialog
    //     bodies:
    //         my_text:
    //             type: message
    //             message: Hello, <player.name>!
    //
    //     # Input fields
    //     inputs:
    //         1:
    //             type: text
    //             key: custom_context_name
    //             label: Name
    //         my_input:
    //             type: text
    //             label: Name2
    //
    //     # Interaction buttons
    //     # 'multi' uses 'buttons:'
    //     # 'confirm' uses 'yes:' and 'no:'
    //     # 'notice' uses 'button:'
    //     buttons:
    //         submit:
    //             label: Submit
    //             script:
    //             - narrate "Context is <context.custom_context_name>, <context.my_input>, target is <[target]>"
    // </code>
    //
    // See also <@link language Dialog Inputs>, <@link language Dialog Buttons> and <@link language Dialog Bodies>.
    // -->

    // <--[language]
    // @name Dialog Inputs
    // @group Script Container System
    // @description
    // Dialog inputs collect player data that becomes available to button scripts.
    //
    // Input values can be accessed directly using <context.(key)> (e.g., <context.applicant_name>),
    // or as a full map using <context.inputs>.
    // The key is the input's name in the 'inputs' section, unless 'key' sets another one.
    //
    // TYPES:
    //
    // TEXT
    // A text input field.
    //
    // - type: text
    // - label: <text> (Required)
    // - key: <context_key>
    // - initial: <text>
    // - width: <number>
    // - max length: <number>
    // - label visible: true/false
    //
    // Multiline options:
    // - multiline options:
    //     max lines: <number>
    //     height: <number>
    //
    //
    // BOOLEAN
    // A toggle switch input.
    //
    // - type: boolean
    // - label: <text> (Required)
    // - key: <context_key>
    // - initial: true/false
    // - on true: <text>
    // - on false: <text>
    //
    //
    // NUMBER
    // A numeric range slider.
    //
    // - type: number
    // - label: <text> (Required)
    // - key: <context_key>
    // - start: <float> (Required)
    // - end: <float> (Required)
    // - initial: <float>
    // - step: <float>
    // - width: <number>
    // - label format: <text>
    //   Example: "Value: %s"
    //
    //
    // SINGLE
    // A single-choice selection list.
    //
    // - type: single
    // - label: <text> (Required)
    // - key: <context_key>
    // - label visible: true/false
    // - width: <number>
    //
    // Options:
    //   options:
    //     option_name:
    //         id: unique_id
    //         display: <text>
    //         initial: true/false
    // -->

    // <--[language]
    // @name Dialog Buttons
    // @group Script Container System
    // @description
    // Buttons define interactive actions within dialogs.
    //
    // Button sections depend on the dialog type:
    // - confirm: 'yes:' and 'no:'
    // - notice: 'button:'
    // - multi: 'buttons:' (a section of buttons)
    // - list and multi: 'exit button:'
    //
    // Button fields:
    // - label: <text> (Required)
    // - tooltip: <text>
    // - width: <number>
    // - type: SCRIPT (default), RUN_COMMAND, OPEN_URL, COPY_TO_CLIPBOARD
    //
    // ACTION TYPES:
    //
    // SCRIPT
    // Runs the 'script' section when clicked, linked to the player who clicked.
    // Script buttons only work in the dialog shown last to the player, and with 'after action: close' only for one click.
    // Showing the player another dialog, <@link mechanism PlayerTag.close_dialog> or quitting disables them.
    // Input values are checked against the inputs as they were sent (text length, number range and step, offered options),
    // and the click is ignored if they don't fit.
    // Note that the server isn't told when the player closes a dialog with escape or with a non-script button,
    // so until one of the above happens a modified client can still send one click.
    // Available context:
    // <context.button_id> returns the name of the clicked button.
    // <context.inputs> returns a MapTag of all input values.
    // <context.(input key)> returns the value of that input.
    //
    // RUN_COMMAND
    // Makes the player run a command.
    // command: spawn
    //
    // OPEN_URL
    // Opens a web URL.
    // url: https://example.com
    //
    // COPY_TO_CLIPBOARD
    // Copies text to the player's clipboard.
    // text: Hello world
    // -->

    // <--[language]
    // @name Dialog Bodies
    // @group Script Container System
    // @description
    // Bodies define static content displayed inside the dialog.
    //
    // MESSAGE
    // Displays formatted text.
    //
    // - type: message
    // - message: <text> (Required)
    // - width: <number>
    //
    //
    // ITEM
    // Displays an item preview.
    //
    // - type: item
    // - item: <ItemTag> (Required)
    // - width: <number>
    // - height: <number>
    // - show tooltip: true/false
    // - show decorations: true/false
    //
    // Optional description:
    // - description:
    //     message: <text>
    //     width: <number>
    // -->

