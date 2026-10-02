    // <--[event]
    // @Events
    // player picks <block>
    //
    // @Group Player
    //
    // @Location true
    //
    // @Switch with:<item> to only process the event when the player is holding a specified item in their main hand.
    //
    // @Cancellable true
    //
    // @Triggers when a player middle-clicks a block to pick its item ("pick block").
    // The client sends this in any gamemode and the server decides what to do with it, so it fires in survival too,
    // once per press (holding the button does not repeat it).
    //
    // @Context
    // <context.location> returns the LocationTag of the picked block.
    // <context.include_data> returns whether the player held the key to copy the block's data (creative ctrl+middle-click).
    //
    // @Player Always.
    // -->

