package net.minecobbraft.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecobbraft.item.ModItems;
import net.minecobbraft.sound.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PianoBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory  {
  private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(2, ItemStack.EMPTY);

  private static final int SHEET_MUSIC_SLOT = 0;
  private static final int OUTPUT_DISC_SLOT = 1;


  public PianoBlockEntity(BlockPos pos, BlockState state) {
    super(ModBlockEntites.PIANO_BLOCK_ENTITY, pos, state);
  }

  @Override
  public Object getScreenOpeningData(ServerPlayerEntity player) {
    return this.pos;
  }

  @Override
  protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
    super.writeNbt(nbt, registryLookup);
    Inventories.writeNbt(nbt, inventory, registryLookup);
  }

  @Override
  protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
    super.readNbt(nbt, registryLookup);
    Inventories.readNbt(nbt, inventory, registryLookup);
  }

  @Override
  public DefaultedList<ItemStack> getItems() {
    return inventory;
  }

  @Override
  public Text getDisplayName() {
    return Text.translatable("block.minecobbraft.piano");
  }

  @Nullable
  @Override
  public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
    return null;
  }

  public void tick(World world, BlockPos pos, BlockState state) {
    if(world.isClient){
      return;
    }

   /* if(!getStack(SHEET_MUSIC_SLOT).isEmpty() && getStack(OUTPUT_DISC_SLOT).isEmpty()){
      this.setStack(OUTPUT_DISC_SLOT, new ItemStack(ModItems.MUSIC_DISC_FUR_ELISE, 1));
    }

    */

  }
}
