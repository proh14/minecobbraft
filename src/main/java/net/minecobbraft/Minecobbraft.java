package net.minecobbraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import net.minecobbraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minecobbraft implements ModInitializer {
	public static final String MOD_ID = "minecobbraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// This value is equal to one second measured in Minecraft ticks.
	public static final int SECOND = 20;

	@Override
	public void onInitialize() {
		Items.registerAllItems();
	}
}