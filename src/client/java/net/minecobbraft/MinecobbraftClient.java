package net.minecobbraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecobbraft.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class MinecobbraftClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUST_ROSE, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RUST_ROSE, RenderLayer.getCutout());
  }
}
