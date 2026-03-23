package net.mcreator.gzlf.world.dimension;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.gzlf.procedures.AddstbfProcedure;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;

public class XiyouDimension {
	public static void load() {
		DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.OVERWORLD, false, false) {


			public static boolean execute(LevelAccessor world, double x, double y, double z) {
                return world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("gzlf:baihumount"));
            }


			@Override
			public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
				return new Vec3(0.9568627451, 0.8352941176, 0.7215686275).multiply(sunHeight * 0.94 + 0.06, sunHeight * 0.94 + 0.06, sunHeight * 0.91 + 0.09);
			}
			//仅在白虎岭添加环境迷雾
			@Override
			public boolean isFoggyAt(int x, int y) {
				Level level = Minecraft.getInstance().level;
				if (level == null) {
					return false;
				}
				int worldX = x * 16;
				int worldZ = y * 16;
				return execute(level,worldX,y,worldZ);
			}
		};

		DimensionRenderingRegistry.registerDimensionEffects(ResourceLocation.parse("gzlf:xiyou"), customEffect);
		ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.register((entity, origin, destination) -> {
			Level world = entity.level();
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (origin.dimension() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("gzlf:xiyou"))) {
			}
			if (destination.dimension() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("gzlf:xiyou"))) {
				AddstbfProcedure.execute(entity);
			}
		});
	}
}