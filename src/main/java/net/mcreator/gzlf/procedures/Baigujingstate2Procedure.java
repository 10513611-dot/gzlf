package net.mcreator.gzlf.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class Baigujingstate2Procedure {
	public static boolean eventResult = true;

	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 500 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 580) {
			return true;
		}
		return false;
	}
}