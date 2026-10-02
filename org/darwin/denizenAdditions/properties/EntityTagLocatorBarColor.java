    // <--[property]
    // @object EntityTag
    // @name locator_bar_color
    // @input ColorTag
    // @plugin DenizenAdditions
    // @description
    // The color of the entity's icon on the locator bar, if it has been given one.
    // With no color of its own the icon falls back to the entity's team color, and to the style's own color if it has no team.
    // For the mechanism: provide no input to go back to that fallback.
    // The alpha channel is dropped - the client is never sent it.
    // This only controls how the icon looks - an entity is only on the locator bar at all while its 'waypoint_transmit_range'
    // attribute is above zero, see <@link tag EntityTag.attribute_base_values>.
    // @tags
    // <EntityTag.locator_bar_color>
    // -->

