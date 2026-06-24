    // <--[command]
    // @Name sound
    // @Syntax sound [sound:<name>] [emitter:<location>/<entity>] (sound_category:<category>) (volume:<#.#>) (pitch:<#.#>)
    // @Required 2
    // @Maximum 5
    // @Short Plays a vanilla or resource pack sound from a location or entity.
    // @Group world
    //
    // @Description
    // Plays a sound using the provided emitter.
    //
    // If the emitter is a LocationTag, the sound is played from that static location.
    // If the emitter is an EntityTag, the sound is played through Paper's entity sound source, so the sound follows the entity while it plays.
    //
    // The 'sound' argument may be a vanilla sound name/key or a custom resource pack sound key.
    // The 'sound_category' argument defaults to MASTER.
    // The 'volume' and 'pitch' arguments default to 1.
    //
    // @Usage
    // Play a custom resource pack sound from an entity.
    // - sound sound:custom:engine emitter:<player> sound_category:ambient volume:1 pitch:1
    //
    // @Usage
    // Play a vanilla sound from a location.
    // - sound sound:entity.player.levelup emitter:<player.location> volume:1 pitch:1
    // -->

