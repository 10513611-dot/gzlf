/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

public class GzlfModVillagerProfessions {
	private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap<>();
	public static VillagerProfession COMPOSER;

	public static void load() {
		COMPOSER = registerProfession("composer", () -> Blocks.JUKEBOX, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:composer")));
		for (Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
			Block block = entry.getValue().block.get();
			String name = entry.getKey();
			Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
			if (existingCheck.isPresent()) {
				GzlfMod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + block + " that is already in use by " + existingCheck);
				continue;
			}
			PoiType poiType = PointOfInterestHelper.register(ResourceLocation.fromNamespaceAndPath("gzlf", name), 1, 1, ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()));
			entry.getValue().poiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.wrapAsHolder(poiType);
		}
	}

	private static VillagerProfession registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		POI_TYPES.put(name, new ProfessionPoiType(block, null));
		Predicate<Holder<PoiType>> poiPredicate = poiTypeHolder -> (POI_TYPES.get(name).poiType != null) && (poiTypeHolder.value() == POI_TYPES.get(name).poiType.value());
		return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, name),
				new VillagerProfession(Component.translatable("entity.villager." + GzlfMod.MODID + "." + name), poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get()));
	}

	private static class ProfessionPoiType {
		final Supplier<Block> block;
		Holder<PoiType> poiType;

		ProfessionPoiType(Supplier<Block> block, Holder<PoiType> poiType) {
			this.block = block;
			this.poiType = poiType;
		}
	}
}