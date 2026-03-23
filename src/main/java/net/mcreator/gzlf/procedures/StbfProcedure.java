package net.mcreator.gzlf.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.gzlf.init.GzlfModMobEffects;

public class StbfProcedure {
	public static boolean eventResult = true;

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isUnderWater()) {
			if (entity.getAirSupply() > 0) {
				entity.setAirSupply(0);
			}
		}
		if (entity instanceof Player _player) {
			_player.causeFoodExhaustion((float) 0.05);
		}
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (entity instanceof LivingEntity _entity) {
				_entity.removeEffect(GzlfModMobEffects.SHUITUBUFU);
			}
		}
	}
}