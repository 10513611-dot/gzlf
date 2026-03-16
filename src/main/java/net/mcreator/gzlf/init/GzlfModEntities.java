/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gzlf.entity.GzlfheadEntity;
import net.mcreator.gzlf.entity.ChameleonEntity;
import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class GzlfModEntities {
	public static EntityType<GzlfheadEntity> GZLFHEAD;
	public static EntityType<ChameleonEntity> CHAMELEON;

	public static void load() {
		GZLFHEAD = register("gzlfhead", EntityType.Builder.<GzlfheadEntity>of(GzlfheadEntity::new, MobCategory.MISC).clientTrackingRange(64).updateInterval(1).sized(0.5f, 0.5f));
		CHAMELEON = register("chameleon", EntityType.Builder.<ChameleonEntity>of(ChameleonEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

				.sized(0.6f, 0.4f));
		init();
		registerAttributes();
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname))));
	}

	public static void init() {
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(CHAMELEON, ChameleonEntity.createAttributes());
	}
}