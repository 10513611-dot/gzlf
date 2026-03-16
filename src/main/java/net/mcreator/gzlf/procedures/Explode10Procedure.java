package net.mcreator.gzlf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class Explode10Procedure {
	public static boolean eventResult = true;

	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide()) {
			_level.explode(null, x, (y + 0.5), z, 10, Level.ExplosionInteraction.TNT);
		}
	}
}