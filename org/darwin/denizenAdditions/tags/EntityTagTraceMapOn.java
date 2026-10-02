        // <--[tag]
        // @attribute <EntityTag.trace_map_on[<entity>]>
        // @returns MapTag
        // @plugin DenizenAdditions
        // @description
        // Returns where on the given item frame's map this entity is looking, as keys "x" and "y" in the range 0 to 127,
        // or null if it is not looking at that frame's map.
        //
        // Same geometry as <@link tag EntityTag.trace_framed_map>, including the correction for a rotated frame,
        // but for one frame that is already known instead of searching for one.
        // That tag pulls every entity in a 200x200x200 box to find its target, which is far too much to repeat
        // every tick while a player drags a brush across a canvas.
        // -->

