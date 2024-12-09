package me.nixuge;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinterWorld implements ModInitializer {
	public static final String MOD_ID = "winterworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("WinterWorld Loaded!");
	}
}