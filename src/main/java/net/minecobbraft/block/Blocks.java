package net.minecobbraft.block;

import net.minecobbraft.Minecobbraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Blocks {

  public static final Block JS_ORE = registerBlock("js_ore", new Block(Block.Settings.copy(net.minecraft.block.Blocks.IRON_BLOCK)));


  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(Minecobbraft.MOD_ID, name), block);
  }

  private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, Identifier.of(Minecobbraft.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
  }

  public static void registerModBlocks() {
    Minecobbraft.LOGGER.info("Registering ModBlocks for " + Minecobbraft.MOD_ID);
  }
}
