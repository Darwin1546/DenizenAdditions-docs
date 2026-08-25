    // <--[event]
    // @Events
    // <entity> walks
    //
    // @Group Entity
    //
    // @Location true
    //
    // @Cancellable true
    //
    // @Warning This event fires very very rapidly!
    //
    // @Triggers when an entity moves in the slightest.
    // Does not fire for players - use <@link event player walks> for player movement.
    // Note that the 'in:<area>' switch is checked against the location the entity moved to, so it also fires when an entity moves into the area.
    //
    // @Context
    // <context.entity> returns the EntityTag that moved.
    // <context.old_location> returns the LocationTag of where the entity was.
    // <context.new_location> returns the LocationTag of where the entity is.
    // <context.block_changed> returns an ElementTag(Boolean) of whether the entity moved to a different block.
    // <context.position_changed> returns an ElementTag(Boolean) of whether the entity's position changed (as opposed to only changing look direction).
    // <context.orientation_changed> returns an ElementTag(Boolean) of whether the entity's look direction (yaw/pitch) changed.
    // -->

