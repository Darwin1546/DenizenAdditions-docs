        // <--[tag]
        // @attribute <MythicMobsMobTag.owner>
        // @returns PlayerTag
        // @plugin DenizenAdditions, Depenizen, MythicMobs
        // @description
        // Returns the MythicMob's owner, or null if it has none.
        // This is the value MythicMobs' own 'setowner' skill mechanic writes.
        // MythicMobs stores only a UUID, so if something set a non-player as the owner, the returned PlayerTag will
        // carry that UUID and won't resolve to a real player.
        // -->

        // <--[mechanism]
        // @object MythicMobsMobTag
        // @name owner
        // @input PlayerTag
        // @plugin DenizenAdditions, Depenizen, MythicMobs
        // @description
        // Sets the MythicMob's owner, equivalent to its own 'setowner' skill mechanic.
        // Give no input to clear the owner, equivalent to 'removeowner'.
        // Note that MythicMobs ties this to vanilla taming for wolf-based mobs: setting an owner also tames the wolf to
        // that player, but only if they are online - it stores the UUID either way and does not re-tame on their next login.
        // @tags
        // <MythicMobsMobTag.owner>
        // -->

