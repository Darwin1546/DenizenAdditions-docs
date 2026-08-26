        // <--[tag]
        // @attribute <EntityTag.has_target>
        // @returns ElementTag(Boolean)
        // @plugin DenizenAdditions
        // @description
        // Returns whether the entity currently has a target that is still valid.
        // Unlike just checking whether <@link tag EntityTag.target> returned anything, this also verifies the target is still spawned and alive.
        // That matters because an entity with its AI disabled can keep a stale target that has already died or been removed from the world.
        // Returns false for entities that can't hold a target at all.
        // -->

