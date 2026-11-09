        // <--[tag]
        // @attribute <PlayerTag.cached_name>
        // @returns ElementTag
        // @plugin DenizenAdditions
        // @description
        // Returns the player's real-case name if they were seen recently (see <@link tag server.recent_players>), otherwise null.
        // <@link tag PlayerTag.name> reads an offline player's whole data file on every use; this never touches the disk,
        // so for lists of offline players use <[player].cached_name.if_null[<[player].name>]>.
        // -->

