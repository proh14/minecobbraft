package net.minecobbraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
  public static final EntityType<RustCrabEntity> RUST_CRAB = Registry.register(Registries.ENTITY_TYPE,
    Identifier.of(Minecobbraft.MOD_ID, "rust_crab"),
    FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RustCrabEntity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
