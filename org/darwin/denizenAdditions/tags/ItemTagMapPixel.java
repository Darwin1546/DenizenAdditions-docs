        // <--[tag]
        // @attribute <ItemTag.map_pixel[x=<#>;y=<#>]>
        // @returns ColorTag
        // @plugin DenizenAdditions
        // @description
        // Returns the color of one pixel of this map item, read straight from the map's vanilla pixel data -
        // the same data <@link command mapdraw> writes into. 0,0 is the top left corner, maps are 128x128.
        // Takes a map with "x" and "y" keys, so the result of <@link tag EntityTag.trace_map_on> can be passed in as-is.
        // Returns null if the item is not a map, the point is outside the map, or the pixel is transparent (never drawn on).
        // The color is always one of the map palette's colors, so drawing it back with mapdraw gives the exact same pixel.
        // -->

