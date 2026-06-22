        // <--[mechanism]
        // @object PlayerTag
        // @name gcrawl
        // @input ElementTag(Boolean)
        // @plugin GSit, DenizenAdditions
        // @description
        // Starts or stops crawling through GSit.
        // -->

        // <--[mechanism]
        // @object PlayerTag
        // @name gpose
        // @input ElementTag
        // @plugin GSit, DenizenAdditions
        // @description
        // Sets the player's GSit pose.
        // Valid poses are LAY, LAY_BACK, BELLYFLOP, and SPIN.
        // Leave the input empty to remove the current GSit pose.
        // -->

        // <--[tag]
        // @attribute <PlayerTag.gcrawl>
        // @returns ElementTag(Boolean)
        // @plugin GSit, DenizenAdditions
        // @description
        // Returns whether the player is currently crawling through GSit.
        // -->

        // <--[tag]
        // @attribute <PlayerTag.gpose>
        // @returns ElementTag
        // @plugin GSit, DenizenAdditions
        // @description
        // Returns the player's current GSit pose, if any.
        // -->

