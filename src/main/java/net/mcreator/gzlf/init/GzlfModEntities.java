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

import net.mcreator.gzlf.entity.*;
import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class GzlfModEntities {
	public static EntityType<GzlfheadEntity> GZLFHEAD;
	public static EntityType<ChameleonEntity> CHAMELEON;
	public static EntityType<ShuijiaoEntity> SHUIJIAO;
	public static EntityType<QinglongEntity> QINGLONG;
	public static EntityType<GooseEntity> GOOSE;
	public static EntityType<CambrianfishEntity> CAMBRIANFISH;
	public static EntityType<BaigujingEntity> BAIGUJING;

	public static void load() {
		GZLFHEAD = register("gzlfhead", EntityType.Builder.<GzlfheadEntity>of(GzlfheadEntity::new, MobCategory.MISC).clientTrackingRange(64).updateInterval(1).sized(0.5f, 0.5f));
		CHAMELEON = register("chameleon", EntityType.Builder.<ChameleonEntity>of(ChameleonEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

				.sized(0.6f, 0.4f));
		SHUIJIAO = register("shuijiao", EntityType.Builder.<ShuijiaoEntity>of(ShuijiaoEntity::new, MobCategory.WATER_AMBIENT).clientTrackingRange(64).updateInterval(3)

				.sized(0.5f, 0.4f));
		QINGLONG = register("qinglong", EntityType.Builder.<QinglongEntity>of(QinglongEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3).fireImmune()

				.sized(0.6f, 1.8f));
		GOOSE = register("goose", EntityType.Builder.<GooseEntity>of(GooseEntity::new, MobCategory.CREATURE).clientTrackingRange(64).updateInterval(3)

				.sized(0.5f, 0.8f));
		CAMBRIANFISH = register("cambrianfish", EntityType.Builder.<CambrianfishEntity>of(CambrianfishEntity::new, MobCategory.WATER_AMBIENT).clientTrackingRange(64).updateInterval(3)

				.sized(0.5f, 0.3f));
		BAIGUJING = register("baigujing", EntityType.Builder.<BaigujingEntity>of(BaigujingEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3).fireImmune()

				.sized(0.6f, 1.8f));
		init();
		registerAttributes();
	}

	// Start of user code block custom entities 在这里写字不会被mcr吞掉
	/*笔记
	* 在这更改了生物的注册类型，比如从 WATER_CREATURE （水生生物，如守卫者）改为了 WATER_AMBIENT 水环境生物，比如各种鱼类，一定要记得在生物群系那边也改了
	*
	*
	*/

	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname))));
	}

	public static void init() {
		GooseEntity.init();
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(CHAMELEON, ChameleonEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(SHUIJIAO, ShuijiaoEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(QINGLONG, QinglongEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(GOOSE, GooseEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CAMBRIANFISH, CambrianfishEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(BAIGUJING, BaigujingEntity.createAttributes());
	}
}