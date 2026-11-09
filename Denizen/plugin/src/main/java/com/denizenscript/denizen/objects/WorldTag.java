    // <--[ObjectType]
    // @Fork changed
    // @name WorldTag
    // @prefix w
    // @base ElementTag
    // @implements FlaggableObject
    // @ExampleTagBase player.location.world
    // @ExampleValues <player.location.world>,space
    // @ExampleForReturns
    // - adjust %VALUE% destroy
    // @ExampleForReturns
    // - adjust %VALUE% full_time:0
    // @format
    // The identity format for worlds is the name of the world it should be associated with.
    // For example, to reference the world named 'world1', use simply 'world1'.
    // World names are case insensitive.
    //
    // @description
    // A WorldTag represents a world on the server.
    //
    // This object type is flaggable.
    // Flags on this object type will be stored in the world folder in a file named 'denizen_flags.dat', like "server/world/denizen_flags.dat".
    // Since Minecraft 26, worlds other than the main one are folders inside it, like "server/world/dimensions/minecraft/my_world/denizen_flags.dat".
    // Flags from before a world was migrated to that layout are moved along with it automatically.
    //
    // @Matchable
    // WorldTag matchers, sometimes identified as "<world>":
    // "world" plaintext: always matches.
    // World name: matches if the world has the given world name, using advanced matchers.
    // "world_flagged:<flag>": a Flag Matchable for WorldTag flags.
    //
    // -->
