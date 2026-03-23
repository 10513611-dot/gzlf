package net.mcreator.gzlf.entity;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.gzlf.init.GzlfModItems;

public class CambrianfishEntity extends AbstractSchoolingFish {
	public CambrianfishEntity(EntityType<? extends CambrianfishEntity> entityType, Level level) {
		super(entityType, level);
	}

	public ItemStack getBucketItemStack() {
		return new ItemStack(GzlfModItems.CAMBRIANFISHBUCKET);
	}
/*
寒武纪的鱼，复刻cod的基本方法
public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:hwjdy"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.cod.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:taotaile"));
	}
*/
	protected SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:hwjdy"));
	}

	protected SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:taotaile"));
	}

	protected SoundEvent getHurtSound(DamageSource damageSource) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.cod.hurt"));
	}

	protected SoundEvent getFlopSound() {
		return SoundEvents.COD_FLOP;
	}
}
