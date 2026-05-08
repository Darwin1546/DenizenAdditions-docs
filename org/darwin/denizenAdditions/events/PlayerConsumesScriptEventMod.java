    // <--[event]
    // @Events
    // player consumes <item>
    //
    // @Group Player
    //
    // @Location true
    //
    // @Cancellable true
    //
    // @Triggers when a player consumes (eats/drinks) an item (like food or potions).
    //
    // @Context
    // <context.item> returns the ItemTag.
    // <context.hand> returns an ElementTag of the hand being used to consume the item. Can be either HAND or OFF_HAND. Requires a 1.19+ server.
    // <context.replacement> returns the ItemTag that will replace the consumed item.
    //
    // @Determine
    // item:ItemTag to change the item being consumed. Use with caution, if the player is eating a stack of items, this will replace the entire stack.
    // replacement:ItemTag to change the remaining item after original item being consumed.
    //
    // @Player Always.
    //
    // -->

