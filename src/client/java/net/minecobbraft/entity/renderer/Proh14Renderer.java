package net.minecobbraft.entity.renderer;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.ModModelLayers;
import net.minecobbraft.entity.custom.Proh14Entity;
import net.minecobbraft.entity.model.Proh14Model;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class Proh14Renderer extends MobEntityRenderer<Proh14Entity, Proh14Model<Proh14Entity>> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/entity/proh14.png");

  public Proh14Renderer(EntityRendererFactory.Context context) {
    super(context, new Proh14Model<>(context.getPart(ModModelLayers.PROH14)), 0.5f);
  }

  @Override
  public Identifier getTexture(Proh14Entity entity) {
    return TEXTURE;
  }

  @Override
  public void render(Proh14Entity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
    if (livingEntity.isBaby()) matrixStack.scale(0.5f, 0.5f, 0.5f);
    super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
