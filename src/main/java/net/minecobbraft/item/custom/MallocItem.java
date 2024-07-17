package net.minecobbraft.item.custom;

import java.util.List;
import net.minecobbraft.utils.ModWorld;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;

public class MallocItem extends Item {
  private int usesInLastMinute = 0;
  private long firstUseInMinute = 0;

  public MallocItem(Settings settings) {
    super(settings);
  }

  @Override
  public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    tooltip.add(Text.translatable("item.minecobbraft.malloc.tooltip"));
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    itemStack.damage(1, user, EquipmentSlot.MAINHAND);
    if (user.getItemCooldownManager().isCoolingDown(this)) return TypedActionResult.fail(itemStack);

    long time = System.currentTimeMillis() / 1000;
    if (this.firstUseInMinute == 0) this.firstUseInMinute = time;
    if (this.firstUseInMinute - time >= 60) {
      this.firstUseInMinute = time;
      this.usesInLastMinute = 0;
    }
    this.usesInLastMinute++;
    if (this.usesInLastMinute > 6)
      user.damage(user.getWorld().getDamageSources().magic(), 5.0f);
    else
      user.heal(5.0f);

    user.getItemCooldownManager().set(this, 10 * ModWorld.SECOND);
    return TypedActionResult.success(itemStack);
  }
}
