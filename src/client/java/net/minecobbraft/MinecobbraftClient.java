package net.minecobbraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.entity.ModEntities;
import net.minecobbraft.entity.client.ModModelLayers;
import net.minecobbraft.entity.client.RustCrabModel;
import net.minecobbraft.entity.client.RustCrabRenderer;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecraft.client.render.RenderLayer;

public class MinecobbraftClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUST_ROSE, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RUST_ROSE, RenderLayer.getCutout());
    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RUST_CRAB, RustCrabModel::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.RUST_CRAB, RustCrabRenderer::new);

    FabricDefaultAttributeRegistry.register(ModEntities.RUST_CRAB, RustCrabEntity.createRustCrabAttributes());
  }
}
