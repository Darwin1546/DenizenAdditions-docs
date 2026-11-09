        // <--[tag]
        // @attribute <server.recent_players>
        // @returns ListTag(PlayerTag)
        // @plugin DenizenAdditions
        // @description
        // Returns the players seen recently, sorted by name: everyone in the server's usercache.json
        // (its size is 'settings.user-cache-size' in spigot.yml, 1000 by default), plus everyone who joined since startup.
        // Unlike <@link tag server.players>, this never reads player data files, so it's fast even with many thousands of players.
        // -->

        // <--[tag]
        // @attribute <server.recent_player_names>
        // @returns ListTag
        // @plugin DenizenAdditions
        // @description
        // Returns the real-case names of the players from <@link tag server.recent_players>, in the same order.
        // Cheaper than parsing the names out of that list, as no player data is read.
        // -->

        // <--[tag]
        // @attribute <server.recent_player[<name>]>
        // @returns PlayerTag
        // @plugin DenizenAdditions
        // @description
        // Returns the player from <@link tag server.recent_players> with exactly this name, ignoring case.
        // Always the current owner of the name, even if it changed hands.
        // Returns null for players not seen recently - use <@link objecttype PlayerTag> by name or UUID for those.
        // -->

