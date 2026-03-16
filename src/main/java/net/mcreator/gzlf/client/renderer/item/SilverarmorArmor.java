package net.mcreator.gzlf.client.renderer.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.gzlf.init.GzlfModItems;
import net.mcreator.gzlf.init.GzlfModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class SilverarmorArmor {
	public static void clientLoad() {
		GzlfModArmorModels.ARMOR_MODELS.put(GzlfModItems.SILVERARMOR_HELMET, new GzlfModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gzlf:textures/models/armor/silver_armor_layer_1.png");
			}
		});
		GzlfModArmorModels.ARMOR_MODELS.put(GzlfModItems.SILVERARMOR_CHESTPLATE, new GzlfModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gzlf:textures/models/armor/silver_armor_layer_1.png");
			}
		});
		GzlfModArmorModels.ARMOR_MODELS.put(GzlfModItems.SILVERARMOR_LEGGINGS, new GzlfModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gzlf:textures/models/armor/silver_armor_layer_2.png");
			}
		});
		GzlfModArmorModels.ARMOR_MODELS.put(GzlfModItems.SILVERARMOR_BOOTS, new GzlfModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gzlf:textures/models/armor/silver_armor_layer_1.png");
			}
		});
	}
}