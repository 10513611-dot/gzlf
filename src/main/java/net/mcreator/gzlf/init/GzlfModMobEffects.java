/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.gzlf.potion.ShuitubufuMobEffect;
import net.mcreator.gzlf.GzlfMod;

import java.util.function.Supplier;

public class GzlfModMobEffects {
	public static Holder<MobEffect> SHUITUBUFU;

	public static void load() {
		SHUITUBUFU = register("shuitubufu", ShuitubufuMobEffect::new);
	}

	private static Holder<MobEffect> register(String registryname, Supplier<MobEffect> element) {
		return Holder.direct(Registry.register(BuiltInRegistries.MOB_EFFECT, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, registryname), element.get()));
	}
}