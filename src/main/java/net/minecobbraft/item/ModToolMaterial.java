package net.minecobbraft.item;

import net.minecobbraft.utils.World;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
  JAVASCRIPT(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1, 1, 0, 0, () -> Ingredient.ofItems(ModItems.JAVASCRIPT)),
  PYTHON(BlockTags.INCORRECT_FOR_IRON_TOOL, World.LOW_MEDIUM_DURABILITY, 2.0f, 3.5f, 10, () -> Ingredient.ofItems(ModItems.PYTHON)),
  JAVA(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, World.MEDIUM_DURABILITY, 2.5f, 5.0f, 15, () -> Ingredient.ofItems(ModItems.JAVA)),
  C(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, World.HIGH_DURABILITY, 4.0f, 7.0f, 20, () -> Ingredient.ofItems(ModItems.C));

  private final TagKey<Block> inverseTag;
  private final int itemDurability;
  private final float miningSpeed;
  private final float attackDamage;
  private final int enchantability;
  private final Supplier<Ingredient> repairIngredient;

  ModToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
    this.inverseTag = inverseTag;
    this.itemDurability = itemDurability;
    this.miningSpeed = miningSpeed;
    this.attackDamage = attackDamage;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public int getDurability() {
    return itemDurability;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return miningSpeed;
  }

  @Override
  public float getAttackDamage() {
    return attackDamage;
  }

  @Override
  public TagKey<Block> getInverseTag() {
    return inverseTag;
  }

  @Override
  public int getEnchantability() {
    return enchantability;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return repairIngredient.get();
  }
}
