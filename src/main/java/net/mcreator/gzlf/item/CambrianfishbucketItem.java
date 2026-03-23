package net.mcreator.gzlf.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CambrianfishbucketItem extends Item {
	public CambrianfishbucketItem(Item.Properties properties) {
		super(properties.stacksTo(1).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0f).build()).usingConvertsTo(Items.BUCKET));
	}
}