    // <--[property]
    // @object ItemTag
    // @name custom_model_data_map
    // @input MapTag
    // @plugin DenizenAdditions
    // @description
    // Controls the item's full custom model data component, unlike <@link property ItemTag.custom_model_data>, which only handles a single number. <@link language Item Components>.
    // Map keys are "floats" (ListTag of decimal numbers), "flags" (ListTag of booleans), "strings" (ListTag of text) and "colors" (ListTag of ColorTags).
    // Missing keys are treated as empty lists.
    // Item model definitions read these by index: "range_dispatch" for floats, "condition" for flags, "select" for strings, and "tints" for colors.
    // @mechanism
    // Provide no input to reset the item to its default value.
    // -->

