    // <--[command]
    // @Name showdialog
    // @Syntax showdialog [<dialog>] (def:<element>|...)
    // @Required 1
    // @Maximum 2
    // @Short Opens a dialog script for the linked player.
    // @Group player
    //
    // @Description
    // Opens the native dialog window defined by a <@link language Dialog Script Containers> for the linked player.
    //
    // Optionally, pass definitions with 'def:'. They are named by the dialog's 'definitions' key
    // (like a task script's), or numbered 1, 2, ... without it.
    // The dialog's tags, its 'procedural' section and its button scripts can use these definitions
    // as well as the definitions of the queue that ran the command.
    //
    // @Usage
    // Use to open a simple dialog script.
    // - showdialog MySimpleDialog
    //
    // @Usage
    // Use to pass definitions (like a quest ID and a reward amount) into the dialog.
    // - showdialog QuestConfirmDialog def:quest_01|1000
    // -->

