    // <--[command]
    // @Name flashbackmarker
    // @Syntax flashbackmarker [<text>] (player:<player>) (category:<name>) (color:<color>) (location:<location>)
    // @Required 1
    // @Maximum 5
    // @Plugin ServerFlashback
    // @Short Puts a marker on the ServerFlashback recording timeline of a player.
    // @Group player
    //
    // @Description
    // Adds a marker to the continuous server recording of the player (ServerFlashback plugin).
    // Markers show up on the timeline of the ServerFlashback client addon and in Flashback when the replay is downloaded.
    //
    // The text is normal formatted text: colors and <&translate[...]> work, translations are resolved on the
    // moderator's client with the server resource pack.
    // The player defaults to the linked player.
    // The category is shown as its own filter in the addon, defaults to "Скрипты".
    // The color defaults to white. The location is optional and shown in the marker tooltip.
    //
    // Does nothing if the player is not being recorded or ServerFlashback is not installed.
    //
    // @Usage
    // Mark that the player got a job.
    // - flashbackmarker "Получил профессию: <[job]>" category:Профессии color:orange
    //
    // @Usage
    // Mark entering an apartment with its location.
    // - flashbackmarker "Зашёл в квартиру №<[flat]>" player:<[target]> category:Квартиры color:#55AAFF location:<player.location>
    // -->

