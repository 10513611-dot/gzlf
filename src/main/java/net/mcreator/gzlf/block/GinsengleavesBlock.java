package net.mcreator.gzlf.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.GrassColor;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.gzlf.init.GzlfModBlocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class GinsengleavesBlock extends TintedParticleLeavesBlock {
	public GinsengleavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, properties.sound(SoundType.AZALEA_LEAVES).strength(0.2f, 0f).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
		FlammableBlockRegistry.getDefaultInstance().add(this, 20, 20);
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putBlock(GzlfModBlocks.GINSENGLEAVES, ChunkSectionLayer.CUTOUT);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}


	public static void blockColorLoad() {
		ColorProviderRegistry.BLOCK.register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, GzlfModBlocks.GINSENGLEAVES);
	}
}