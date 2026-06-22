    // <--[command]
    // @Name MegDefaultState
    // @Syntax megdefaultstate [model:<active_model>] [type:<type>] [state:<state>] (lerpin:<duration>) (lerpout:<duration>) (speed:<#.#>)
    // @Required 3
    // @Short Changes a default animation on an active model.
    // @Group Megizen
    //
    // @Description
    // Changes one of a model's default animations to the specified animation state.
    // This command is similar to the "defaultstate" Mythic Mechanic.
    //
    // The 'type' argument must be a Model Engine default state type, for example 'idle', 'walk', 'jump_start', or 'death'.
    // The 'state' argument must be an animation name on the active model's blueprint, or a Model Engine animation ref.
    //
    // If 'lerpin', 'lerpout', or 'speed' are omitted, the current default values for the selected type are preserved.
    //
    // @Usage
    // Use to replace the walk default animation with the run animation.
    // - megdefaultstate model:<[model]> type:walk state:run
    // -->

