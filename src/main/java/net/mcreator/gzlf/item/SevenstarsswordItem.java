package net.mcreator.gzlf.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SevenstarsswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2000, 30f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("gzlf:sevenstarssword_repair_items")));

	public SevenstarsswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 14f, -3.4f).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}