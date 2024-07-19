package net.minecobbraft.entity.client;

import net.minecobbraft.entity.animation.ModAnimations;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class RustCrabModel<T extends RustCrabEntity> extends SinglePartEntityModel<T> {
	private final ModelPart rustCrab;
	private final ModelPart head;

	public RustCrabModel(ModelPart root) {
		this.rustCrab = root;
		this.head = rustCrab.getChild("main").getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create().uv(20, 17).cuboid(-2.0F, -1.0F, -5.0F, 5.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 20.75F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, -5.75F, -5.0F, 5.0F, 1.0F, 10.0F, new Dilation(0.0F))
			.uv(26, 0).cuboid(-1.0F, -6.75F, -3.0F, 3.0F, 1.0F, 6.0F, new Dilation(0.0F))
			.uv(6, 6).cuboid(3.5F, -3.75F, -2.25F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
			.uv(6, 2).cuboid(3.5F, -3.75F, 0.25F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
			.uv(0, 0).cuboid(-3.0F, -4.75F, -6.0F, 7.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData spikes = head.addChild("spikes", ModelPartBuilder.create().uv(26, 4).cuboid(0.0F, -9.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
			.uv(24, 24).cuboid(0.0F, -9.5F, 1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
			.uv(20, 24).cuboid(0.0F, -9.5F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 0.0F));

		ModelPartData cube_r1 = spikes.addChild("cube_r1", ModelPartBuilder.create().uv(6, 20).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -7.0F, -4.5F, 0.829F, 0.0F, 0.0F));

		ModelPartData cube_r2 = spikes.addChild("cube_r2", ModelPartBuilder.create().uv(8, 10).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -6.25F, 5.25F, -0.829F, 0.0F, 0.0F));

		ModelPartData cube_r3 = spikes.addChild("cube_r3", ModelPartBuilder.create().uv(6, 16).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -7.25F, 3.25F, -0.829F, 0.0F, 0.0F));

		ModelPartData cube_r4 = spikes.addChild("cube_r4", ModelPartBuilder.create().uv(6, 24).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -8.0F, -2.5F, 0.829F, 0.0F, 0.0F));

		ModelPartData rightfrontleg = main.addChild("rightfrontleg", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, -1.0F, 4.5F));

		ModelPartData smallpart_r1 = rightfrontleg.addChild("smallpart_r1", ModelPartBuilder.create().uv(24, 28).cuboid(0.0F, 0.25F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.45F, -0.1745F, 0.0F, 0.0F));

		ModelPartData bigpart_r1 = rightfrontleg.addChild("bigpart_r1", ModelPartBuilder.create().uv(26, 7).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.75F, 0.75F, 1.7762F, 0.0741F, -0.3414F));

		ModelPartData rightrearleg = main.addChild("rightrearleg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -1.0F, 4.5F));

		ModelPartData smallpart_r2 = rightrearleg.addChild("smallpart_r2", ModelPartBuilder.create().uv(20, 28).cuboid(-1.0F, 0.25F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.45F, -0.1745F, 0.0F, 0.0F));

		ModelPartData bigpart_r2 = rightrearleg.addChild("bigpart_r2", ModelPartBuilder.create().uv(20, 20).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.75F, 0.75F, 1.7762F, -0.0741F, 0.3414F));

		ModelPartData leftrearleg = main.addChild("leftrearleg", ModelPartBuilder.create(), ModelTransform.of(-2.0F, -1.0F, -4.5F, 0.0F, 3.1416F, 0.0F));

		ModelPartData smallpart_r3 = leftrearleg.addChild("smallpart_r3", ModelPartBuilder.create().uv(16, 27).cuboid(0.0F, 0.25F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.45F, -0.1745F, 0.0F, 0.0F));

		ModelPartData bigpart_r3 = leftrearleg.addChild("bigpart_r3", ModelPartBuilder.create().uv(20, 16).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.75F, 0.75F, 1.7762F, 0.0741F, -0.3414F));

		ModelPartData leftfrontleg = main.addChild("leftfrontleg", ModelPartBuilder.create(), ModelTransform.of(3.0F, -1.0F, -4.5F, 0.0F, -3.1416F, 0.0F));

		ModelPartData smallpart_r4 = leftfrontleg.addChild("smallpart_r4", ModelPartBuilder.create().uv(26, 0).cuboid(-1.0F, 0.25F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.45F, -0.1745F, 0.0F, 0.0F));

		ModelPartData bigpart_r4 = leftfrontleg.addChild("bigpart_r4", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.75F, 0.75F, 1.7762F, -0.0741F, 0.3414F));

		ModelPartData rightclaw = main.addChild("rightclaw", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, -2.75F, 6.0F));

		ModelPartData cube_r5 = rightclaw.addChild("cube_r5", ModelPartBuilder.create().uv(8, 27).cuboid(-0.0738F, -0.5F, -1.3738F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -0.25F, -0.25F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = rightclaw.addChild("cube_r6", ModelPartBuilder.create().uv(0, 8).cuboid(-0.0738F, -1.5F, -1.3738F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = rightclaw.addChild("cube_r7", ModelPartBuilder.create().uv(0, 16).cuboid(-0.0738F, -1.5F, -1.3738F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 0.5F, 0.5F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r8 = rightclaw.addChild("cube_r8", ModelPartBuilder.create().uv(0, 24).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 1.0F, 0.5F, 0.0F, 0.1309F, 0.0F));

		ModelPartData leftclaw = main.addChild("leftclaw", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, -2.75F, -6.0F));

		ModelPartData cube_r9 = leftclaw.addChild("cube_r9", ModelPartBuilder.create().uv(0, 27).cuboid(-0.0738F, -0.5F, -0.6262F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -0.25F, 0.25F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r10 = leftclaw.addChild("cube_r10", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0738F, -1.5F, -0.6262F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -0.5F, -0.5F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r11 = leftclaw.addChild("cube_r11", ModelPartBuilder.create().uv(0, 4).cuboid(-0.0738F, -1.5F, -0.6262F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 0.5F, -0.5F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r12 = leftclaw.addChild("cube_r12", ModelPartBuilder.create().uv(6, 0).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 1.0F, -0.5F, 0.0F, -0.1309F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public ModelPart getPart() {
		return rustCrab;
	}

	@Override
	public void setAngles(RustCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		//this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.RUST_CRAB_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idle, ModAnimations.RUST_CRAB_IDLE, ageInTicks, 1);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		this.head.yaw = MathHelper.clamp(headYaw, -30.0f, 30.0f) * 0.017453292f;
		this.head.pitch = MathHelper.clamp(headPitch, -25.0f, 45.0f) * 0.017453292f;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		rustCrab.render(matrices, vertices, light, overlay, color);
	}
}