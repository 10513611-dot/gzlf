/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.gzlf.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

import java.util.Optional;

public class GzlfModTrades {
	private static final ResourceLocation CUSTOM_WANDERING_TRADER_POOL = ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "custom_wandering_trader_pool");

	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("gzlf:composer")), 1, builder -> {
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.SILVERINGOT, 40), new ItemStack(Blocks.DANDELION, 32), new ItemStack(GzlfModItems.MUSICDISCPGY), 5, 4, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.CASH, 5), ItemStack.EMPTY,  new ItemStack(GzlfModItems.MUSICDISCHNCGM), 5, 4, 0.05f));
			builder.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(GzlfModItems.SILVERINGOT, 5), 10, 2, 0.05f));
			builder.add(new BasicTrade(new ItemStack(Items.PAPER, 3), ItemStack.EMPTY, new ItemStack(GzlfModItems.SILVERINGOT), 20, 1, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("gzlf:composer")), 2, builder -> {
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.SILVERINGOT, 50), new ItemStack(Blocks.MANGROVE_PROPAGULE, 8), new ItemStack(GzlfModItems.MUSICDISCMENGYA), 5, 6, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.CASH, 10), ItemStack.EMPTY, new ItemStack(GzlfModItems.MUSICDISCHUAIGU), 5, 6, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModBlocks.SILVERBLOCK, 8), ItemStack.EMPTY, new ItemStack(GzlfModItems.MUSICDISCNHY), 5, 10, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("gzlf:composer")), 3, builder -> {
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.SILVERINGOT, 10), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 20, 4, 0.05f));
			builder.add(new BasicTrade(new ItemStack(Blocks.FROGSPAWN, 4), new ItemStack(Items.LAVA_BUCKET), new ItemStack(GzlfModItems.MUSICDISCWSZQW), 5, 20, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.CASH, 10), ItemStack.EMPTY, new ItemStack(GzlfModItems.MUSICDISCB), 5, 20, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("gzlf:composer")), 4, builder -> {
			builder.add(new BasicTrade(new ItemStack(GzlfModBlocks.SILVERBLOCK, 8), ItemStack.EMPTY, new ItemStack(GzlfModItems.MUSICDISCJLCJ), 5, 20, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.CASH), ItemStack.EMPTY, new ItemStack(GzlfModItems.MUSICDISCZGT), 5, 25, 0.05f));
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.SILVERINGOT, 16), ItemStack.EMPTY, new ItemStack(GzlfModItems.CASH), 10, 10, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("gzlf:composer")), 5, builder -> {
			builder.add(new BasicTrade(new ItemStack(GzlfModItems.CASH, 20), ItemStack.EMPTY, new ItemStack(GzlfModBlocks.XYPORTAL), 1, 5, 0.05f));
		});
	}

	private record BasicTrade(
			ItemStack price,
			ItemStack price2,
			ItemStack offer,
			int maxTrades,
			int xp,
			float priceMult
	)

			implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(new ItemCost(price.getItem()), Optional.of(new ItemCost(price2.getItem())), offer, maxTrades, xp, priceMult);
		}
	}
}