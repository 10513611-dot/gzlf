package net.mcreator.gzlf.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.gzlf.procedures.StbfProcedure;
import net.mcreator.gzlf.GzlfMod;

public class ShuitubufuMobEffect extends InstantenousMobEffect {
	public ShuitubufuMobEffect() {
		super(MobEffectCategory.HARMFUL, -10265515);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:stbf")));
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "effect.shuitubufu_0"), -1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_BREAK_SPEED, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "effect.shuitubufu_1"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BURNING_TIME, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "effect.shuitubufu_2"), 0.2, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		StbfProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}