/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class GzlfModTabs {
	public static ResourceKey<CreativeModeTab> TAB_GUA_ZHE_LING_FENG = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "gua_zhe_ling_feng"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GUA_ZHE_LING_FENG,
				FabricItemGroup.builder().title(Component.translatable("item_group.gzlf.gua_zhe_ling_feng")).icon(() -> new ItemStack(GzlfModItems.MUSICDISCBYXTZ)).displayItems((parameters, tabData) -> {
					tabData.accept(GzlfModItems.MUSICDISCFJZJ);
					tabData.accept(GzlfModItems.MUSICDISCDNH);
					tabData.accept(GzlfModItems.MUSICDISCJLCJ);
					tabData.accept(GzlfModItems.MUSICDISCAUAG);
					tabData.accept(GzlfModItems.MUSICDISCYLWJ);
					tabData.accept(GzlfModItems.MUSICDISCJIASHA);
					tabData.accept(GzlfModItems.MUSICDISCJRZ);
					tabData.accept(GzlfModItems.MUSICDISCMASTER);
					tabData.accept(GzlfModItems.MUSICDISCLLT);
					tabData.accept(GzlfModItems.MUSICDISCYYDYZ);
					tabData.accept(GzlfModItems.MUSICDISCQIANFEN);
					tabData.accept(GzlfModItems.MUSICDISCXIA);
					tabData.accept(GzlfModItems.MUSICDISCDENGJIE);
					tabData.accept(GzlfModItems.MUSICDISCWIND);
					tabData.accept(GzlfModItems.MUSICDISCMORTAL);
					tabData.accept(GzlfModItems.MUSICDISCTTL);
					tabData.accept(GzlfModItems.MUSICDISCYYH);
					tabData.accept(GzlfModItems.MUSICDISCHUAIGU);
					tabData.accept(GzlfModItems.MUSICDISCLIMING);
					tabData.accept(GzlfModItems.MUSICDISCPRINCESS);
					tabData.accept(GzlfModItems.MUSICDISCSBML);
					tabData.accept(GzlfModItems.MUSICDISCQINGXIAN);
					tabData.accept(GzlfModItems.MUSICDISCJNTTW);
					tabData.accept(GzlfModItems.MUSICDISCRSG);
					tabData.accept(GzlfModItems.MUSICDISCDIAO);
					tabData.accept(GzlfModItems.MUSICDISCGU);
					tabData.accept(GzlfModItems.MUSICDISCBAIGU);
					tabData.accept(GzlfModItems.MUSICDISCMASAID);
					tabData.accept(GzlfModItems.MUSICDISCSQ_23);
					tabData.accept(GzlfModItems.MUSICDISCMRMX);
					tabData.accept(GzlfModItems.MUSICDISCIKLS);
					tabData.accept(GzlfModItems.MUSICDISCQINGLONG);
					tabData.accept(GzlfModItems.MUSICDISCMIBEI);
					tabData.accept(GzlfModItems.MUSICDISCSXJCG);
					tabData.accept(GzlfModItems.MUSICDISCYHC);
					tabData.accept(GzlfModItems.MUSICDISCWSZQW);
					tabData.accept(GzlfModItems.MUSICDISCBE_24);
					tabData.accept(GzlfModItems.MUSICDISCPGY);
					tabData.accept(GzlfModItems.MUSICDISCJBY);
					tabData.accept(GzlfModItems.MUSICDISCFENGSHEN);
					tabData.accept(GzlfModItems.MUSICDISCB);
					tabData.accept(GzlfModItems.MUSICDISCNHY);
					tabData.accept(GzlfModItems.MUSICDISCCHANGSHENG);
					tabData.accept(GzlfModItems.MUSICDISCZGT);
					tabData.accept(GzlfModItems.MUSICDISCCHI);
					tabData.accept(GzlfModItems.MUSICDISCBYXTZ);
					tabData.accept(GzlfModItems.MUSICDISCZXHDMX);
					tabData.accept(GzlfModItems.MUSICDISCHNCGM);
					tabData.accept(GzlfModItems.MUSICDISCMENGYA);
					tabData.accept(GzlfModItems.MUSICDISCYINGWU);
					tabData.accept(GzlfModBlocks.ZEPHYRBLOCK.asItem());
					tabData.accept(GzlfModBlocks.XYPORTAL.asItem());
					tabData.accept(GzlfModBlocks.GINSENGLOG.asItem());
					tabData.accept(GzlfModBlocks.GINSENGLEAVES.asItem());
					tabData.accept(GzlfModBlocks.GINSENGSAPLING.asItem());
					tabData.accept(GzlfModItems.SILVERINGOT);
					tabData.accept(GzlfModItems.RAWSILVER);
					tabData.accept(GzlfModItems.SILVERNUGGET);
					tabData.accept(GzlfModBlocks.SILVERORE.asItem());
					tabData.accept(GzlfModBlocks.DEEP_SILVERORE.asItem());
					tabData.accept(GzlfModBlocks.SILVERBLOCK.asItem());
					tabData.accept(GzlfModBlocks.JBYBLOCK.asItem());
					tabData.accept(GzlfModItems.CASH);
					tabData.accept(GzlfModBlocks.TOUCH.asItem());
					tabData.accept(GzlfModItems.SILVERARMOR_HELMET);
					tabData.accept(GzlfModItems.SILVERARMOR_CHESTPLATE);
					tabData.accept(GzlfModItems.SILVERARMOR_LEGGINGS);
					tabData.accept(GzlfModItems.SILVERARMOR_BOOTS);
					tabData.accept(GzlfModItems.JBYARMOR_HELMET);
					tabData.accept(GzlfModItems.JBYARMOR_CHESTPLATE);
					tabData.accept(GzlfModItems.JBYARMOR_LEGGINGS);
					tabData.accept(GzlfModItems.JBYARMOR_BOOTS);
					tabData.accept(GzlfModItems.CHAMELEON_SPAWN_EGG);
				}).build());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(tabData -> {
			tabData.accept(GzlfModItems.CHAMELEON_SPAWN_EGG);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(GzlfModItems.JBYARMOR_HELMET);
			tabData.accept(GzlfModItems.JBYARMOR_CHESTPLATE);
			tabData.accept(GzlfModItems.JBYARMOR_LEGGINGS);
			tabData.accept(GzlfModItems.JBYARMOR_BOOTS);
			tabData.accept(GzlfModItems.SILVERARMOR_HELMET);
			tabData.accept(GzlfModItems.SILVERARMOR_CHESTPLATE);
			tabData.accept(GzlfModItems.SILVERARMOR_LEGGINGS);
			tabData.accept(GzlfModItems.SILVERARMOR_BOOTS);
		});
	}
}