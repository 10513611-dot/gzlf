/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.gzlf.block.*;
import net.mcreator.gzlf.GzlfMod;

import java.util.function.Function;

public class GzlfModBlocks {
	public static Block ZEPHYRBLOCK;
	public static Block XYPORTAL;
	public static Block TEST;
	public static Block GINSENGLOG;
	public static Block GINSENGLEAVES;
	public static Block GINSENGSAPLING;
	public static Block SILVERORE;
	public static Block SILVERBLOCK;
	public static Block JBYBLOCK;
	public static Block TOUCH;
	public static Block DEEP_SILVERORE;

	public static void load() {
		ZEPHYRBLOCK = register("zephyrblock", ZephyrblockBlock::new);
		XYPORTAL = register("xyportal", XyportalBlock::new);
		TEST = register("test", TestBlock::new);
		GINSENGLOG = register("ginsenglog", GinsenglogBlock::new);
		GINSENGLEAVES = register("ginsengleaves", GinsengleavesBlock::new);
		GINSENGSAPLING = register("ginsengsapling", GinsengsaplingBlock::new);
		SILVERORE = register("silverore", SilveroreBlock::new);
		SILVERBLOCK = register("silverblock", SilverblockBlock::new);
		JBYBLOCK = register("jbyblock", JbyblockBlock::new);
		TOUCH = register("touch", TouchBlock::new);
		DEEP_SILVERORE = register("deep_silverore", DeepSilveroreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}

	public static void clientLoad() {
		GinsengleavesBlock.blockColorLoad();
	}
}