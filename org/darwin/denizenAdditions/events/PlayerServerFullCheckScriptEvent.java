    // <--[event]
    // @Events
    // player server full check
    //
    // @Group Player
    //
    // @Triggers when the server computes whether it is currently considered full for a connecting player, before the player has finished joining.
    // This runs very early in the connection process - the player has not actually joined yet, so most player data/state may not be available.
    // Should NOT be confused with <@link event player joins>.
    //
    // @Switch is_allowed:<true/false> to only handle the event when the player is (or isn't) currently allowed to join, before this event runs.
    //
    // @Context
    // <context.name> returns the connecting player's name.
    // <context.uuid> returns the connecting player's UUID.
    // <context.is_allowed> returns whether the player is currently allowed to join (false means the server is currently considered full for them).
    // <context.kick_message> returns the currently planned kick message, that would be shown if the player ends up rejected.
    //
    // @Determine
    // "ALLOWED" to let the player join even if the server would otherwise consider itself full.
    // "DENIED" to reject the player, keeping whatever kick message is already planned.
    // "KICK_MESSAGE:<ElementTag>" to reject the player and set a custom kick message.
    //
    // @Player When the player has previously joined (and thus the UUID is valid).
    // -->

