package net.minecobbraft.entity.model;

import net.minecobbraft.entity.animation.ModAnimations;
import net.minecobbraft.entity.custom.TsodingEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class TsodingModel<T extends TsodingEntity> extends SinglePartEntityModel<T> {
  private final ModelPart tsoding;

  public TsodingModel(ModelPart root) {
    this.tsoding = root;
  }

  public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, -2.0F));

		ModelPartData left_leg = main.addChild("left_leg", ModelPartBuilder.create().uv(16, 32).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 23.0F, 1.0F));

		ModelPartData right_leg = main.addChild("right_leg", ModelPartBuilder.create().uv(32, 0).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 23.0F, 1.0F));

		ModelPartData body = main.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.0F, 2.0F));

		ModelPartData left_arm = main.addChild("left_arm", ModelPartBuilder.create().uv(0, 32).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 11.0F, 1.0F));

		ModelPartData right_arm = main.addChild("right_arm", ModelPartBuilder.create().uv(24, 16).cuboid(-1.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 11.0F, 1.0F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.0F, -2.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(16, 48).cuboid(-4.0F, -9.0F, -2.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData ponytail = head.addChild("ponytail", ModelPartBuilder.create().uv(32, 38).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(36, 16).cuboid(-0.75F, -1.0F, 0.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.3F))
		.uv(20, 16).cuboid(-0.75F, 4.8F, 3.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(4, 6).cuboid(0.25F, 6.3F, 5.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 34).cuboid(-0.75F, 1.0F, 1.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.5F))
		.uv(12, 32).cuboid(-0.85F, 3.0F, 2.5F, 2.0F, 2.0F, 2.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -4.0F, 6.25F));

		ModelPartData headphones = head.addChild("headphones", ModelPartBuilder.create().uv(0, 6).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.4F))
		.uv(0, 0).cuboid(-0.2F, -2.0F, -3.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-9.2F, -2.0F, -3.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 6).cuboid(-9.4F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.4F))
		.uv(0, 16).cuboid(-8.9F, -5.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-0.5F, -5.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 32).cuboid(-8.2F, -5.5F, -2.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.1F)), ModelTransform.pivot(4.2F, -4.5F, 3.5F));
		return TexturedModelData.of(modelData, 64, 64);
	}

  @Override
  public ModelPart getPart() {
    return tsoding;
  }

  @Override
  public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
    tsoding.render(matrices, vertices, light, overlay, color);
  }

  @Override
  public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    this.getPart().traverse().forEach(ModelPart::resetTransform);
    this.animateMovement(ModAnimations.HUMANOID_WALK, limbAngle, limbDistance, 2f, 2.5f);
  }
}
