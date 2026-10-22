    // <--[event]
    // @Events
    // discord thread archives|unarchives
    //
    // @Switch for:<bot> to only process the event for a specified Discord bot.
    // @Switch group:<group_id> to only process the event for a specified Discord group.
    // @Switch parent:<channel_id> to only process the event for threads in a specified channel.
    //
    // @Plugin dDiscordBot, DenizenAdditions
    //
    // @Group Discord
    //
    // @Triggers when a thread is archived or unarchived - by Discord itself after inactivity, by a user, or by a bot.
    // dDiscordBot's own 'discord thread archived' event does not actually fire on archiving: it is tied to the bot
    // losing access to a thread. This one listens to the archive flag itself.
    //
    // Discord only sends this while the bot is connected: a thread archived during downtime is not reported later.
    //
    // @Context
    // <context.bot> returns the relevant DiscordBotTag.
    // <context.group> returns the DiscordGroupTag.
    // <context.thread> returns the thread DiscordChannelTag.
    // -->

