package net.minecobbraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecobbraft.block.entity.ModBlockEntites;
import net.minecobbraft.block.entity.PianoBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PianoBlock extends BlockWithEntity implements BlockEntityProvider {
  private static final VoxelShape SHAPE = PianoBlock.createCuboidShape(0,0,0, 16, 12, 13);
  public static final MapCodec<PianoBlock> CODEC = PianoBlock.createCodec(PianoBlock::new);
  public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

  public PianoBlock(Settings settings){
    super(settings);
  }

  @Override
  protected MapCodec<? extends BlockWithEntity> getCodec() {
    return CODEC;
  }

  @Override
  protected BlockRenderType getRenderType(BlockState state) {
    return BlockRenderType.MODEL;
  }

  @Override
  protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return SHAPE;
  }

  @Nullable
  @Override
  public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
    return new PianoBlockEntity(pos,state);
  }

  @Override
  protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
    if (state.getBlock() != newState.getBlock()) {
      BlockEntity blockEntity = world.getBlockEntity(pos);
      if (blockEntity instanceof PianoBlockEntity) {
        ItemScatterer.spawn(world, pos, (PianoBlockEntity)blockEntity);
        world.updateComparators(pos,this);
      }
      super.onStateReplaced(state, world, pos, newState, moved);
    }
  }

  @Override
  protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
    if (!world.isClient) {
      NamedScreenHandlerFactory screenHandlerFactory = ((PianoBlockEntity) world.getBlockEntity(pos));

      if (screenHandlerFactory != null) {
        player.openHandledScreen(screenHandlerFactory);
      }
    }

    return ActionResult.SUCCESS;
  }

  @Nullable
  @Override
  public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
    return validateTicker(type, ModBlockEntites.PIANO_BLOCK_ENTITY, (world1, pos, state1, blockEntity) -> blockEntity.tick(world1,pos,state1));
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(FACING);
  }
}
