package net.minecobbraft.entity.custom;

import net.minecobbraft.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DetectiveKaktusEntity extends AnimalEntity {
  public DetectiveKaktusEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  // DetectiveKaktus is virgin, so that's why he can't bread.
  // I hope it makes sense :)
  @Override
  public boolean isBreedingItem(ItemStack stack) {
    return false;
  }

  public static DefaultAttributeContainer.Builder createDetectiveKaktusAttributes() {
    return MobEntity.createMobAttributes()
      .add(EntityAttributes.GENERIC_MAX_HEALTH, 35)
      .add(EntityAttributes.GENERIC_ARMOR, 5.0f)
      .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f)
      .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0f);
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new EscapeDangerGoal(this, 1.15));
    this.goalSelector.add(2, new AnimalMateGoal(this, 1.15));
    this.goalSelector.add(3, new WanderAroundFarGoal(this, 1));
    this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 25));
    this.goalSelector.add(5, new LookAroundGoal(this));
  }

  @Nullable
  @Override
  public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.DETECTIVEKAKTUS.create(world);
  }
}
