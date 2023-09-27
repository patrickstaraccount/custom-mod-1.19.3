package net.patrick.custommod;

import net.fabricmc.api.ModInitializer;

import net.patrick.custommod.block.ModBlocks;
import net.patrick.custommod.item.ModItemGroup;
import net.patrick.custommod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class custommod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("custommod");
    public static final String MOD_ID = "custommod";

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}