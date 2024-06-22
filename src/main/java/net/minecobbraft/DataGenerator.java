package net.minecobbraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecobbraft.datagen.BlockTagProvider;
import net.minecobbraft.datagen.ModelProvider;

public class DataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

    pack.addProvider(ModelProvider::new);
    pack.addProvider(BlockTagProvider::new);
  }
}
