package net.minecobbraft.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecobbraft.item.ModItems;
import net.minecobbraft.screen.screenHandlers.PianoScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
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

  @Override
  public void markDirty() {
    assert world != null;
    world.updateListeners(pos,getCachedState(),getCachedState(),3);
    super.markDirty();
  }


  @Nullable
  @Override
  public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
    return new PianoScreenHandler(syncId, playerInventory, this);
  }

  public void tick(World world, BlockPos pos, BlockState state) {
    if(world.isClient){
      return;
    }

   if(!getStack(SHEET_MUSIC_SLOT).isEmpty() && getStack(OUTPUT_DISC_SLOT).isEmpty()){
      this.setStack(OUTPUT_DISC_SLOT, new ItemStack(ModItems.MUSIC_DISC_FUR_ELISE, 1));
      markDirty();
    }

  }

  @Override
  public Object getScreenOpeningData(ServerPlayerEntity player) {
    return new PianoData(this.pos);
  }

  @Nullable
  @Override
  public Packet<ClientPlayPacketListener> toUpdatePacket() {
    return BlockEntityUpdateS2CPacket.create(this);
  }


  @Override
  public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
    return createNbt(registryLookup);
  }
}
