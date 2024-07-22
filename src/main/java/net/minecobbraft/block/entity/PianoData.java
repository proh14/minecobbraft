package net.minecobbraft.block.entity;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.util.math.BlockPos;

public record PianoData(BlockPos pos) {
  public static final PacketCodec<RegistryByteBuf, PianoData> PACKET_CODEC =
          PacketCodec. tuple(
                  BlockPos.PACKET_CODEC,
                  PianoData::pos,
                  PianoData::new);
}
