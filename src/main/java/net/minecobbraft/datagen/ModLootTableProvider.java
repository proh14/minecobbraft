package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
  public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    addDrop(ModBlocks.JAVASCRIPT_ORE, oreDrops(ModBlocks.JAVASCRIPT_ORE, ModItems.JAVASCRIPT));
    addDrop(ModBlocks.PYTHON_ORE, oreDrops(ModBlocks.PYTHON_ORE, ModItems.PYTHON));
    addDrop(ModBlocks.DEEPSLATE_PYTHON_ORE, oreDrops(ModBlocks.DEEPSLATE_PYTHON_ORE, ModItems.PYTHON));
    addDrop(ModBlocks.THEROCK);
    addDrop(ModBlocks.JAVA_ORE, oreDrops(ModBlocks.JAVA_ORE, ModItems.JAVA));
    addDrop(ModBlocks.DEEPSLATE_JAVA_ORE, oreDrops(ModBlocks.DEEPSLATE_JAVA_ORE, ModItems.JAVA));
    addDrop(ModBlocks.DEEPSLATE_C_ORE, oreDrops(ModBlocks.DEEPSLATE_C_ORE, ModItems.C));
    addDrop(ModBlocks.RUST_ROSE);
    addPottedPlantDrops(ModBlocks.POTTED_RUST_ROSE);
  }
}
