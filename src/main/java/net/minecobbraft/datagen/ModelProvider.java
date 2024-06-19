package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecobbraft.item.Items;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
  public ModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) { }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(Items.WAND_OF_PROH, Models.GENERATED);
    itemModelGenerator.register(Items.KAKTUS_DAGGER, Models.GENERATED);
  }
}
