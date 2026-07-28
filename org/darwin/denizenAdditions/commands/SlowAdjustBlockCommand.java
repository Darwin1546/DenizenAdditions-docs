    // <--[command]
    // @Name SlowAdjustBlock
    // @Syntax slowadjustblock [<location>|...] [<mechanism>](:<value>) (no_physics) (max_delay_ms:<#>)
    // @Required 2
    // @Maximum 4
    // @Short Adjusts a mechanism on the material of a block at the location, spread out over multiple ticks.
    // @Group world
    //
    // @Description
    // Same as <@link command adjustblock>, but instead of applying the mechanism to every location within a single tick,
    // it spreads the work out across multiple ticks, similar to how "modifyblock ... delayed" throttles its own work.
    // This is meant for large location lists, to avoid a single large lag spike.
    //
    // Use the "no_physics" argument to indicate that the change should not apply a physics update.
    // If not specified, physics will apply to the block and nearby blocks.
    //
    // Optionally, specify 'max_delay_ms' to control how many milliseconds this command may spend per tick (defaults to 50).
    //
    // The slowadjustblock command is ~waitable. Refer to <@link language ~waitable>.
    //
    // @Tags
    // <LocationTag.material>
    //
    // @Usage
    // Use to slowly turn every block in a huge list of locations into stone.
    // - slowadjustblock <[locations]> material:stone
    // -->

