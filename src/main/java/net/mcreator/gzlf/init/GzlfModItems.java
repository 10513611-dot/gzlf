/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.gzlf.item.*;
import net.mcreator.gzlf.GzlfMod;

import java.util.function.Function;

public class GzlfModItems {
	public static Item ZEPHYRBLOCK;
	public static Item MUSICDISCFJZJ;
	public static Item MUSICDISCDNH;
	public static Item MUSICDISCJLCJ;
	public static Item MUSICDISCAUAG;
	public static Item MUSICDISCYLWJ;
	public static Item MUSICDISCJIASHA;
	public static Item MUSICDISCJRZ;
	public static Item MUSICDISCMASTER;
	public static Item MUSICDISCLLT;
	public static Item MUSICDISCYYDYZ;
	public static Item MUSICDISCQIANFEN;
	public static Item MUSICDISCDENGJIE;
	public static Item MUSICDISCWIND;
	public static Item MUSICDISCMORTAL;
	public static Item MUSICDISCTTL;
	public static Item MUSICDISCYYH;
	public static Item MUSICDISCHUAIGU;
	public static Item MUSICDISCLIMING;
	public static Item MUSICDISCPRINCESS;
	public static Item MUSICDISCSBML;
	public static Item MUSICDISCQINGXIAN;
	public static Item MUSICDISCXIA;
	public static Item MUSICDISCRSG;
	public static Item MUSICDISCDIAO;
	public static Item MUSICDISCGU;
	public static Item MUSICDISCBAIGU;
	public static Item MUSICDISCMASAID;
	public static Item MUSICDISCSQ_23;
	public static Item MUSICDISCMRMX;
	public static Item MUSICDISCIKLS;
	public static Item MUSICDISCQINGLONG;
	public static Item MUSICDISCMIBEI;
	public static Item MUSICDISCSXJCG;
	public static Item MUSICDISCYHC;
	public static Item MUSICDISCWSZQW;
	public static Item MUSICDISCBE_24;
	public static Item MUSICDISCPGY;
	public static Item MUSICDISCJBY;
	public static Item MUSICDISCFENGSHEN;
	public static Item MUSICDISCB;
	public static Item MUSICDISCNHY;
	public static Item MUSICDISCCHANGSHENG;
	public static Item MUSICDISCZGT;
	public static Item MUSICDISCCHI;
	public static Item MUSICDISCBYXTZ;
	public static Item MUSICDISCZXHDMX;
	public static Item MUSICDISCHNCGM;
	public static Item MUSICDISCMENGYA;
	public static Item MUSICDISCYINGWU;
	public static Item MUSICDISCJNTTW;
	public static Item XYPORTAL;
	public static Item CHAMELEON_SPAWN_EGG;
	public static Item TEST;
	public static Item GINSENGLOG;
	public static Item GINSENGLEAVES;
	public static Item GINSENGSAPLING;
	public static Item SILVERINGOT;
	public static Item RAWSILVER;
	public static Item SILVERORE;
	public static Item JBYARMOR_HELMET;
	public static Item JBYARMOR_CHESTPLATE;
	public static Item JBYARMOR_LEGGINGS;
	public static Item JBYARMOR_BOOTS;
	public static Item SILVERNUGGET;
	public static Item SILVERBLOCK;
	public static Item JBYBLOCK;
	public static Item CASH;
	public static Item TOUCH;
	public static Item DEEP_SILVERORE;
	public static Item SILVERARMOR_HELMET;
	public static Item SILVERARMOR_CHESTPLATE;
	public static Item SILVERARMOR_LEGGINGS;
	public static Item SILVERARMOR_BOOTS;

	public static void load() {
		ZEPHYRBLOCK = block(GzlfModBlocks.ZEPHYRBLOCK, "zephyrblock");
		MUSICDISCFJZJ = register("musicdiscfjzj", MusicdiscfjzjItem::new);
		MUSICDISCDNH = register("musicdiscdnh", MusicdiscdnhItem::new);
		MUSICDISCJLCJ = register("musicdiscjlcj", MusicdiscjlcjItem::new);
		MUSICDISCAUAG = register("musicdiscauag", MusicdiscauagItem::new);
		MUSICDISCYLWJ = register("musicdiscylwj", MusicdiscylwjItem::new);
		MUSICDISCJIASHA = register("musicdiscjiasha", MusicdiscjiashaItem::new);
		MUSICDISCJRZ = register("musicdiscjrz", MusicdiscjrzItem::new);
		MUSICDISCMASTER = register("musicdiscmaster", MusicdiscmasterItem::new);
		MUSICDISCLLT = register("musicdiscllt", MusicdisclltItem::new);
		MUSICDISCYYDYZ = register("musicdiscyydyz", MusicdiscyydyzItem::new);
		MUSICDISCQIANFEN = register("musicdiscqianfen", MusicdiscqianfenItem::new);
		MUSICDISCDENGJIE = register("musicdiscdengjie", MusicdiscdengjieItem::new);
		MUSICDISCWIND = register("musicdiscwind", MusicdiscwindItem::new);
		MUSICDISCMORTAL = register("musicdiscmortal", MusicdiscmortalItem::new);
		MUSICDISCTTL = register("musicdiscttl", MusicdiscttlItem::new);
		MUSICDISCYYH = register("musicdiscyyh", MusicdiscyyhItem::new);
		MUSICDISCHUAIGU = register("musicdischuaigu", MusicdischuaiguItem::new);
		MUSICDISCLIMING = register("musicdiscliming", MusicdisclimingItem::new);
		MUSICDISCPRINCESS = register("musicdiscprincess", MusicdiscprincessItem::new);
		MUSICDISCSBML = register("musicdiscsbml", MusicdiscsbmlItem::new);
		MUSICDISCQINGXIAN = register("musicdiscqingxian", MusicdiscqingxianItem::new);
		MUSICDISCXIA = register("musicdiscxia", MusicdiscxiaItem::new);
		MUSICDISCRSG = register("musicdiscrsg", MusicdiscrsgItem::new);
		MUSICDISCDIAO = register("musicdiscdiao", MusicdiscdiaoItem::new);
		MUSICDISCGU = register("musicdiscgu", MusicdiscguItem::new);
		MUSICDISCBAIGU = register("musicdiscbaigu", MusicdiscbaiguItem::new);
		MUSICDISCMASAID = register("musicdiscmasaid", MusicdiscmasaidItem::new);
		MUSICDISCSQ_23 = register("musicdiscsq_23", Musicdiscsq23Item::new);
		MUSICDISCMRMX = register("musicdiscmrmx", MusicdiscmrmxItem::new);
		MUSICDISCIKLS = register("musicdiscikls", MusicdisciklsItem::new);
		MUSICDISCQINGLONG = register("musicdiscqinglong", MusicdiscqinglongItem::new);
		MUSICDISCMIBEI = register("musicdiscmibei", MusicdiscmibeiItem::new);
		MUSICDISCSXJCG = register("musicdiscsxjcg", MusicdiscsxjcgItem::new);
		MUSICDISCYHC = register("musicdiscyhc", MusicdiscyhcItem::new);
		MUSICDISCWSZQW = register("musicdiscwszqw", MusicdiscwszqwItem::new);
		MUSICDISCBE_24 = register("musicdiscbe_24", Musicdiscbe24Item::new);
		MUSICDISCPGY = register("musicdiscpgy", MusicdiscpgyItem::new);
		MUSICDISCJBY = register("musicdiscjby", MusicdiscjbyItem::new);
		MUSICDISCFENGSHEN = register("musicdiscfengshen", MusicdiscfengshenItem::new);
		MUSICDISCB = register("musicdiscb", MusicdiscbItem::new);
		MUSICDISCNHY = register("musicdiscnhy", MusicdiscnhyItem::new);
		MUSICDISCCHANGSHENG = register("musicdiscchangsheng", MusicdiscchangshengItem::new);
		MUSICDISCZGT = register("musicdisczgt", MusicdisczgtItem::new);
		MUSICDISCCHI = register("musicdiscchi", MusicdiscchiItem::new);
		MUSICDISCBYXTZ = register("musicdiscbyxtz", MusicdiscbyxtzItem::new);
		MUSICDISCZXHDMX = register("musicdisczxhdmx", MusicdisczxhdmxItem::new);
		MUSICDISCHNCGM = register("musicdischncgm", MusicdischncgmItem::new);
		MUSICDISCMENGYA = register("musicdiscmengya", MusicdiscmengyaItem::new);
		MUSICDISCYINGWU = register("musicdiscyingwu", MusicdiscyingwuItem::new);
		MUSICDISCJNTTW = register("musicdiscjnttw", MusicdiscjnttwItem::new);
		XYPORTAL = block(GzlfModBlocks.XYPORTAL, "xyportal");
		CHAMELEON_SPAWN_EGG = register("chameleon_spawn_egg", properties -> new SpawnEggItem(GzlfModEntities.CHAMELEON, properties));
		TEST = block(GzlfModBlocks.TEST, "test");
		GINSENGLOG = block(GzlfModBlocks.GINSENGLOG, "ginsenglog");
		GINSENGLEAVES = block(GzlfModBlocks.GINSENGLEAVES, "ginsengleaves");
		GINSENGSAPLING = block(GzlfModBlocks.GINSENGSAPLING, "ginsengsapling", new Item.Properties().rarity(Rarity.RARE));
		SILVERINGOT = register("silveringot", SilveringotItem::new);
		RAWSILVER = register("rawsilver", RawsilverItem::new);
		SILVERORE = block(GzlfModBlocks.SILVERORE, "silverore");
		JBYARMOR_HELMET = register("jbyarmor_helmet", JbyarmorItem.Helmet::new);
		JBYARMOR_CHESTPLATE = register("jbyarmor_chestplate", JbyarmorItem.Chestplate::new);
		JBYARMOR_LEGGINGS = register("jbyarmor_leggings", JbyarmorItem.Leggings::new);
		JBYARMOR_BOOTS = register("jbyarmor_boots", JbyarmorItem.Boots::new);
		SILVERNUGGET = register("silvernugget", SilvernuggetItem::new);
		SILVERBLOCK = block(GzlfModBlocks.SILVERBLOCK, "silverblock");
		JBYBLOCK = block(GzlfModBlocks.JBYBLOCK, "jbyblock");
		CASH = register("cash", CashItem::new);
		TOUCH = block(GzlfModBlocks.TOUCH, "touch");
		DEEP_SILVERORE = block(GzlfModBlocks.DEEP_SILVERORE, "deep_silverore");
		SILVERARMOR_HELMET = register("silverarmor_helmet", SilverarmorItem.Helmet::new);
		SILVERARMOR_CHESTPLATE = register("silverarmor_chestplate", SilverarmorItem.Chestplate::new);
		SILVERARMOR_LEGGINGS = register("silverarmor_leggings", SilverarmorItem.Leggings::new);
		SILVERARMOR_BOOTS = register("silverarmor_boots", SilverarmorItem.Boots::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}