        // <--[tag]
        // @attribute <PlayerTag.group_cooldown[<group>]>
        // @returns DurationTag
        // @plugin DenizenAdditions
        // @description
        // Returns the time left on the player's cooldown for an item cooldown group (a namespaced key, like "mypack:spell"), or 0 if there's none.
        // See <@link command groupcooldown> and <@link property ItemTag.use_cooldown>.
        // @example
        // - if <player.group_cooldown[mypack:spell].in_ticks> > 0:
        //     - narrate "Spell is on cooldown"
        // -->

        // <--[tag]
        // @attribute <PlayerTag.item_group_cooldown[<item>]>
        // @returns DurationTag
        // @plugin DenizenAdditions
        // @description
        // Returns the time left on the player's cooldown for the cooldown group of an item, or 0 if there's none.
        // The group is taken from the item's <@link property ItemTag.use_cooldown> component, or the item's type if it has none or no group set,
        // the same way vanilla and <@link command groupcooldown> pick it.
        // Unlike <@link tag PlayerTag.item_cooldown>, this respects custom cooldown groups.
        // @example
        // - if <player.item_group_cooldown[<player.item_in_hand>].in_ticks> > 0:
        //     - narrate "This item is on cooldown"
        // -->

