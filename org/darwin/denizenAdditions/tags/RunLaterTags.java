        // <--[tag]
        // @attribute <ScriptTag.runlaters>
        // @returns ListTag(MapTag)
        // @plugin DenizenAdditions
        // @description
        // Returns every run of this script still waiting in <@link command runlater>, soonest first,
        // each as a map in the format described at <@link tag util.runlater>.
        // Unlike <@link tag util.runlater_ids>, this includes runs that were scheduled without an ID.
        // To only get the runs linked to one player, use <@link tag PlayerTag.runlaters>.
        // -->

        // <--[tag]
        // @attribute <PlayerTag.runlaters[(<script>)]>
        // @returns ListTag(MapTag)
        // @plugin DenizenAdditions
        // @description
        // Returns every run still waiting in <@link command runlater> that is linked to this player, soonest first,
        // each as a map in the format described at <@link tag util.runlater>.
        // Optionally, only those of the given script.
        // A run is linked to whichever player its queue had when it was scheduled - definitions holding a player don't count.
        // -->

        // <--[tag]
        // @attribute <util.runlater[<id>]>
        // @returns MapTag
        // @plugin DenizenAdditions
        // @description
        // Returns the run scheduled in <@link command runlater> under the given ID, as a map with keys:
        // "id": the ID it was scheduled with, if any.
        // "script": the ScriptTag that will run - missing if that script no longer exists.
        // "path": the script path, if one was given.
        // "time": a TimeTag of when it is due.
        // "player" / "npc": the linked player and NPC, if any.
        // "definitions": a MapTag of the named definitions, as given to 'def.<name>:' or 'defmap:'.
        // "definition_list": a ListTag of the positional definitions given to 'def:', as given - they are only matched
        // up with the task script's 'definitions' key once it actually runs.
        // Returns null if no run is scheduled under that ID.
        // -->

