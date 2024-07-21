package net.minecobbraft.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
  public static final Animation RUST_CRAB_WALK = Animation.Builder.create(1.0F).looping()
    .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.5F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 1.5F, 1.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.5F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("rightfrontleg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("rightrearleg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("leftrearleg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("leftfrontleg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -20.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("rightclaw", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -7.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("leftclaw", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR)
    ))
    .build();

  public static final Animation RUST_CRAB_IDLE = Animation.Builder.create(1.0F).looping()
    .addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE,
      new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.1F, 1.1F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("rightclaw", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("leftclaw", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .build();


  public static final Animation DETECTIVEKAKTUS_WALK = Animation.Builder.create(1.0F).looping()
    .addBoneAnimation("main", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -1.5F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("right_hand", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(-2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("left_hand", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(-2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .build();

  public static final Animation DETECTIVEKAKTUS_WAVE = Animation.Builder.create(1.0F).looping()
    .addBoneAnimation("left_hand", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 8.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -3.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 8.0F), Transformation.Interpolations.LINEAR)
    ))
    .build();

  public static final Animation LOCALTEXAN_WALK = Animation.Builder.create(1.5F).looping()
    .addBoneAnimation("main", new Transformation(Transformation.Targets.TRANSLATE,
      new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.4F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, 0.04F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.54F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.08F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.4F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
      new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, -4.15F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 2.55F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, -4.15F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
      new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 3.05F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, -3.25F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 3.05F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
      new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.2F, 3.6F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.4F, -4.1F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -0.2F, 3.6F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
      new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
    ))
    .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
      new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, -3.6F), Transformation.Interpolations.LINEAR),
      new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.3F, 4.2F), Transformation.Interpolations.LINEAR),
      new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, -3.6F), Transformation.Interpolations.LINEAR)
    ))
    .build();
}
