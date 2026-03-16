package net.mcreator.gzlf.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.gzlf.procedures.EatGinsengProcedure;
import net.mcreator.gzlf.GzlfMod;

public class MusicdiscrsgItem extends Item {
	public MusicdiscrsgItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(10f).alwaysEdible().build())
				.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "musicdiscrsg"))));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		EatGinsengProcedure.execute(entity);
		return retval;
	}
}