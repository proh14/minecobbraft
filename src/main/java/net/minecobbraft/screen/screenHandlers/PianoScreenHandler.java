package net.minecobbraft.screen.screenHandlers;

import net.minecobbraft.block.entity.PianoBlockEntity;
import net.minecobbraft.block.entity.PianoData;
import net.minecobbraft.screen.ModScreenHandlers;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class PianoScreenHandler extends ScreenHandler{
  private final Inventory inventory;
  public final PianoBlockEntity pianoBlockEntity;

  public PianoScreenHandler(int syncId, PlayerInventory playerinventory, PianoData data) {
    this(syncId, playerinventory, playerinventory.player.getWorld().getBlockEntity(data.pos()));
  }

  public PianoScreenHandler(int syncId, PlayerInventory inventory, BlockEntity blockEntity){
    super(ModScreenHandlers.PIANO_SCREEN_HANDLER, syncId);
    checkSize(inventory, 2);
    inventory.onOpen(inventory.player);
    this.pianoBlockEntity = (PianoBlockEntity) blockEntity;
    this.inventory = (Inventory) blockEntity;
    this.addSlot(new Slot(this.inventory, 0, 77, 10));
    this.addSlot(new Slot(this.inventory, 1, 152, 10));


    addPlayerInventory(inventory);
    addPlayerHotbar(inventory);

  }

  private void addPlayerInventory(PlayerInventory playerInventory) {
    for (int i = 0; i < 3; ++i) {
      for (int l = 0; l < 9; ++l) {
        this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
      }
    }
  }

  private void addPlayerHotbar(PlayerInventory playerInventory) {
    for (int i = 0; i < 9; ++i) {
      this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
    }
  }


  @Override
  public ItemStack quickMove(PlayerEntity player, int invSlot) {
    ItemStack newStack = ItemStack.EMPTY;
    Slot slot = this.slots.get(invSlot);
    if (slot != null && slot.hasStack()) {
      ItemStack originalStack = slot.getStack();
      newStack = originalStack.copy();
      if (invSlot < this.inventory.size()) {
        if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
          return ItemStack.EMPTY;
        }
      } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
        return ItemStack.EMPTY;
      }

      if (originalStack.isEmpty()) {
        slot.setStack(ItemStack.EMPTY);
      } else {
        slot.markDirty();
      }
    }
    return newStack;
  }

  @Override
  public void onContentChanged(Inventory inventory) {
    this.sendContentUpdates();
    super.onContentChanged(inventory);
  }

  @Override
  public boolean canUse(PlayerEntity player) {
    return this.inventory.canPlayerUse(player);
  }
}
