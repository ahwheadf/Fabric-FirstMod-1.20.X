package com.ahwheadf.firstmod;

import com.ahwheadf.firstmod.item.ModItemGroups;
import com.ahwheadf.firstmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.RegisterItemGroups();
		ModItems.registerModItems();

	}
}