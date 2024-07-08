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
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THEROCK);
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

  }
}
