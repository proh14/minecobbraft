package net.minecobbraft.entity.renderer;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.custom.LocalTexanEntity;
import net.minecobbraft.entity.model.LocalTexanModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class LocalTexanRenderer extends MobEntityRenderer<LocalTexanEntity, LocalTexanModel<LocalTexanEntity>> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/entity/localtexan.png");

  public LocalTexanRenderer(EntityRendererFactory.Context context) {
    super(context, new LocalTexanModel<>(context.getPart(ModModelLayers.LOCALTEXAN)), 0.5f);
  }

  @Override
  public Identifier getTexture(LocalTexanEntity entity) {
    return TEXTURE;
  }

  @Override
  public void render(LocalTexanEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
    if (livingEntity.isBaby()) matrixStack.scale(0.5f, 0.5f, 0.5f);
    super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
