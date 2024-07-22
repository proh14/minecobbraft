package net.minecobbraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.entity.ModEntities;
import net.minecobbraft.entity.custom.DetectiveKaktusEntity;
import net.minecobbraft.entity.custom.LocalTexanEntity;
import net.minecobbraft.entity.custom.Proh14Entity;
import net.minecobbraft.entity.custom.RustCrabEntity;
import net.minecobbraft.item.ModItems;
import net.minecobbraft.sound.ModSounds;
import net.minecobbraft.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minecobbraft implements ModInitializer {
  public static final String MOD_ID = "minecobbraft";
  public static final Logger LOGGER = LoggerFactory.getLogger("Minecobbraft");

  @Override
  public void onInitialize() {
    ModItems.registerModItems();
    ModBlocks.registerModBlocks();
    ModSounds.registerSounds();
    ModWorldGeneration.generateModWorldGen();
    ModEntities.registerModEntities();

    //Entities
    FabricDefaultAttributeRegistry.register(ModEntities.RUST_CRAB, RustCrabEntity.createRustCrabAttributes());
    FabricDefaultAttributeRegistry.register(ModEntities.DETECTIVEKAKTUS, DetectiveKaktusEntity.createDetectiveKaktusAttributes());
    FabricDefaultAttributeRegistry.register(ModEntities.LOCALTEXAN, LocalTexanEntity.createLocalTexanAttributes());
    FabricDefaultAttributeRegistry.register(ModEntities.PROH14, Proh14Entity.createProh14Attributes());
  }
}
