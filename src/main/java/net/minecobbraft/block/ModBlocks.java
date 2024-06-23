package net.minecobbraft.block;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.sound.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
  public static final Block JS_ORE =
          registerBlock("js_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 0), Block.Settings.copy(Blocks.STONE)));
  public static final Block THEROCK = registerBlock("therock", new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK).sounds(ModSounds.THEROCK_SOUNDS)));

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
