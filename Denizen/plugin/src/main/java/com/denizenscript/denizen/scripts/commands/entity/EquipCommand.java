    // <--[command]
    // @Fork changed
    // @Name Equip
    // @Syntax equip (<entity>|...) (hand:<item>) (offhand:<item>) (head:<item>) (chest:<item>) (legs:<item>) (boots:<item>) (saddle:<item>) (body:<item>)
    // @Required 1
    // @Maximum 9
    // @Short Equips items and armor on a list of entities.
    // @Group entity
    //
    // @Description
    // This command equips an item or armor to an entity or list of entities to the specified slot(s).
    // Set the item to 'air' to unequip any slot.
    //
    // Offline players are supported for the 'hand', 'offhand', 'head', 'chest', 'legs', and 'boots' slots, by editing their stored world data.
    // The 'hand' slot writes to the slot the offline player last had selected. The 'saddle' and 'body' slots don't apply to players and are ignored for them.
    //
    // @Tags
    // <EntityTag.equipment>
    // <InventoryTag.equipment>
    //
    // @Usage
    // Use to equip a stone block on the player's head.
    // - equip <player> head:stone
    //
    // @Usage
    // Use to equip an iron helmet on two defined players.
    // - equip <[player]>|<[someplayer]> head:iron_helmet
    //
    // @Usage
    // Use to unequip all armor off the player.
    // - equip <player> head:air chest:air legs:air boots:air
    //
    // @Usage
    // Use to equip a saddle on the horse the player is riding.
    // - equip <player.vehicle> saddle:saddle
    //
    // @Usage
    // Use to equip a saddle on all nearby pigs.
    // - equip <player.location.find_entities[pig].within[10]> saddle:saddle
    //
    // @Usage
    // Use to equip a horse with iron horse armor.
    // - equip <[horse]> body:iron_horse_armor
    //
    // @Usage
    // Use to equip an offline player with a diamond helmet.
    // - equip <server.match_offline_player[steve]> head:diamond_helmet
    // -->
