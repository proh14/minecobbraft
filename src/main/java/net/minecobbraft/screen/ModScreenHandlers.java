package net.minecobbraft.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.block.entity.PianoData;
import net.minecobbraft.screen.screenHandlers.PianoScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PianoScreenHandler> PIANO_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Minecobbraft.MOD_ID, "piano"),
                    new ExtendedScreenHandlerType<>(PianoScreenHandler::new, PianoData.PACKET_CODEC));

    public static void registerScreenHandlers() {
      Minecobbraft.LOGGER.info("Registering Screen Handlers for " + Minecobbraft.MOD_ID);
    }
}
