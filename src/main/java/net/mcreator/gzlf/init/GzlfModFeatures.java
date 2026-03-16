/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gzlf.world.features.GinsengFeature;
import net.mcreator.gzlf.block.SilveroreBlock;
import net.mcreator.gzlf.block.DeepSilveroreBlock;
import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class GzlfModFeatures {
	public static void load() {
		register("ginseng", new GinsengFeature());
		register("silverore", new OreFeature(OreConfiguration.CODEC), SilveroreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deep_silverore", new OreFeature(OreConfiguration.CODEC), DeepSilveroreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname), feature);
	}
}