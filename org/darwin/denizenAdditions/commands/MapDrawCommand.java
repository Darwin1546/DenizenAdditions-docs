    // <--[command]
    // @Name MapDraw
    // @Syntax mapdraw [id:<#>/new:<world>/undo:<key>] (pixel/dot/line/rectangle/fill/floodfill/image:<image>) (x:<#>) (y:<#>) (to_x:<#>) (to_y:<#>) (radius:<#>) (width:<#>) (height:<#>) (color:<color>) (record:<key> (begin)) (send:<player>|...)
    // @Required 1
    // @Maximum 15
    // @Short Draws directly into a map's vanilla pixel data.
    // @Group item
    //
    // @Description
    // Writes straight into the map's own color array, the same one vanilla uses and saves.
    //
    // This is deliberately not the <@link command map> command: that one attaches a Denizen map renderer,
    // whose objects are re-rendered in full on every change, are written into maps.yml, and grow without bound.
    // For a map that is drawn on many times - a player-painted canvas, for example - that does not scale.
    //
    // Because the drawing lives in the map's vanilla data, it is saved and reloaded by the game itself
    // (in "world/data/map_<id>.dat"), so no separate storage, image file or renderer is needed.
    //
    // Do NOT use the "map" command on a map drawn by this command: the Denizen renderer it attaches
    // renders once, caches the result and stops looking at the vanilla data, freezing the picture.
    //
    // Maps drawn on this way should be given to players with "map_locked=true". Without it, vanilla
    // rescans the terrain into the map whenever a player holds it, wiping the drawing.
    //
    // Maps are always 128x128, with 0,0 at the top left corner. Anything outside is clipped away.
    //
    // Colors are matched to the map palette, which is fairly limited - the drawn color will be the
    // closest one available. Fully transparent input is skipped rather than drawn.
    //
    // The shapes are:
    // - "pixel" sets a single pixel at x,y.
    // - "dot" fills a disc centered on x,y, covering every pixel within 'radius' (radius 0 is one pixel).
    // - "line" drags a 'radius' sized dot from x,y to to_x,to_y, for joining up sparse input into a stroke.
    // - "rectangle" fills 'width' by 'height' pixels starting at x,y.
    // - "fill" covers the entire map, ignoring x/y.
    // - "floodfill" recolors the connected area of same-colored pixels around x,y, like a paint bucket.
    // - "image:<image>" draws an ImageTag with its top left corner at x,y.
    //
    // Specify "new:<world>" instead of an id to create a fresh map, which is then drawn on the same way.
    //
    // Specify "record:<key>" to make the change undoable. Every pixel the command changes is remembered, with its
    // previous color, in the key's current action - the key is whatever the undo stack belongs to, usually a player's UUID.
    // Several commands add up into one action until "begin" starts a new one, so a whole brush stroke can be undone at once.
    // "begin" can be given on its own, as "mapdraw record:<key> begin", to open the next action before drawing anything.
    // Drawing on a different map than the current action's also starts a new action.
    // Each key keeps its last 15 actions, in memory only: the history is gone after a restart.
    //
    // Specify "undo:<key>" instead of an id to roll back that key's last action and drop it from the history.
    // Only the pixels the action itself changed are restored, so other drawing on the same map survives,
    // unless it was painted over the very same pixels afterwards.
    //
    // Optionally specify "send" with a list of players to push the map to them immediately.
    // Without it the change still reaches viewers, but only on the next item frame sync tick
    // (see "item-frame-cursor-update-interval" in the Paper config, 10 ticks by default).
    //
    // @Tags
    // <entry[saveName].created_map> returns the ID of the map created by the 'new:' argument, if used.
    // <entry[saveName].undone_map> returns the ID of the map rolled back by the 'undo:' argument, if there was anything to undo.
    //
    // @Usage
    // Use to create a blank off-white canvas and hand it to the player.
    // - mapdraw new:<player.world> fill color:233,226,208 save:canvas
    // - give filled_map[map=<entry[canvas].created_map>;map_locked=true]
    //
    // @Usage
    // Use to put a red blob on a map and show it to the player at once.
    // - mapdraw id:<[map_id]> dot x:64 y:64 radius:3 color:red send:<player>
    //
    // @Usage
    // Use to draw an undoable stroke as one action, then take it back.
    // - mapdraw id:<[map_id]> dot x:10 y:10 radius:1 color:black record:<player.uuid> begin
    // - mapdraw id:<[map_id]> line x:10 y:10 to_x:40 to_y:20 radius:1 color:black record:<player.uuid>
    // - mapdraw undo:<player.uuid> send:<player>
    // -->

