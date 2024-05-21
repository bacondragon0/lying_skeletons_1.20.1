package name.lying_skeletons;

import name.lying_skeletons.blocks.ModBlocks;
import name.lying_skeletons.config.ModConfigs;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModCore implements ModInitializer {
	public static final String MOD_ID = "lying_skeletons";
    public static final Logger LOGGER = LoggerFactory.getLogger("mod-logger");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello World");
		ModConfigs.registerConfigs();
		ModBlocks.registerModBlocks();
	}
}