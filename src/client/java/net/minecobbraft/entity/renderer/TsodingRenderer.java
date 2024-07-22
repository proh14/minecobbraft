package net.minecobbraft.entity.renderer;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.custom.TsodingEntity;
import net.minecobbraft.entity.model.TsodingModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class TsodingRenderer extends MobEntityRenderer<TsodingEntity, TsodingModel<TsodingEntity>> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/entity/tsoding.png");

  public TsodingRenderer(EntityRendererFactory.Context context) {
    super(context, new TsodingModel<>(context.getPart(ModModelLayers.TSODING)), 0.5f);
  }

  @Override
  public Identifier getTexture(TsodingEntity entity) {
    return TEXTURE;
  }

  @Override
  public void render(TsodingEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
    if (livingEntity.isBaby()) matrixStack.scale(0.5f, 0.5f, 0.5f);
    super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
