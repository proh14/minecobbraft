package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
  public ModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JS_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THEROCK);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.WAND_OF_PROH, Models.GENERATED);
    itemModelGenerator.register(ModItems.KAKTUS_DAGGER, Models.GENERATED);

    itemModelGenerator.register(ModItems.JAVASCRIPT, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVASCRIPT_AXE, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVASCRIPT_PICKAXE, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVASCRIPT_SWORD, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVASCRIPT_HOE, Models.GENERATED);
    itemModelGenerator.register(ModItems.JAVASCRIPT_SHOVEL, Models.GENERATED);
  }
}
