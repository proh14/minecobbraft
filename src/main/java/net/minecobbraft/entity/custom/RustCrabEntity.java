package net.minecobbraft.entity.custom;

import net.minecobbraft.entity.ModEntities;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class RustCrabEntity extends AnimalEntity {
  public final AnimationState idle = new AnimationState();
  private int idleAnimationTimeout = 0;

  public RustCrabEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  private void updateAnimation() {
    if (this.idleAnimationTimeout <= 0) {
      this.idleAnimationTimeout = this.random.nextInt(40) + 80;
      this.idle.start(this.age);
    } else
      --this.idleAnimationTimeout;
  }

  @Override
  public void tick() {
    super.tick();
    if (this.getWorld().isClient()) updateAnimation();
  }

  @Override
  public boolean isBreedingItem(ItemStack stack) {
    return stack.isOf(Items.SEA_PICKLE);
  }

  @Override
  protected void updateLimbs(float posDelta) {
    float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
    this.limbAnimator.updateLimbs(f, 0.2f);
  }

  public static DefaultAttributeContainer.Builder createRustCrabAttributes() {
    return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 10)
            .add(EntityAttributes.GENERIC_ARMOR, 5.0f)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.27f)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0f);
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new EscapeDangerGoal(this, 1.25));
    this.goalSelector.add(2, new AnimalMateGoal(this, 1.15));
    this.goalSelector.add(3, new TemptGoal(this, 1.15, Ingredient.ofItems(Items.SEA_PICKLE), false));
    this.goalSelector.add(4, new WanderAroundFarGoal(this, 1));
    this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 1));
    this.goalSelector.add(6, new LookAroundGoal(this));
  }

  @Override
  public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.RUST_CRAB.create(world);
  }

  @Override
  public boolean canBeLeashed() {
    return true;
  }
}
