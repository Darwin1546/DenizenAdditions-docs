    // <--[event]
    // @Fork changed
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
    // <context.hand> returns an ElementTag of the hand being used to consume the item. Can be either HAND or OFF_HAND.
    // <context.replacement> returns the ItemTag set to replace the consumed item, if a custom replacement was set (the default leftover, like a bowl or a glass bottle, isn't available here).
    //
    // @Determine
    // item:ItemTag to change the item being consumed. Use with caution, if the player is eating a stack of items, this will replace the entire stack.
    // replacement:ItemTag to change the item left over after consuming, instead of the default one (like a bowl or a glass bottle).
    //
    // @Player Always.
    //
    // -->
