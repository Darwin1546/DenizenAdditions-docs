    // <--[property]
    // @object ItemTag
    // @name consumable
    // @input MapTag
    // @plugin DenizenAdditions
    // @description
    // Controls how an item is consumed when held down. <@link language Item Components>.
    // Map keys are "consume_seconds" (decimal), "animation" (one of: none, eat, drink, block, bow, trident, crossbow, spyglass, toot_horn, brush, bundle, spear),
    // "sound" (namespaced key), "has_consume_particles" (boolean), and "effects" (a ListTag of MapTags).
    //
    // Each entry of "effects" has a "type" key choosing what it does, matching the vanilla consume effect names:
    // "apply_effects" - keys "effects" (a ListTag of potion effect maps, same format as <@link tag EntityTag.effects_data>) and optionally "probability" (decimal 0.0 to 1.0).
    // "remove_effects" - key "effects" (a ListTag of potion effect type names, or a single '#'-prefixed effect tag key).
    // "clear_all_effects" - no further keys.
    // "play_sound" - key "sound" (namespaced key).
    // "teleport_randomly" - key "diameter" (decimal).
    // @mechanism
    // Provide no input to reset the item to its default value.
    // -->

