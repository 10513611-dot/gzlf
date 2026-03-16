package net.mcreator.gzlf.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SilverblockBlock extends Block {
	public SilverblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(3f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}