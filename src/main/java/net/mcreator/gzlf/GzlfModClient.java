package net.mcreator.gzlf;

import net.mcreator.gzlf.init.GzlfModModels;
import net.mcreator.gzlf.init.GzlfModEntityRenderers;
import net.mcreator.gzlf.init.GzlfModBlocksRenderers;
import net.mcreator.gzlf.init.GzlfModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class GzlfModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		GzlfModModels.clientLoad();
		GzlfModBlocksRenderers.clientLoad();
		GzlfModArmorModels.clientLoad();

		GzlfModEntityRenderers.clientLoad();

		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}