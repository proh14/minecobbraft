package net.minecobbraft.item.custom;

import java.util.List;
import net.minecobbraft.utils.ModWorld;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class HeapItem extends Item {
  private int uses = 0;

  public HeapItem(Settings settings) {
    super(settings);
  }

  @Override
  public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    tooltip.add(Text.translatable("item.minecobbraft.malloc.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.DARK_BLUE));
  }

  @Override
  public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
    uses--;
    Text text = Text.literal("free'd 5 hearts from the heap.").formatted(Formatting.BOLD).formatted(Formatting.GREEN);
    player.sendMessage(text);
    if(uses < 0){
      uses = 0;
      player.sendMessage(Text.literal("double free or corruption (out)\nAborted (core dumped)").formatted(Formatting.ITALIC).formatted(Formatting.BOLD).formatted(Formatting.DARK_RED));
      player.getWorld().createExplosion(player, player.getX(), player.getY(), player.getZ(), 0.1f, World.ExplosionSourceType.TRIGGER);
      player.kill();
    }
    return false;
  }



  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    ItemStack itemStack = user.getStackInHand(hand);
    if(world.isClient){
      return TypedActionResult.success(itemStack);
    }
    itemStack.damage(1, user, EquipmentSlot.MAINHAND);
    if (user.getItemCooldownManager().isCoolingDown(this)) return TypedActionResult.fail(itemStack);
    uses++;

    Text text = Text.literal("malloc'd 5 hearts from the heap.").formatted(Formatting.BOLD).formatted(Formatting.GREEN);
    user.sendMessage(text);

    if (this.uses > 3)
      user.damage(user.getWorld().getDamageSources().magic(), 5.0f);
    else
      user.heal(5.0f);

    user.getItemCooldownManager().set(this, 10 * ModWorld.SECOND);
    return TypedActionResult.success(itemStack);
  }
}
