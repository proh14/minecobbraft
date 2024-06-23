package net.minecobbraft.sound;

import net.minecobbraft.Minecobbraft;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
  public static final SoundEvent THEROCK_ALL = registerSoundEvent("vine_boom");


  public static final BlockSoundGroup THEROCK_SOUNDS = new BlockSoundGroup(1f, 1f,
          ModSounds.THEROCK_ALL, ModSounds.THEROCK_ALL, ModSounds.THEROCK_ALL,
          ModSounds.THEROCK_ALL, ModSounds.THEROCK_ALL);


  private static SoundEvent registerSoundEvent(String name) {
    Identifier id = Identifier.of(Minecobbraft.MOD_ID, name);
    return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
  }

  public static void registerSounds() {
    Minecobbraft.LOGGER.info("Registering Sounds for " + Minecobbraft.MOD_ID);
  }
}
