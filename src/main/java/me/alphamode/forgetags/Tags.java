package me.alphamode.forgetags;

import net.fabricmc.fabric.api.tag.TagFactory;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

//TODO: IMPLEMENT ALL THESE TAGS WITH COMMON ONES
public class Tags {
	public static class Items {
		public static Tag.Identified<Item> tag(String id) {
			return TagFactory.ITEM.create(new Identifier("c", id));
		}
		public static final Tag.Identified<Item> STONE = tag("stone");
		public static final Tag.Identified<Item> COBBLESTONE = tag("cobblestone");
		public static final Tag.Identified<Item> ORES = tag("ores");
		public static final Tag.Identified<Item> ORES_COAL = tag("coal_ores");
		public static final Tag.Identified<Item> ORES_DIAMOND = tag("diamond_ores");
		public static final Tag.Identified<Item> ORES_EMERALD = tag("emerald_ores");
		public static final Tag.Identified<Item> ORES_GOLD = tag("gold_ores");
		public static final Tag.Identified<Item> ORES_IRON = tag("iron_ores");
		public static final Tag.Identified<Item> ORES_LAPIS = tag("lapis_ores");
		public static final Tag.Identified<Item> ORES_REDSTONE = tag("redstone_ores");
		public static final Tag.Identified<Item> ORES_QUARTZ = tag("quartz_ores");
		public static final Tag.Identified<Item> ORES_NETHERITE_SCRAP = tag("ancient_debris");
		public static final Tag.Identified<Item> NUGGETS = tag("nuggets");
		public static final Tag.Identified<Item> NUGGETS_IRON = tag("iron_nuggets");
		public static final Tag.Identified<Item> DYES = tag("dyes");
		public static final Tag.Identified<Item> SLIMEBALLS = tag("slimeballs");
		public static final Tag.Identified<Item> DUSTS_REDSTONE = tag("redstone_dusts");
		public static final Tag.Identified<Item> INGOTS_IRON = tag("iron_ingots");
		public static final Tag.Identified<Item> IRON_PLATES = tag("iron_plates");
		public static final Tag.Identified<Item> INGOTS_BRASS = tag("brass_ingots");

		public static final Tag.Identified<Item> RODS = tag("rods");
		public static final Tag.Identified<Item> RODS_BLAZE = tag("blaze_rods");
		public static final Tag.Identified<Item> RODS_WOODEN = tag("wooden_rods");
		public static final Tag.Identified<Item> ZINC_ORES = tag("zinc_ores");
		public static final Tag.Identified<Item> DUSTS_GLOWSTONE = tag("glowstone_dust");
		public static final Tag.Identified<Item> GLASS_PANES = tag("glass_panes");
		public static final Tag.Identified<Item> STAINED_GLASS = tag("stained_glass");
		public static final Tag.Identified<Item> STAINED_GLASS_PANES = tag("stained_glass_panes");
		public static final Tag.Identified<Item> COPPER_PLATES = tag("copper_plates");
		public static final Tag.Identified<Item> OBSIDIAN = tag("obsidian");
		public static final Tag.Identified<Item> STORAGE_BLOCKS = tag("storage_blocks");
		public static final Tag.Identified<Item> ENDER_PEARLS = tag("ender_pearls");
		public static final Tag.Identified<Item> GLASS = tag("glass");
		public static final Tag.Identified<Item> GLASS_BLACK = tag("black_glass");
		public static final Tag.Identified<Item> GLASS_BLUE = tag("blue_glass");
		public static final Tag.Identified<Item> GLASS_BROWN = tag("brown_glass");
		public static final Tag.Identified<Item> GLASS_COLORLESS = tag("colorless_glass");
		public static final Tag.Identified<Item> GLASS_CYAN = tag("cyan_glass");
		public static final Tag.Identified<Item> GLASS_GRAY = tag("gray_glass");
		public static final Tag.Identified<Item> GLASS_GREEN = tag("green_glass");
		public static final Tag.Identified<Item> GLASS_LIGHT_BLUE = tag("light_blue_glass");
		public static final Tag.Identified<Item> GLASS_LIGHT_GRAY = tag("light_gray_glass");
		public static final Tag.Identified<Item> GLASS_LIME = tag("lime_glass");
		public static final Tag.Identified<Item> GLASS_MAGENTA = tag("magenta_glass");
		public static final Tag.Identified<Item> GLASS_ORANGE = tag("orange_glass");
		public static final Tag.Identified<Item> GLASS_PINK = tag("pink_glass");
		public static final Tag.Identified<Item> GLASS_PURPLE = tag("purple_glass");
		public static final Tag.Identified<Item> GLASS_RED = tag("red_glass");
		public static final Tag.Identified<Item> GLASS_WHITE = tag("white_glass");
		public static final Tag.Identified<Item> GLASS_YELLOW = tag("yellow_glass");
	}
	public static class Blocks {
		public static Tag.Identified<Block> tag(String id) {
			return TagFactory.BLOCK.create(new Identifier("c", id));
		}
		public static final Tag.Identified<Block> STONE = tag("stone");
		public static final Tag.Identified<Block> COBBLESTONE = tag("cobblestone");
		public static final Tag.Identified<Block> ORES = tag("ores");
		public static final Tag.Identified<Block> ORES_COAL = tag("coal_ores");
		public static final Tag.Identified<Block> ORES_DIAMOND = tag("diamond_ores");
		public static final Tag.Identified<Block> ORES_EMERALD = tag("emerald_ores");
		public static final Tag.Identified<Block> ORES_GOLD = tag("gold_ores");
		public static final Tag.Identified<Block> ORES_IRON = tag("iron_ores");
		public static final Tag.Identified<Block> ORES_LAPIS = tag("lapis_ores");
		public static final Tag.Identified<Block> ORES_REDSTONE = tag("redstone_ores");
		public static final Tag.Identified<Block> ORES_QUARTZ = tag("quartz_ores");
		public static final Tag.Identified<Block> ORES_NETHERITE_SCRAP = tag("ancient_debris");
		public static final Tag.Identified<Block> STAINED_GLASS = tag("stained_glass");
		public static final Tag.Identified<Block> GLASS = tag("glass");
		public static final Tag.Identified<Block> GLASS_BLACK = tag("black_glass");
		public static final Tag.Identified<Block> GLASS_BLUE = tag("blue_glass");
		public static final Tag.Identified<Block> GLASS_BROWN = tag("brown_glass");
		public static final Tag.Identified<Block> GLASS_COLORLESS = tag("colorless_glass");
		public static final Tag.Identified<Block> GLASS_CYAN = tag("cyan_glass");
		public static final Tag.Identified<Block> GLASS_GRAY = tag("gray_glass");
		public static final Tag.Identified<Block> GLASS_GREEN = tag("green_glass");
		public static final Tag.Identified<Block> GLASS_LIGHT_BLUE = tag("light_blue_glass");
		public static final Tag.Identified<Block> GLASS_LIGHT_GRAY = tag("light_gray_glass");
		public static final Tag.Identified<Block> GLASS_LIME = tag("lime_glass");
		public static final Tag.Identified<Block> GLASS_MAGENTA = tag("magenta_glass");
		public static final Tag.Identified<Block> GLASS_ORANGE = tag("orange_glass");
		public static final Tag.Identified<Block> GLASS_PINK = tag("pink_glass");
		public static final Tag.Identified<Block> GLASS_PURPLE = tag("purple_glass");
		public static final Tag.Identified<Block> GLASS_RED = tag("red_glass");
		public static final Tag.Identified<Block> GLASS_WHITE = tag("white_glass");
		public static final Tag.Identified<Block> GLASS_YELLOW = tag("yellow_glass");
		public static final Tag.Identified<Block> GLASS_PANES = tag("glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_BLACK = tag("black_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_BLUE = tag("blue_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_BROWN = tag("brown_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_COLORLESS = tag("colorless_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_CYAN = tag("cyan_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_GRAY = tag("gray_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_GREEN = tag("green_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_LIGHT_BLUE = tag("light_blue_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_LIGHT_GRAY = tag("light_gray_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_LIME = tag("lime_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_MAGENTA = tag("magenta_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_ORANGE = tag("orange_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_PINK = tag("pink_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_PURPLE = tag("purple_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_RED = tag("red_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_WHITE = tag("white_glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_YELLOW = tag("yellow_glass_panes");
		public static final Tag.Identified<Block> STAINED_GLASS_PANES = tag("stained_glass_panes");
		public static final Tag.Identified<Block> STORAGE_BLOCKS = tag("storage_blocks");
	}
	public static class Fluids {
		public static Tag.Identified<Fluid> tag(String id) {
			return TagFactory.FLUID.create(new Identifier("c", id));
		}

		public static final Tag.Identified<Fluid> MILK = tag("milk");
	}
}
