package net.minecobbraft.entity.custom;

import net.minecobbraft.entity.ModEntities;
import net.minecobbraft.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class TsodingEntity extends AnimalEntity {
  public TsodingEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  @Override
  public boolean isBreedingItem(ItemStack stack) {
    return stack.isOf(ModItems.C);
  }

  public static DefaultAttributeContainer.Builder createTsodingAttributes() {
    return MobEntity.createMobAttributes()
      .add(EntityAttributes.GENERIC_MAX_HEALTH, 35)
      .add(EntityAttributes.GENERIC_ARMOR, 5)
      .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.19f)
      .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2)
      .add(EntityAttributes.GENERIC_ATTACK_SPEED, 0.5f);
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new EscapeDangerGoal(this, 1));
    this.goalSelector.add(2, new AnimalMateGoal(this, 1));
    this.goalSelector.add(3, new TemptGoal(this, 1, Ingredient.ofItems(ModItems.C), false));
    this.goalSelector.add(4, new WanderAroundFarGoal(this, 1));
    this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 25));
    this.goalSelector.add(6, new LookAroundGoal(this));
  }

  @Override
  public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.TSODING.create(world);
  }

  @Override
  public boolean canBeLeashed() {
    return false;
  }
}
