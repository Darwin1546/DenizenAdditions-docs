    // <--[event]
    // @Fork changed
    // @Events
    // player (right|left) clicks <block>
    //
    // @Cancellable true
    //
    // @Group Player
    //
    // @Warning this event may in some cases double-fire, requiring usage of the 'ratelimit' command (like 'ratelimit <player> 1t') to prevent doubling actions.
    // @Warning this sometimes fires at unexpected times, eg when dropping an item.
    //
    // @Switch with:<item> to only process the event if a specified item was held.
    // @Switch using:hand/off_hand/either_hand to only process the event if the specified hand was used to click.
    // @Switch type:<material> to only run if the block clicked matches the material input.
    //
    // @Location true
    //
    // @Triggers when a player clicks on a block or in the air.
    // The "in:<area>" switch checks the clicked block, or the player's location when clicking in the air.
    // The "location_flagged:<flag>" switch only checks the clicked block, so it never matches clicks in the air.
    //
    // @Context
    // <context.item> returns the ItemTag the player is clicking with.
    // <context.location> returns the LocationTag of the clicked block, if any.
    // <context.relative> returns a LocationTag of the block in front of the clicked face, if a block was clicked.
    // <context.interaction_point> returns a LocationTag of the exact point that was clicked on the block. Only available when right clicking a block.
    // <context.hit_face> returns a LocationTag vector of the clicked block face (like '0,1,0' for the top of a block), if a block was clicked.
    // <context.click_type> returns an ElementTag of the Bukkit API click type <@link url https://jd.papermc.io/paper/org/bukkit/event/block/Action.html>.
    // <context.hand> returns an ElementTag of the used hand, can be either HAND or OFF_HAND.
    //
    // @Determine
    // "USE_BLOCK:<ElementTag(Boolean)>" to set whether the clicked block's own interaction (like opening a door or a chest) happens, regardless of the held item.
    // "USE_ITEM:<ElementTag(Boolean)>" to set whether the held item is used, regardless of the clicked block.
    // Cancelling or uncancelling the event afterwards (including from another script) overrides both.
    //
    // @Player Always.
    //
    // -->
