/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.mcreator.gzlf.block.TouchBlock;
import net.mcreator.gzlf.block.TestBlock;
import net.mcreator.gzlf.block.GinsengsaplingBlock;
import net.mcreator.gzlf.block.GinsengleavesBlock;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModBlocksRenderers {
	public static void clientLoad() {
		TestBlock.registerRenderLayer();
		GinsengleavesBlock.registerRenderLayer();
		GinsengsaplingBlock.registerRenderLayer();
		TouchBlock.registerRenderLayer();
	}
	// Start of user code block custom block renderers
	// End of user code block custom block renderers
}