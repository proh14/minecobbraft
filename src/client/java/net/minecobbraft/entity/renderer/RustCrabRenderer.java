package net.minecobbraft.entity.renderer;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.model.RustCrabModel;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RustCrabRenderer extends MobEntityRenderer<RustCrabEntity, RustCrabModel<RustCrabEntity>> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/entity/rust_crab.png");

  public RustCrabRenderer(EntityRendererFactory.Context context) {
    super(context, new RustCrabModel<>(context.getPart(ModModelLayers.RUST_CRAB)), 0.4f);
  }

  @Override
  public Identifier getTexture(RustCrabEntity entity) {
    return TEXTURE;
  }

  @Override
  public void render(RustCrabEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
    if (livingEntity.isBaby())
      matrixStack.scale(0.5f, 0.5f, 0.5f);
    super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
