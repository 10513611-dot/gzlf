package net.mcreator.gzlf.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class Explode13Procedure {
	public static boolean eventResult = true;

	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof Level _level && !_level.isClientSide()) {
			_level.explode(null, (x + 0.5), (y + 0.5), (z + 0.5), 13, Level.ExplosionInteraction.TNT);
		}
	}
}