package net.minecobbraft.entity;

import net.minecobbraft.Minecobbraft;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
  public static final EntityModelLayer RUST_CRAB = new EntityModelLayer(Identifier.of(Minecobbraft.MOD_ID, "rust_crab"), "main");
  public static final EntityModelLayer DETECTIVEKAKTUS = new EntityModelLayer(Identifier.of(Minecobbraft.MOD_ID, "detectivekaktus"), "main");
  public static final EntityModelLayer LOCALTEXAN = new EntityModelLayer(Identifier.of(Minecobbraft.MOD_ID, "localtexan"), "main");
  public static final EntityModelLayer PROH14 = new EntityModelLayer(Identifier.of(Minecobbraft.MOD_ID, "proh14"), "main");
}
