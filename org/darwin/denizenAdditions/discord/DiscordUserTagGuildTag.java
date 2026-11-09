        // <--[tag]
        // @attribute <DiscordUserTag.guild_tag>
        // @returns ElementTag
        // @plugin dDiscordBot, DenizenAdditions
        // @description
        // Returns the text of the server tag (guild tag) the user shows next to their name, like "ABCD".
        // Returns null if the user shows no tag - none chosen, hidden by the user, or turned off by the guild.
        // The tag can belong to any guild, not only ones the bot is in: use <@link tag DiscordUserTag.has_guild_tag>
        // to check for a specific one.
        // Read from the bot's cache, so the user has to share a group with the bot.
        // See also <@link event discord user changes guild tag>.
        // -->

        // <--[tag]
        // @attribute <DiscordUserTag.guild_tag_group>
        // @returns DiscordGroupTag
        // @plugin dDiscordBot, DenizenAdditions
        // @description
        // Returns the group whose server tag the user shows next to their name, or null if they show none.
        // The group may be one the bot is not in: then only its ID is known.
        // See <@link tag DiscordUserTag.guild_tag>.
        // -->

        // <--[tag]
        // @attribute <DiscordUserTag.guild_tag_badge>
        // @returns ElementTag
        // @plugin dDiscordBot, DenizenAdditions
        // @description
        // Returns the image URL of the badge shown before the user's server tag, or null if they show no tag
        // or the tag has no badge.
        // See <@link tag DiscordUserTag.guild_tag>.
        // -->

        // <--[tag]
        // @attribute <DiscordUserTag.has_guild_tag[<group>]>
        // @returns ElementTag(Boolean)
        // @plugin dDiscordBot, DenizenAdditions
        // @description
        // Returns whether the user shows the server tag of the given group next to their name.
        // False if the tag is of another group, or the user has hidden it.
        // See <@link tag DiscordUserTag.guild_tag>.
        // @example
        // - if <[user].has_guild_tag[<discord_group[mybot,123456789]>]>:
        //     - narrate "<[user].name> shows our tag: <[user].guild_tag>"
        // -->

