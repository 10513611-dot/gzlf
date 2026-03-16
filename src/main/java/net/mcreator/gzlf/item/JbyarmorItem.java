package net.mcreator.gzlf.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class JbyarmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(3, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 1, ArmorType.CHESTPLATE, 2, ArmorType.HELMET, 1, ArmorType.BODY, 2), 7,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:music_disc_jby"))), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("gzlf:jbyarmor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("gzlf:jbyarmor")));

	private JbyarmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends JbyarmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends JbyarmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends JbyarmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends JbyarmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}