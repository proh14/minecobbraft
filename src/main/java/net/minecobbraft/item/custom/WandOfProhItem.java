package net.minecobbraft.item.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import java.util.List;

public class WandOfProhItem extends Item {
  public WandOfProhItem(Settings settings){
    super(settings);
  }

  @Override
  public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
    if (user.getItemCooldownManager().isCoolingDown(this)) return ActionResult.FAIL;

    stack.damage(1, user, EquipmentSlot.MAINHAND);
    entity.setVelocity(entity.getVelocity().add(0,5,0));
    return ActionResult.success(true);
  }

  @Override
  public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    tooltip.add(Text.translatable("item.minecobbraft.wand_of_proh.tooltip"));
  }
}
