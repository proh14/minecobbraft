package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecobbraft.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
  public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.JAVASCRIPT_ORE)
            .add(ModBlocks.THEROCK)
            .add(ModBlocks.PYTHON_ORE)
            .add(ModBlocks.DEEPSLATE_PYTHON_ORE)
            .add(ModBlocks.JAVA_ORE)
            .add(ModBlocks.DEEPSLATE_JAVA_ORE)
            .add(ModBlocks.DEEPSLATE_C_ORE);
    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.JAVASCRIPT_ORE)
            .add(ModBlocks.PYTHON_ORE)
            .add(ModBlocks.DEEPSLATE_PYTHON_ORE);
    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.JAVA_ORE)
            .add(ModBlocks.DEEPSLATE_JAVA_ORE)
            .add(ModBlocks.DEEPSLATE_C_ORE);
  }
}
