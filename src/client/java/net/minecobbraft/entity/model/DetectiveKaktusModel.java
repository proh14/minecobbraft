package net.minecobbraft.entity.model;

import net.minecobbraft.entity.animation.ModAnimations;
import net.minecobbraft.entity.custom.DetectiveKaktusEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class DetectiveKaktusModel<T extends DetectiveKaktusEntity> extends SinglePartEntityModel<T> {
  private final ModelPart detectivekaktus;

  public DetectiveKaktusModel(ModelPart root) {
    this.detectivekaktus = root;
  }

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData modelPartData = modelData.getRoot();
    ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -32.0F, -5.0F, 10.0F, 32.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

    ModelPartData right_hand = main.addChild("right_hand", ModelPartBuilder.create().uv(48, 43).cuboid(-8.0F, -14.0F, -2.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F))
      .uv(30, 0).cuboid(-4.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -8.0F, 0.0F));

    ModelPartData left_hand = main.addChild("left_hand", ModelPartBuilder.create().uv(40, 17).cuboid(0.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F))
      .uv(0, 42).cuboid(4.0F, -25.0F, -2.0F, 4.0F, 25.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -14.0F, 0.0F));

    ModelPartData hat = main.addChild("hat", ModelPartBuilder.create().uv(40, 0).cuboid(-6.0F, -5.25F, -6.0F, 12.0F, 5.0F, 12.0F, new Dilation(0.0F))
      .uv(16, 43).cuboid(-4.0F, -7.75F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F))
      .uv(24, 26).cuboid(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -30.75F, 0.0F, 0.0F, 0.0F, 0.0873F));
    return TexturedModelData.of(modelData, 128, 128);
  }

  @Override
  public ModelPart getPart() {
    return detectivekaktus;
  }

  @Override
  public void setAngles(DetectiveKaktusEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.getPart().traverse().forEach(ModelPart::resetTransform);
    this.animateMovement(ModAnimations.DETECTIVEKAKTUS_WALK, limbSwing, limbSwingAmount, 3f, 3f);
  }

  @Override
  public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
    detectivekaktus.render(matrices, vertices, light, overlay, color);
  }
}