package net.mcreator.gzlf.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.gzlf.init.GzlfModMobEffects;

public class EatGinsengProcedure {
	public static boolean eventResult = true;

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 4720, (int) ((entity instanceof Player _plr ? _plr.getAbsorptionAmount() : 0) / 4d)));
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 4720, 0));
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.removeEffect(GzlfModMobEffects.SHUITUBUFU);
		}
	}
}