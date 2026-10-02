        // <--[tag]
        // @attribute <PlayerTag.voice_deafened>
        // @returns ElementTag(Boolean)
        // @plugin DenizenAdditions, PlasmoVoice
        // @description
        // Returns whether the player has been stopped from hearing PlasmoVoice audio by <@link mechanism PlayerTag.voice_deafened>.
        // -->

        // <--[mechanism]
        // @object PlayerTag
        // @name voice_deafened
        // @input ElementTag(Boolean)
        // @plugin DenizenAdditions, PlasmoVoice
        // @description
        // Sets whether the player is stopped from hearing PlasmoVoice audio, while still being able to speak themselves.
        // This is the mirror of PlasmoVoice's own mute, which stops a player speaking but leaves them hearing, and which
        // its 'pv.' permissions only ever cover the speaking side of.
        // In memory only - does not survive a restart, and is cleared when the player is no longer deafened.
        // @tags
        // <PlayerTag.voice_deafened>
        // -->

