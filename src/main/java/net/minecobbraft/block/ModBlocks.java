package net.minecobbraft.block;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.sound.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
  public static final Block JAVASCRIPT_ORE = registerBlock("javascript_ore",
    new ExperienceDroppingBlock(UniformIntProvider.create(0, 0), Block.Settings.copy(Blocks.STONE)));
  public static final Block THEROCK = registerBlock("therock",
    new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK).sounds(ModSounds.THEROCK_SOUNDS)));

  public static final Block PYTHON_ORE = registerBlock("python_ore",
    new ExperienceDroppingBlock(UniformIntProvider.create(1, 4), Block.Settings.copy(Blocks.IRON_ORE)));
  public static final Block DEEPSLATE_PYTHON_ORE = registerBlock("deepslate_python_ore",
    new ExperienceDroppingBlock(UniformIntProvider.create(2, 6), Block.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
  public static final Block RUST_ROSE = registerBlock("rust_rose", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 5, Block.Settings.copy(Blocks.POPPY).noCollision())); 
  public static final Block POTTED_RUST_ROSE = registerBlock("potted_rust_rose", new FlowerPotBlock(Blocks.POPPY, Block.Settings.copy(Blocks.POPPY)));

  public static final Block JAVA_ORE = registerBlock("java_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), Block.Settings.copy(Blocks.DIAMOND_ORE)));
  public static final Block DEEPSLATE_JAVA_ORE = registerBlock("deepslate_java_ore", new ExperienceDroppingBlock(UniformIntProvider.create(4, 10), Block.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

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
