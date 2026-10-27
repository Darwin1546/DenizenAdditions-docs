        // <--[mechanism]
        // @object PlayerTag
        // @name gcrawl
        // @input ElementTag(Boolean)
        // @plugin GSit, DenizenAdditions
        // @description
        // Starts or stops crawling through GSit.
        // @tags
        // <PlayerTag.gcrawl>
        // -->

        // <--[mechanism]
        // @object PlayerTag
        // @name gpose
        // @input ElementTag
        // @plugin GSit, DenizenAdditions
        // @description
        // Sets the player's GSit pose.
        // Valid poses are LAY, LEGS_UP, BELLYFLOP, and SPIN.
        // Leave the input empty to remove the current GSit pose.
        // @tags
        // <PlayerTag.gpose>
        // -->

        // <--[tag]
        // @attribute <PlayerTag.gcrawl>
        // @returns ElementTag(Boolean)
        // @plugin GSit, DenizenAdditions
        // @mechanism PlayerTag.gcrawl
        // @description
        // Returns whether the player is currently crawling through GSit.
        // -->

        // <--[tag]
        // @attribute <PlayerTag.gpose>
        // @returns ElementTag
        // @plugin GSit, DenizenAdditions
        // @mechanism PlayerTag.gpose
        // @description
        // Returns the player's current GSit pose, if any.
        // -->

