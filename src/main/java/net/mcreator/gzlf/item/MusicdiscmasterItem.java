package net.mcreator.gzlf.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.gzlf.GzlfMod;

public class MusicdiscmasterItem extends Item {
	public MusicdiscmasterItem(Item.Properties properties) {
		super(properties.stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "musicdiscmaster"))));
	}
}