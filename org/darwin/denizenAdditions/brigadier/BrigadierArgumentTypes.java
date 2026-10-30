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
    // - time: a duration like '5s', '2d' or '100' (ticks). Optional 'min' key, in ticks. DurationTag.
    // - resource: an entry of a registry, chosen with the 'registry' key (like 'enchantment', 'biome', 'entity_type',
    //   or a full registry name like 'worldgen/biome'). The client suggests every entry. ElementTag of its key.
    // -->

