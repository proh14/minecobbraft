package net.minecobbraft.screen.screenHandlers;

import net.minecobbraft.block.entity.PianoBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;

public class PianoScreenHandler extends ScreenHandler{
  private final Inventory inventory;
  public final PianoBlockEntity pianoBlockEntity;

  protected PianoScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId, Inventory inventory, PianoBlockEntity pianoBlockEntity) {
    super(type, syncId);
    this.inventory = inventory;
    this.pianoBlockEntity = pianoBlockEntity;
  }


  @Override
  public ItemStack quickMove(PlayerEntity player, int slot) {
    return null;
  }

  @Override
  public boolean canUse(PlayerEntity player) {
    return false;
  }
}
