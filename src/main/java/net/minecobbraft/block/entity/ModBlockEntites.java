package net.minecobbraft.block.entity;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class ModBlockEntites {
  public static final BlockEntityType<PianoBlockEntity> PIANO_BLOCK_ENTITY = Registry.register(
          Registries.BLOCK_ENTITY_TYPE,
          Identifier.of(Minecobbraft.MOD_ID, "piano_be"),
          BlockEntityType.Builder.create(PianoBlockEntity::new, ModBlocks.PIANO).build());
}