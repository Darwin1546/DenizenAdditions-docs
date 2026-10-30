    // <--[language]
    // @name Brigadier Command Script Containers
    // @group Script Container System
    // @description
    // Like a 'command' script container, but the command is built on Brigadier, the same system vanilla commands use.
    // The client knows the whole command tree, so it highlights each argument as it is typed, marks invalid input red
    // before it is sent, shows tooltips on suggestions, and accepts selectors and relative coordinates natively.
    // The command also works inside '/execute as ... at ... run'.
    //
    // The container itself is the root literal: its 'script' key runs for the bare command, and 'then' holds the nodes after it.
    // Every node under 'then' is either a literal (a fixed word) or, if it has a 'type' key, an argument.
    // A node can have these keys:
    // - type: the argument type, see <@link language Brigadier Argument Types>. Leave it out for a literal.
    // - permission: the permission needed to see and use this node (and everything below it).
    // - script: runs when the input ends at this node.
    // - suggest: for arguments only. Either a tag returning a list (or a map of value to tooltip),
    //   or a script section that does 'determine' with such a list/map. A script section may use waits and ~waitable
    //   commands (like ~webget): the client simply gets the suggestions once the queue finishes.
    //   Suggestions are filtered by what is typed so far automatically.
    // - then: the child nodes.
    // Argument types can have extra keys, like 'min' and 'max' for numbers.
    //
    // Inside 'script', every argument on the way to the node is available as <context.(argument name)>, already converted
    // to a Denizen object (a players argument becomes a ListTag of PlayerTags, a block_position becomes a LocationTag, etc).
    // Other context: <context.alias> (the label used), <context.raw_args> (everything after the label), <context.source_type>
    // (player, command_block, command_minecart, entity or server), <context.server> (true if not run by a player),
    // <context.location> (where the command runs, changed by 'execute at/positioned'),
    // and <context.executor> (the entity it runs as, changed by 'execute as').
    // The linked player is the executor when that is a player, otherwise the sender when that is a player.
    // 'determine' a number to set the command result (as seen by 'execute store result').
    //
    // Inside a 'suggest' tag or script, arguments typed before the current one are available the same way,
    // plus <context.current> - the text typed so far for the current argument.
    //
    // 'permission' is the only access check: Paper sends the command tree from another thread, where script tags can't run.
    // Commands update for online players on '/ex reload'.
    //
    // <code>
    // Brigadier_Command_Script_Name:
    //
    //     type: brigadier_command
    //
    //     # The name of the command, as in '/warp'.
    //     name: warp
    //
    //     # | Optional
    //     aliases:
    //     - w
    //
    //     # | Optional. Needed for the whole command.
    //     permission: myserver.warp
    //
    //     # | Optional. Runs for the bare '/warp'.
    //     script:
    //     - narrate "Usage: /warp tp <&lt>name<&gt> [players]"
    //
    //     then:
    //         # A literal: '/warp set ...'
    //         set:
    //             permission: myserver.warp.set
    //             then:
    //                 # An argument: it has a 'type'.
    //                 name:
    //                     type: word
    //                     script:
    //                     - flag server warps.<context.name>:<player.location>
    //         tp:
    //             then:
    //                 name:
    //                     type: word
    //                     # A map gives each suggestion a tooltip.
    //                     suggest: <server.flag[warps].parse_value_tag[<[parse_value].simple>]>
    //                     script:
    //                     - teleport <player> <server.flag[warps.<context.name>]>
    //                     then:
    //                         targets:
    //                             type: players
    //                             permission: myserver.warp.others
    //                             script:
    //                             - teleport <context.targets> <server.flag[warps.<context.name>]>
    //         give:
    //             then:
    //                 amount:
    //                     type: integer
    //                     min: 1
    //                     max: 64
    //                     # A script section can wait for anything before answering.
    //                     suggest:
    //                     - ~webget https://example.com/amounts save:request
    //                     - determine <entry[request].result.split[,]>
    //                     script:
    //                     - give stone quantity:<context.amount>
    // </code>
    //
    // -->

