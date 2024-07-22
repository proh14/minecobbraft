package net.minecobbraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.entity.ModEntities;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.model.*;
import net.minecobbraft.entity.renderer.*;
import net.minecraft.client.render.RenderLayer;

public class MinecobbraftClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUST_ROSE, RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RUST_ROSE, RenderLayer.getCutout());

    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RUST_CRAB, RustCrabModel::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.RUST_CRAB, RustCrabRenderer::new);

    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DETECTIVEKAKTUS, DetectiveKaktusModel::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.DETECTIVEKAKTUS, DetectiveKaktusRenderer::new);

    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.LOCALTEXAN, LocalTexanModel::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.LOCALTEXAN, LocalTexanRenderer::new);

    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PROH14, Proh14Model::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.PROH14, Proh14Renderer::new);

    EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TSODING, TsodingModel::getTexturedModelData);
    EntityRendererRegistry.register(ModEntities.TSODING, TsodingRenderer::new);
  }
}
