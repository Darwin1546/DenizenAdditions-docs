    // <--[language]
    // @name Brigadier Argument Types
    // @group Script Container System
    // @description
    // The 'type' values available to arguments in <@link language Brigadier Command Script Containers>,
    // and what each one becomes in <context.(argument name)>.
    //
    // Text:
    // - word: a single word (no spaces). ElementTag.
    // - string: a single word, or "a quoted phrase". ElementTag.
    // - greedy: everything until the end of the input. Must be the last argument. ElementTag.
    // - text: a JSON text component, as in /tellraw. ElementTag of Denizen formatted text.
    //
    // Numbers ('min' and 'max' keys are optional and checked by the client):
    // - integer, long, float, double: ElementTag(Number).
    // - bool: true or false. ElementTag(Boolean).
    //
    // Game objects:
    // - player: one player, by name or a single-player selector. PlayerTag.
    // - offline_player: any player that ever joined, online or not, by name. No selectors.
    //   Suggests names by itself, unless the node has its own 'suggest': online players first, then recently seen ones
    //   (the server's usercache - 'user-cache-size' in spigot.yml), up to 100. Players beyond that are still accepted when typed. PlayerTag.
    //   An unknown name fails with the vanilla "Unknown player" error pointing at the argument, even if later arguments are missing.
    // - players: any number of players, by name or selector. ListTag(PlayerTag).
    // - entity: one entity, by selector or UUID. EntityTag.
    // - entities: any number of entities. ListTag(EntityTag).
    // - block_position: block coordinates, with ~ and ^ support. LocationTag.
    // - position: exact coordinates, with ~ and ^ support. LocationTag.
    // - angle: a yaw angle, with ~ support. ElementTag(Decimal).
    // - block_state: a block with optional states, like oak_stairs[facing=north]. MaterialTag.
    // - item: an item with optional components, like diamond_sword[damage=5]. ItemTag.
    // - world: a world (dimension) key. WorldTag.
    // - gamemode: a game mode name. ElementTag.
    // - color: a named chat color, like 'red'. ElementTag.
    // - hex_color: a hex color, like 'FF0000'. ColorTag.
    // - uuid: a UUID. ElementTag.
    // - key: a namespaced key, like 'minecraft:stone'. ElementTag.
    // - duration: a duration in Denizen's format, like '5s', '1.5h' or '30' (seconds). Units: t, s, m, h, d, w, y.
    //   'infinite' is accepted too and, as everywhere in Denizen, is just a zero duration.
    //   Suggests '1t' to '1y' and 'infinite' while empty, then the units once a number is typed.
    //   Optional 'min' key, also a duration like '1s' - any min above zero rejects 'infinite' as well. DurationTag.
    // - time: a duration in the vanilla format, like '5s', '2d' or '100' (ticks). Units: t, s, d. Optional 'min' key, in ticks. DurationTag.
    // - resource: an entry of a registry, chosen with the 'registry' key (like 'enchantment', 'biome', 'entity_type',
    //   or a full registry name like 'worldgen/biome'). The client suggests every entry. ElementTag of its key.
    // -->

