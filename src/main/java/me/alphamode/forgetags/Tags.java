package me.alphamode.forgetags;

import net.fabricmc.fabric.api.tag.TagFactory;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.function.Supplier;

//TODO: IMPLEMENT ALL THESE TAGS WITH COMMON ONES
public class Tags
{
	public static void init ()
	{
		Blocks.init();
		Items.init();
		Fluids.init();
	}

	public static class Blocks
	{
		private static void init(){}

		public static final Tag.Identified<Block> BARRELS = tag("barrels");
		public static final Tag.Identified<Block> BARRELS_WOODEN = tag("barrels/wooden");
		public static final Tag.Identified<Block> CHESTS = tag("chests");
		public static final Tag.Identified<Block> CHESTS_ENDER = tag("chests/ender");
		public static final Tag.Identified<Block> CHESTS_TRAPPED = tag("chests/trapped");
		public static final Tag.Identified<Block> CHESTS_WOODEN = tag("chests/wooden");
		public static final Tag.Identified<Block> COBBLESTONE = tag("cobblestone");
		public static final Tag.Identified<Block> END_STONES = tag("end_stones");
		public static final Tag.Identified<Block> ENDERMAN_PLACE_ON_BLACKLIST = tag("enderman_place_on_blacklist");
		public static final Tag.Identified<Block> FENCE_GATES = tag("fence_gates");
		public static final Tag.Identified<Block> FENCE_GATES_WOODEN = tag("fence_gates/wooden");
		public static final Tag.Identified<Block> FENCES = tag("fences");
		public static final Tag.Identified<Block> FENCES_NETHER_BRICK = tag("fences/nether_brick");
		public static final Tag.Identified<Block> FENCES_WOODEN = tag("fences/wooden");

		public static final Tag.Identified<Block> GLASS = tag("glass");
		public static final Tag.Identified<Block> GLASS_BLACK = tag("glass/black");
		public static final Tag.Identified<Block> GLASS_BLUE = tag("glass/blue");
		public static final Tag.Identified<Block> GLASS_BROWN = tag("glass/brown");
		public static final Tag.Identified<Block> GLASS_COLORLESS = tag("glass/colorless");
		public static final Tag.Identified<Block> GLASS_CYAN = tag("glass/cyan");
		public static final Tag.Identified<Block> GLASS_GRAY = tag("glass/gray");
		public static final Tag.Identified<Block> GLASS_GREEN = tag("glass/green");
		public static final Tag.Identified<Block> GLASS_LIGHT_BLUE = tag("glass/light_blue");
		public static final Tag.Identified<Block> GLASS_LIGHT_GRAY = tag("glass/light_gray");
		public static final Tag.Identified<Block> GLASS_LIME = tag("glass/lime");
		public static final Tag.Identified<Block> GLASS_MAGENTA = tag("glass/magenta");
		public static final Tag.Identified<Block> GLASS_ORANGE = tag("glass/orange");
		public static final Tag.Identified<Block> GLASS_PINK = tag("glass/pink");
		public static final Tag.Identified<Block> GLASS_PURPLE = tag("glass/purple");
		public static final Tag.Identified<Block> GLASS_RED = tag("glass/red");
		/**
		 * Glass which is made from sand and only minor additional ingredients like dyes
		 */
		public static final Tag.Identified<Block> GLASS_SILICA = tag("glass/silica");
		public static final Tag.Identified<Block> GLASS_TINTED = tag("glass/tinted");
		public static final Tag.Identified<Block> GLASS_WHITE = tag("glass/white");
		public static final Tag.Identified<Block> GLASS_YELLOW = tag("glass/yellow");

		public static final Tag.Identified<Block> GLASS_PANES = tag("glass_panes");
		public static final Tag.Identified<Block> GLASS_PANES_BLACK = tag("glass_panes/black");
		public static final Tag.Identified<Block> GLASS_PANES_BLUE = tag("glass_panes/blue");
		public static final Tag.Identified<Block> GLASS_PANES_BROWN = tag("glass_panes/brown");
		public static final Tag.Identified<Block> GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
		public static final Tag.Identified<Block> GLASS_PANES_CYAN = tag("glass_panes/cyan");
		public static final Tag.Identified<Block> GLASS_PANES_GRAY = tag("glass_panes/gray");
		public static final Tag.Identified<Block> GLASS_PANES_GREEN = tag("glass_panes/green");
		public static final Tag.Identified<Block> GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
		public static final Tag.Identified<Block> GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
		public static final Tag.Identified<Block> GLASS_PANES_LIME = tag("glass_panes/lime");
		public static final Tag.Identified<Block> GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
		public static final Tag.Identified<Block> GLASS_PANES_ORANGE = tag("glass_panes/orange");
		public static final Tag.Identified<Block> GLASS_PANES_PINK = tag("glass_panes/pink");
		public static final Tag.Identified<Block> GLASS_PANES_PURPLE = tag("glass_panes/purple");
		public static final Tag.Identified<Block> GLASS_PANES_RED = tag("glass_panes/red");
		public static final Tag.Identified<Block> GLASS_PANES_WHITE = tag("glass_panes/white");
		public static final Tag.Identified<Block> GLASS_PANES_YELLOW = tag("glass_panes/yellow");

		public static final Tag.Identified<Block> GRAVEL = tag("gravel");
		public static final Tag.Identified<Block> NETHERRACK = tag("netherrack");
		public static final Tag.Identified<Block> OBSIDIAN = tag("obsidian");
		/**
		 * Blocks which are often replaced by deepslate ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_DEEPSLATE}, during world generation
		 */
		public static final Tag.Identified<Block> ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
		/**
		 * Blocks which are often replaced by netherrack ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_NETHERRACK}, during world generation
		 */
		public static final Tag.Identified<Block> ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
		/**
		 * Blocks which are often replaced by stone ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_STONE}, during world generation
		 */
		public static final Tag.Identified<Block> ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
		/**
		 * Ores which on average result in more than one resource worth of materials
		 */
		public static final Tag.Identified<Block> ORE_RATES_DENSE = tag("ore_rates/dense");
		/**
		 * Ores which on average result in one resource worth of materials
		 */
		public static final Tag.Identified<Block> ORE_RATES_SINGULAR = tag("ore_rates/singular");
		/**
		 * Ores which on average result in less than one resource worth of materials
		 */
		public static final Tag.Identified<Block> ORE_RATES_SPARSE = tag("ore_rates/sparse");
		public static final Tag.Identified<Block> ORES = tag("ores");
		public static final Tag.Identified<Block> ORES_COAL = tag("ores/coal");
		public static final Tag.Identified<Block> ORES_COPPER = tag("ores/copper");
		public static final Tag.Identified<Block> ORES_DIAMOND = tag("ores/diamond");
		public static final Tag.Identified<Block> ORES_EMERALD = tag("ores/emerald");
		public static final Tag.Identified<Block> ORES_GOLD = tag("ores/gold");
		public static final Tag.Identified<Block> ORES_IRON = tag("ores/iron");
		public static final Tag.Identified<Block> ORES_LAPIS = tag("ores/lapis");
		public static final Tag.Identified<Block> ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
		public static final Tag.Identified<Block> ORES_QUARTZ = tag("ores/quartz");
		public static final Tag.Identified<Block> ORES_REDSTONE = tag("ores/redstone");
		/**
		 * Ores in deepslate (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_DEEPSLATE}) which could logically use deepslate as recipe input or output
		 */
		public static final Tag.Identified<Block> ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
		/**
		 * Ores in netherrack (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_NETHERRACK}) which could logically use netherrack as recipe input or output
		 */
		public static final Tag.Identified<Block> ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
		/**
		 * Ores in stone (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_STONE}) which could logically use stone as recipe input or output
		 */
		public static final Tag.Identified<Block> ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");

		public static final Tag.Identified<Block> SAND = tag("sand");
		public static final Tag.Identified<Block> SAND_COLORLESS = tag("sand/colorless");
		public static final Tag.Identified<Block> SAND_RED = tag("sand/red");

		public static final Tag.Identified<Block> SANDSTONE = tag("sandstone");
		public static final Tag.Identified<Block> STAINED_GLASS = tag("stained_glass");
		public static final Tag.Identified<Block> STAINED_GLASS_PANES = tag("stained_glass_panes");
		public static final Tag.Identified<Block> STONE = tag("stone");
		public static final Tag.Identified<Block> STORAGE_BLOCKS = tag("storage_blocks");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
		public static final Tag.Identified<Block> STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");

		public static final Tag.Identified<Block> NEEDS_WOOD_TOOL = tag("needs_wood_tool");
		public static final Tag.Identified<Block> NEEDS_GOLD_TOOL = tag("needs_gold_tool");
		public static final Tag.Identified<Block> NEEDS_NETHERITE_TOOL = tag("needs_netherite_tool");

		private static Tag.Identified<Block> tag(String name)
		{
			return TagFactory.BLOCK.create(new Identifier("c", name));
		}
	}

	public static class Items
	{
		private static void init(){}

		public static final Tag.Identified<Item> BARRELS = tag("barrels");
		public static final Tag.Identified<Item> BARRELS_WOODEN = tag("barrels/wooden");
		public static final Tag.Identified<Item> BONES = tag("bones");
		public static final Tag.Identified<Item> BOOKSHELVES = tag("bookshelves");
		public static final Tag.Identified<Item> CHESTS = tag("chests");
		public static final Tag.Identified<Item> CHESTS_ENDER = tag("chests/ender");
		public static final Tag.Identified<Item> CHESTS_TRAPPED = tag("chests/trapped");
		public static final Tag.Identified<Item> CHESTS_WOODEN = tag("chests/wooden");
		public static final Tag.Identified<Item> COBBLESTONE = tag("cobblestone");
		public static final Tag.Identified<Item> CROPS = tag("crops");
		public static final Tag.Identified<Item> CROPS_BEETROOT = tag("crops/beetroot");
		public static final Tag.Identified<Item> CROPS_CARROT = tag("crops/carrot");
		public static final Tag.Identified<Item> CROPS_NETHER_WART = tag("crops/nether_wart");
		public static final Tag.Identified<Item> CROPS_POTATO = tag("crops/potato");
		public static final Tag.Identified<Item> CROPS_WHEAT = tag("crops/wheat");
		public static final Tag.Identified<Item> DUSTS = tag("dusts");
		public static final Tag.Identified<Item> DUSTS_PRISMARINE = tag("dusts/prismarine");
		public static final Tag.Identified<Item> DUSTS_REDSTONE = tag("dusts/redstone");
		public static final Tag.Identified<Item> DUSTS_GLOWSTONE = tag("dusts/glowstone");

		public static final Tag.Identified<Item> DYES = tag("dyes");
		public static final Tag.Identified<Item> DYES_BLACK = DyeUtil.getDyeTag(DyeColor.BLACK);
		public static final Tag.Identified<Item> DYES_RED = DyeUtil.getDyeTag(DyeColor.RED);
		public static final Tag.Identified<Item> DYES_GREEN = DyeUtil.getDyeTag(DyeColor.GREEN);
		public static final Tag.Identified<Item> DYES_BROWN = DyeUtil.getDyeTag(DyeColor.BROWN);
		public static final Tag.Identified<Item> DYES_BLUE = DyeUtil.getDyeTag(DyeColor.BLUE);
		public static final Tag.Identified<Item> DYES_PURPLE = DyeUtil.getDyeTag(DyeColor.PURPLE);
		public static final Tag.Identified<Item> DYES_CYAN = DyeUtil.getDyeTag(DyeColor.CYAN);
		public static final Tag.Identified<Item> DYES_LIGHT_GRAY = DyeUtil.getDyeTag(DyeColor.LIGHT_GRAY);
		public static final Tag.Identified<Item> DYES_GRAY = DyeUtil.getDyeTag(DyeColor.GRAY);
		public static final Tag.Identified<Item> DYES_PINK = DyeUtil.getDyeTag(DyeColor.PINK);
		public static final Tag.Identified<Item> DYES_LIME = DyeUtil.getDyeTag(DyeColor.LIME);
		public static final Tag.Identified<Item> DYES_YELLOW = DyeUtil.getDyeTag(DyeColor.YELLOW);
		public static final Tag.Identified<Item> DYES_LIGHT_BLUE = DyeUtil.getDyeTag(DyeColor.LIGHT_BLUE);
		public static final Tag.Identified<Item> DYES_MAGENTA = DyeUtil.getDyeTag(DyeColor.MAGENTA);
		public static final Tag.Identified<Item> DYES_ORANGE = DyeUtil.getDyeTag(DyeColor.ORANGE);
		public static final Tag.Identified<Item> DYES_WHITE = DyeUtil.getDyeTag(DyeColor.WHITE);

		public static final Tag.Identified<Item> EGGS = tag("eggs");
		public static final Tag.Identified<Item> ENCHANTING_FUELS = tag("enchanting_fuels", Set.of(() -> net.minecraft.item.Items.LAPIS_LAZULI));
		public static final Tag.Identified<Item> END_STONES = tag("end_stones");
		public static final Tag.Identified<Item> ENDER_PEARLS = tag("ender_pearls");
		public static final Tag.Identified<Item> FEATHERS = tag("feathers");
		public static final Tag.Identified<Item> FENCE_GATES = tag("fence_gates");
		public static final Tag.Identified<Item> FENCE_GATES_WOODEN = tag("fence_gates/wooden");
		public static final Tag.Identified<Item> FENCES = tag("fences");
		public static final Tag.Identified<Item> FENCES_NETHER_BRICK = tag("fences/nether_brick");
		public static final Tag.Identified<Item> FENCES_WOODEN = tag("fences/wooden");
		public static final Tag.Identified<Item> GEMS = tag("gems");
		public static final Tag.Identified<Item> GEMS_DIAMOND = tag("gems/diamond");
		public static final Tag.Identified<Item> GEMS_EMERALD = tag("gems/emerald");
		public static final Tag.Identified<Item> GEMS_AMETHYST = tag("gems/amethyst");
		public static final Tag.Identified<Item> GEMS_LAPIS = tag("gems/lapis");
		public static final Tag.Identified<Item> GEMS_PRISMARINE = tag("gems/prismarine");
		public static final Tag.Identified<Item> GEMS_QUARTZ = tag("gems/quartz");

		public static final Tag.Identified<Item> GLASS = tag("glass");
		public static final Tag.Identified<Item> GLASS_BLACK = tag("glass/black");
		public static final Tag.Identified<Item> GLASS_BLUE = tag("glass/blue");
		public static final Tag.Identified<Item> GLASS_BROWN = tag("glass/brown");
		public static final Tag.Identified<Item> GLASS_COLORLESS = tag("glass/colorless");
		public static final Tag.Identified<Item> GLASS_CYAN = tag("glass/cyan");
		public static final Tag.Identified<Item> GLASS_GRAY = tag("glass/gray");
		public static final Tag.Identified<Item> GLASS_GREEN = tag("glass/green");
		public static final Tag.Identified<Item> GLASS_LIGHT_BLUE = tag("glass/light_blue");
		public static final Tag.Identified<Item> GLASS_LIGHT_GRAY = tag("glass/light_gray");
		public static final Tag.Identified<Item> GLASS_LIME = tag("glass/lime");
		public static final Tag.Identified<Item> GLASS_MAGENTA = tag("glass/magenta");
		public static final Tag.Identified<Item> GLASS_ORANGE = tag("glass/orange");
		public static final Tag.Identified<Item> GLASS_PINK = tag("glass/pink");
		public static final Tag.Identified<Item> GLASS_PURPLE = tag("glass/purple");
		public static final Tag.Identified<Item> GLASS_RED = tag("glass/red");
		/**
		 * Glass which is made from sand and only minor additional ingredients like dyes
		 */
		public static final Tag.Identified<Item> GLASS_SILICA = tag("glass/silica");
		public static final Tag.Identified<Item> GLASS_TINTED = tag("glass/tinted");
		public static final Tag.Identified<Item> GLASS_WHITE = tag("glass/white");
		public static final Tag.Identified<Item> GLASS_YELLOW = tag("glass/yellow");

		public static final Tag.Identified<Item> GLASS_PANES = tag("glass_panes");
		public static final Tag.Identified<Item> GLASS_PANES_BLACK = tag("glass_panes/black");
		public static final Tag.Identified<Item> GLASS_PANES_BLUE = tag("glass_panes/blue");
		public static final Tag.Identified<Item> GLASS_PANES_BROWN = tag("glass_panes/brown");
		public static final Tag.Identified<Item> GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
		public static final Tag.Identified<Item> GLASS_PANES_CYAN = tag("glass_panes/cyan");
		public static final Tag.Identified<Item> GLASS_PANES_GRAY = tag("glass_panes/gray");
		public static final Tag.Identified<Item> GLASS_PANES_GREEN = tag("glass_panes/green");
		public static final Tag.Identified<Item> GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
		public static final Tag.Identified<Item> GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
		public static final Tag.Identified<Item> GLASS_PANES_LIME = tag("glass_panes/lime");
		public static final Tag.Identified<Item> GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
		public static final Tag.Identified<Item> GLASS_PANES_ORANGE = tag("glass_panes/orange");
		public static final Tag.Identified<Item> GLASS_PANES_PINK = tag("glass_panes/pink");
		public static final Tag.Identified<Item> GLASS_PANES_PURPLE = tag("glass_panes/purple");
		public static final Tag.Identified<Item> GLASS_PANES_RED = tag("glass_panes/red");
		public static final Tag.Identified<Item> GLASS_PANES_WHITE = tag("glass_panes/white");
		public static final Tag.Identified<Item> GLASS_PANES_YELLOW = tag("glass_panes/yellow");

		public static final Tag.Identified<Item> GRAVEL = tag("gravel");
		public static final Tag.Identified<Item> GUNPOWDER = tag("gunpowder");
		public static final Tag.Identified<Item> HEADS = tag("heads");
		public static final Tag.Identified<Item> INGOTS = tag("ingots");
		public static final Tag.Identified<Item> INGOTS_BRICK = tag("ingots/brick");
		public static final Tag.Identified<Item> INGOTS_COPPER = tag("ingots/copper");
		public static final Tag.Identified<Item> INGOTS_GOLD = tag("ingots/gold");
		public static final Tag.Identified<Item> INGOTS_IRON = tag("ingots/iron");
		public static final Tag.Identified<Item> INGOTS_NETHERITE = tag("ingots/netherite");
		public static final Tag.Identified<Item> INGOTS_NETHER_BRICK = tag("ingots/nether_brick");
		public static final Tag.Identified<Item> LEATHER = tag("leather");
		public static final Tag.Identified<Item> MUSHROOMS = tag("mushrooms");
		public static final Tag.Identified<Item> NETHER_STARS = tag("nether_stars");
		public static final Tag.Identified<Item> NETHERRACK = tag("netherrack");
		public static final Tag.Identified<Item> NUGGETS = tag("nuggets");
		public static final Tag.Identified<Item> NUGGETS_GOLD = tag("nuggets/gold");
		public static final Tag.Identified<Item> NUGGETS_IRON = tag("nuggets/iron");
		public static final Tag.Identified<Item> OBSIDIAN = tag("obsidian");
		/**
		 * Blocks which are often replaced by deepslate ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_DEEPSLATE}, during world generation
		 */
		public static final Tag.Identified<Item> ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
		/**
		 * Blocks which are often replaced by netherrack ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_NETHERRACK}, during world generation
		 */
		public static final Tag.Identified<Item> ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
		/**
		 * Blocks which are often replaced by stone ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_STONE}, during world generation
		 */
		public static final Tag.Identified<Item> ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
		/**
		 * Ores which on average result in more than one resource worth of materials
		 */
		public static final Tag.Identified<Item> ORE_RATES_DENSE = tag("ore_rates/dense");
		/**
		 * Ores which on average result in one resource worth of materials
		 */
		public static final Tag.Identified<Item> ORE_RATES_SINGULAR = tag("ore_rates/singular");
		/**
		 * Ores which on average result in less than one resource worth of materials
		 */
		public static final Tag.Identified<Item> ORE_RATES_SPARSE = tag("ore_rates/sparse");
		public static final Tag.Identified<Item> ORES = tag("ores");
		public static final Tag.Identified<Item> ORES_COAL = tag("ores/coal");
		public static final Tag.Identified<Item> ORES_COPPER = tag("ores/copper");
		public static final Tag.Identified<Item> ORES_DIAMOND = tag("ores/diamond");
		public static final Tag.Identified<Item> ORES_EMERALD = tag("ores/emerald");
		public static final Tag.Identified<Item> ORES_GOLD = tag("ores/gold");
		public static final Tag.Identified<Item> ORES_IRON = tag("ores/iron");
		public static final Tag.Identified<Item> ORES_LAPIS = tag("ores/lapis");
		public static final Tag.Identified<Item> ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
		public static final Tag.Identified<Item> ORES_QUARTZ = tag("ores/quartz");
		public static final Tag.Identified<Item> ORES_REDSTONE = tag("ores/redstone");
		/**
		 * Ores in deepslate (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_DEEPSLATE}) which could logically use deepslate as recipe input or output
		 */
		public static final Tag.Identified<Item> ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
		/**
		 * Ores in netherrack (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_NETHERRACK}) which could logically use netherrack as recipe input or output
		 */
		public static final Tag.Identified<Item> ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
		/**
		 * Ores in stone (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_STONE}) which could logically use stone as recipe input or output
		 */
		public static final Tag.Identified<Item> ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");
		public static final Tag.Identified<Item> RAW_MATERIALS = tag("raw_materials");
		public static final Tag.Identified<Item> RAW_MATERIALS_COPPER = tag("raw_materials/copper");
		public static final Tag.Identified<Item> RAW_MATERIALS_GOLD = tag("raw_materials/gold");
		public static final Tag.Identified<Item> RAW_MATERIALS_IRON = tag("raw_materials/iron");
		public static final Tag.Identified<Item> RODS = tag("rods");
		public static final Tag.Identified<Item> RODS_BLAZE = tag("rods/blaze");
		public static final Tag.Identified<Item> RODS_WOODEN = tag("rods/wooden");

		public static final Tag.Identified<Item> SAND = tag("sand");
		public static final Tag.Identified<Item> SAND_COLORLESS = tag("sand/colorless");
		public static final Tag.Identified<Item> SAND_RED = tag("sand/red");

		public static final Tag.Identified<Item> SANDSTONE = tag("sandstone");
		public static final Tag.Identified<Item> SEEDS = tag("seeds");
		public static final Tag.Identified<Item> SEEDS_BEETROOT = tag("seeds/beetroot");
		public static final Tag.Identified<Item> SEEDS_MELON = tag("seeds/melon");
		public static final Tag.Identified<Item> SEEDS_PUMPKIN = tag("seeds/pumpkin");
		public static final Tag.Identified<Item> SEEDS_WHEAT = tag("seeds/wheat");
		public static final Tag.Identified<Item> SHEARS = tag("shears");
		public static final Tag.Identified<Item> SLIMEBALLS = tag("slimeballs");
		public static final Tag.Identified<Item> STAINED_GLASS = tag("stained_glass");
		public static final Tag.Identified<Item> STAINED_GLASS_PANES = tag("stained_glass_panes");
		public static final Tag.Identified<Item> STONE = tag("stone");
		public static final Tag.Identified<Item> STORAGE_BLOCKS = tag("storage_blocks");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
		public static final Tag.Identified<Item> STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");
		public static final Tag.Identified<Item> STRING = tag("string");

		private static Tag.Identified<Item> tag(String name, @Nullable Set<Supplier<Item>> defaults)
		{
			return TagFactory.ITEM.create(new Identifier("c", name));
		}

		private static Tag.Identified<Item> tag(String name)
		{
			return tag(name, null);
		}
	}

	public static class Fluids
	{
		private static void init() {}

		public static final Tag.Identified<Fluid> MILK = tag("milk");

		private static Tag.Identified<Fluid> tag(String name)
		{
			return TagFactory.FLUID.create(new Identifier("c", name));
		}
	}
}
