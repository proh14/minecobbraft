package net.minecobbraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ComposingTableBlock extends Block {
  private static final VoxelShape SHAPE = PianoBlock.createCuboidShape(0, 0, 0, 16, 16, 16);
  public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

  public ComposingTableBlock(Settings settings) {
    super(settings);
  }

  @Override
  protected MapCodec<? extends Block> getCodec() {
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

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(FACING);
  }
}
