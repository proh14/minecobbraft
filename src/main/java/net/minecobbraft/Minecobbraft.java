package net.minecobbraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.item.ModItems;
import net.minecobbraft.sound.ModSounds;
import net.minecobbraft.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minecobbraft implements ModInitializer {
  public static final String MOD_ID = "minecobbraft";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ModItems.registerModItems();
    ModBlocks.registerModBlocks();
    ModSounds.registerSounds();
    ModWorldGeneration.generateModWorldGen();
  }
}
