package net.mcreator.gzlf.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class StbfProcedure {
	public static boolean eventResult = true;

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (isInWaterOrBubble(entity)) {
			if (entity.getAirSupply() > 0) {
				entity.setAirSupply(0);
			}
		}
		if (entity instanceof Player _player) {
			_player.causeFoodExhaustion((float) 0.05);
		}
	}

	private static boolean isInWaterOrBubble(Entity entity) {
		return entity.isInWater() || entity.getInBlockState().is(Blocks.BUBBLE_COLUMN);
	}
}