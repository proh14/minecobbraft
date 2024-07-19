package net.minecobbraft.entity;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ModEntities {
  public static final EntityType<RustCrabEntity> RUST_CRAB = Registry.register(Registries.ENTITY_TYPE,
          Identifier.of(Minecobbraft.MOD_ID, "rust_crab"),
          EntityType.Builder.create(RustCrabEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1f).build());

  public static void registerModEntities() {
    Minecobbraft.LOGGER.info("Registering Entities for " + Minecobbraft.MOD_ID);

    BiomeModifications.addSpawn(BiomeSelectors.includeByKey(RegistryKey.of(RegistryKeys.BIOME, Identifier.ofVanilla("beach"))), SpawnGroup.CREATURE, RUST_CRAB, 7, 1, 2);
  }
}