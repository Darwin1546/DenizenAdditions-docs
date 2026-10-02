        // <--[mechanism]
        // @object system
        // @name run_runlater_now
        // @input ElementTag
        // @plugin DenizenAdditions
        // @description
        // Runs a task scheduled in <@link command runlater> immediately, by its specified unique ID, and drops it from the schedule
        // so it won't run again at its original time.
        // If the ID isn't in use, will silently do nothing.
        // Use <@link tag util.runlater_ids> to check whether there is a scheduled task with the given ID.
        // The task runs on the spot, synchronously, exactly as it would have when its timer came up.
        // See also <@link mechanism system.cancel_runlater> to drop it without running it.
        // -->

