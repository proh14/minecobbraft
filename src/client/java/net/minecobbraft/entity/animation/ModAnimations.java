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
}
