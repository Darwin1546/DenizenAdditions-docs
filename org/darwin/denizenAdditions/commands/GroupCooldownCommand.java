    // <--[command]
    // @Name groupcooldown
    // @Syntax groupcooldown [item:<item>|.../group:<group>|...] (duration:<duration>) (player:<player>)
    // @Required 1
    // @Maximum 4
    // @Plugin DenizenAdditions
    // @Short Puts a cooldown on an item cooldown group of a player.
    // @Group player
    //
    // @Description
    // Puts a cooldown on item cooldown groups, the same cooldown vanilla applies when an item with a <@link property ItemTag.use_cooldown> component is used.
    // All items sharing a group are on cooldown together, and the client shows the cooldown overlay on each of them.
    //
    // "item:" takes the group from the item's use_cooldown component, or the item's type if it has none or no group set.
    // If no duration is given, the "seconds" of the item's use_cooldown component is used - an item without the component then needs a duration.
    //
    // "group:" takes cooldown group keys directly (like "mypack:spell") and always needs a duration.
    //
    // A duration of 0 removes the cooldown.
    // Unlike <@link command itemcooldown>, this respects custom cooldown groups: 'itemcooldown stick' doesn't affect a stick in group "mypack:spell".
    //
    // The player defaults to the linked player.
    //
    // @Tags
    // <ItemTag.use_cooldown>
    //
    // @Usage
    // Puts the held item on the cooldown from its own use_cooldown component.
    // - groupcooldown item:<player.item_in_hand>
    //
    // @Usage
    // Puts a 5 second cooldown on the "mypack:spell" group.
    // - groupcooldown group:mypack:spell duration:5s
    //
    // @Usage
    // Removes the cooldown from the "mypack:spell" group.
    // - groupcooldown group:mypack:spell duration:0
    // -->

