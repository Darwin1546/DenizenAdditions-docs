    // <--[event]
    // @Events
    // discord user changes guild tag
    //
    // @Switch for:<bot> to only process the event for a specified Discord bot.
    // @Switch group:<group_id> to only process the event when the old or the new tag belongs to a specified Discord group.
    //
    // @Plugin dDiscordBot, DenizenAdditions
    //
    // @Group Discord
    //
    // @Triggers when the server tag (guild tag) a user shows next to their name changes: they put one on, take it off,
    // hide it, switch to another guild's tag, or the guild renames or turns off its tag.
    // A change of the badge alone does not count.
    //
    // Only fires for users who share a group with the bot, once per connected bot that sees them.
    // Discord only sends this while the bot is connected: a change made during downtime is not reported later,
    // so compare against <@link tag DiscordUserTag.has_guild_tag> on startup if that matters.
    //
    // @Context
    // <context.bot> returns the relevant DiscordBotTag.
    // <context.user> returns the DiscordUserTag.
    // <context.old_tag> returns the tag text shown before, if any.
    // <context.new_tag> returns the tag text shown now, if any.
    // <context.old_group> returns the DiscordGroupTag the old tag belongs to, if any.
    // <context.new_group> returns the DiscordGroupTag the new tag belongs to, if any.
    //
    // @Example
    // # Gives a role to whoever shows this group's tag, and takes it away when they stop.
    // on discord user changes guild tag group:123456789:
    // - define group <discord_group[mybot,123456789]>
    // - if <context.user.has_guild_tag[<[group]>]>:
    //     - discord id:mybot add_role user:<context.user> role:<[group].role[Tag wearer]> group:<[group]>
    // - else:
    //     - discord id:mybot remove_role user:<context.user> role:<[group].role[Tag wearer]> group:<[group]>
    // -->

