package net.minecobbraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecobbraft.datagen.*;
import net.minecobbraft.world.ModConfiguredFeatures;
import net.minecobbraft.world.ModPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class DataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

    pack.addProvider(ModModelProvider::new);
    pack.addProvider(ModBlockTagProvider::new);
    pack.addProvider(ModLootTableProvider::new);
    pack.addProvider(ModRecipeProvider::new);
    pack.addProvider(ModWorldGenerator::new);
    pack.addProvider(ModAchievementsProvider::new);
  }

  @Override
  public void buildRegistry(RegistryBuilder registryBuilder) {
    registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
    registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
  }
}
