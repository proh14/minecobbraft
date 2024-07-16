package net.minecobbraft.item.custom;

import net.minecobbraft.utils.World;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class KaktusDaggerItem extends SwordItem {
  public KaktusDaggerItem(ToolMaterial toolMaterial, Settings settings) {
    super(toolMaterial, settings);
  }


  @Override
  public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    tooltip.add(Text.translatable("item.minecobbraft.kaktus_dagger.tooltip"));
  }

  @Override
  public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    stack.damage(1, attacker, EquipmentSlot.MAINHAND);
    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 5 * World.SECOND), attacker);
    return false;
  }
}
