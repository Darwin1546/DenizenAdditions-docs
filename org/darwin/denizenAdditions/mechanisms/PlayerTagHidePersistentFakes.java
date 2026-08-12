        // <--[mechanism]
        // @object PlayerTag
        // @name hide_persistent_fakes
        // @input ElementTag
        // @plugin DenizenAdditions
        // @description
        // Hides persistentfake entities (see <@link command persistentfake>) whose id matches the given <@link language Advanced Object Matching> matcher from this player.
        // Already-visible matching fakes are despawned for this player immediately, and any new ones that would otherwise be sent to them later (e.g. on chunk load) are skipped too.
        // The matcher stays active in memory only (does not survive a relog/restart) until reversed with <@link mechanism PlayerTag.show_persistent_fakes>, using the exact same matcher text.
        // -->

