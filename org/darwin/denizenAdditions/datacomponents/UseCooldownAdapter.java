    // <--[property]
    // @object ItemTag
    // @name use_cooldown
    // @input MapTag
    // @plugin DenizenAdditions
    // @description
    // Controls the cooldown an item puts on its cooldown group when it's used. <@link language Item Components>.
    // Map keys are "seconds" (decimal above 0, required) and "cooldown_group" (namespaced key, optional).
    // Without a "cooldown_group" the item's own type is used as the group, so it shares the cooldown with every item of that type.
    // Items with the same group share one cooldown - use <@link command groupcooldown> to put one on a group from a script.
    // @mechanism
    // Provide no input to reset the item to its default value.
    // -->

