/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gzlf.block.entity.TestBlockEntity;
import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class GzlfModBlockEntities {
	public static BlockEntityType<TestBlockEntity> TEST;

	public static void load() {
		TEST = register("test", GzlfModBlocks.TEST, TestBlockEntity::new);
	}

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> BlockEntityType<T> register(String registryname, Block block, FabricBlockEntityTypeBuilder.Factory<? extends T> supplier) {
		return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname), FabricBlockEntityTypeBuilder.<T>create(supplier, block).build());
	}
}