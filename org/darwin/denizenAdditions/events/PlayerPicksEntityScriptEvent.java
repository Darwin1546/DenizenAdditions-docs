    // <--[event]
    // @Events
    // player picks <entity>
    //
    // @Group Player
    //
    // @Location true
    //
    // @Switch with:<item> to only process the event when the player is holding a specified item in their main hand.
    //
    // @Cancellable true
    //
    // @Triggers when a player middle-clicks an entity to pick its item ("pick block" on an entity).
    // The client sends this in any gamemode and the server decides what to do with it, so it fires in survival too,
    // once per press (holding the button does not repeat it).
    // Only fires for entities that have a pick item at all - an item frame always does (its framed item, or the frame itself).
    //
    // @Context
    // <context.entity> returns the EntityTag that was picked.
    // <context.include_data> returns whether the player held the key to copy the entity's data (creative ctrl+middle-click).
    //
    // @Player Always.
    // -->

