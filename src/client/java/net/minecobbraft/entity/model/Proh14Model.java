package net.minecobbraft.entity.model;

import net.minecobbraft.entity.animation.ModAnimations;
import net.minecobbraft.entity.custom.Proh14Entity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class Proh14Model<T extends Proh14Entity> extends SinglePartEntityModel<T> {
  private final ModelPart proh14;

  public Proh14Model(ModelPart root) {
    this.proh14 = root;
  }

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData modelPartData = modelData.getRoot();
    ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, -2.0F));

    ModelPartData left_leg = main.addChild("left_leg", ModelPartBuilder.create().uv(16, 48).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
      .uv(0, 48).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.51F)), ModelTransform.pivot(1.0F, 23.0F, 1.0F));

    ModelPartData right_leg = main.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
      .uv(0, 32).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(-3.0F, 23.0F, 1.0F));

    ModelPartData body = main.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
      .uv(16, 32).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 11.0F, 2.0F));

    ModelPartData left_arm = main.addChild("left_arm", ModelPartBuilder.create().uv(32, 48).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
      .uv(48, 48).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(5.0F, 11.0F, 1.0F));

    ModelPartData right_arm = main.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
      .uv(40, 32).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(-7.0F, 11.0F, 1.0F));

    ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.0F, -2.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
      .uv(32, 0).cuboid(-4.0F, -9.0F, -2.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
    return TexturedModelData.of(modelData, 64, 64);
  }

  @Override
  public ModelPart getPart() {
    return proh14;
  }

  @Override
  public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
    proh14.render(matrices, vertices, light, overlay, color);
  }

  @Override
  public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    this.getPart().traverse().forEach(ModelPart::resetTransform);
    this.animateMovement(ModAnimations.HUMANOID_WALK, limbAngle, limbDistance, 2f, 2.5f);
  }
}
