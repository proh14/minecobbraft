package net.minecobbraft.entity.renderer;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.model.DetectiveKaktusModel;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.custom.DetectiveKaktusEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DetectiveKaktusRenderer extends MobEntityRenderer<DetectiveKaktusEntity, DetectiveKaktusModel<DetectiveKaktusEntity>> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/entity/detectivekaktus.png");

  public DetectiveKaktusRenderer(EntityRendererFactory.Context context) {
    super(context, new DetectiveKaktusModel<>(context.getPart(ModModelLayers.DETECTIVEKAKTUS)), 0.8f);
  }

  @Override
  public Identifier getTexture(DetectiveKaktusEntity entity) {
    return TEXTURE;
  }

  @Override
  public void render(DetectiveKaktusEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
    if (livingEntity.isBaby())
      matrixStack.scale(0.5f, 0.5f, 0.5f);
    super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
