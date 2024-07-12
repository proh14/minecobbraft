package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModelProvider extends FabricModelProvider {
  public ModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JAVASCRIPT_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PYTHON_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PYTHON_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THEROCK);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JAVA_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JAVA_ORE);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.WAND_OF_PROH, Models.HANDHELD);
    itemModelGenerator.register(ModItems.KAKTUS_DAGGER, Models.HANDHELD);

    itemModelGenerator.register(ModItems.JAVASCRIPT, Models.GENERATED);

    itemModelGenerator.register(ModItems.JAVASCRIPT_AXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVASCRIPT_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVASCRIPT_SWORD, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVASCRIPT_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVASCRIPT_SHOVEL, Models.HANDHELD);

    itemModelGenerator.registerArmor(((ArmorItem) ModItems.JAVASCRIPT_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.JAVASCRIPT_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.JAVASCRIPT_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.JAVASCRIPT_BOOTS));

    itemModelGenerator.register(ModItems.PYTHON, Models.GENERATED);

    itemModelGenerator.register(ModItems.PYTHON_AXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.PYTHON_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.PYTHON_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.PYTHON_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.PYTHON_SWORD, Models.HANDHELD);

    itemModelGenerator.registerArmor((ArmorItem) ModItems.PYTHON_HELMET);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.PYTHON_CHESTPLATE);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.PYTHON_LEGGINGS);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.PYTHON_BOOTS);

    itemModelGenerator.register(ModItems.JAVA, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVA_AXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVA_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVA_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVA_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.JAVA_SWORD, Models.HANDHELD);

    itemModelGenerator.registerArmor((ArmorItem) ModItems.JAVA_HELMET);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.JAVA_CHESTPLATE);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.JAVA_LEGGINGS);
    itemModelGenerator.registerArmor((ArmorItem) ModItems.JAVA_BOOTS);
  }
}
