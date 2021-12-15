package me.alphamode.forgetags.data;

import me.alphamode.forgetags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
        super(dataGenerator, blockTagProvider);
    }

    @Override
    protected void generateTags() {
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        copy(Tags.Blocks.ORES_GOLD, Tags.Items.ORES_GOLD);
        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        copy(Tags.Blocks.ORES_QUARTZ, Tags.Items.ORES_QUARTZ);
        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);
        copy(Tags.Blocks.ORES_NETHERITE_SCRAP, Tags.Items.ORES_NETHERITE_SCRAP);
        copy(Tags.Blocks.OBSIDIAN, Tags.Items.OBSIDIAN);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(Tags.Blocks.STORAGE_BLOCKS_COAL, Tags.Items.STORAGE_BLOCKS_COAL);
        copy(Tags.Blocks.STORAGE_BLOCKS_DIAMOND, Tags.Items.STORAGE_BLOCKS_DIAMOND);
        copy(Tags.Blocks.STORAGE_BLOCKS_EMERALD, Tags.Items.STORAGE_BLOCKS_EMERALD);
        copy(Tags.Blocks.STORAGE_BLOCKS_GOLD, Tags.Items.STORAGE_BLOCKS_GOLD);
        copy(Tags.Blocks.STORAGE_BLOCKS_IRON, Tags.Items.STORAGE_BLOCKS_IRON);
        copy(Tags.Blocks.STORAGE_BLOCKS_LAPIS, Tags.Items.STORAGE_BLOCKS_LAPIS);
        copy(Tags.Blocks.STORAGE_BLOCKS_QUARTZ, Tags.Items.STORAGE_BLOCKS_QUARTZ);
        copy(Tags.Blocks.STORAGE_BLOCKS_REDSTONE, Tags.Items.STORAGE_BLOCKS_REDSTONE);
        copy(Tags.Blocks.STORAGE_BLOCKS_NETHERITE, Tags.Items.STORAGE_BLOCKS_NETHERITE);
        copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        copy(Tags.Blocks.CHESTS_ENDER, Tags.Items.CHESTS_ENDER);
        copy(Tags.Blocks.CHESTS_TRAPPED, Tags.Items.CHESTS_TRAPPED);
        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);

        tag(Tags.Items.RODS).addTag(Tags.Items.RODS_BLAZE).addTag(Tags.Items.RODS_WOODEN);
        tag(Tags.Items.RODS_BLAZE).add(Items.BLAZE_ROD);
        tag(Tags.Items.RODS_WOODEN).add(Items.STICK);

        tag(Tags.Items.STRING).add(Items.STRING);
        tag(Tags.Items.INGOTS_IRON).add(Items.IRON_INGOT);
        tag(Tags.Items.NUGGETS_IRON).add(Items.IRON_INGOT);
        tag(Tags.Items.NUGGETS).addTag(Tags.Items.NUGGETS_IRON);
        tag(Tags.Items.DUSTS_REDSTONE).add(Items.REDSTONE);
        tag(Tags.Items.SLIMEBALLS).add(Items.SLIME_BALL);
        tag(Tags.Items.DUSTS_GLOWSTONE).add(Items.GLOWSTONE_DUST);
        tag(Tags.Items.ENDER_PEARLS).add(Items.ENDER_PEARL);
        tag(Tags.Items.LEATHER).add(Items.LEATHER);
    }

    @SuppressWarnings("unchecked")
    private Tag.Identified<Block> getForgeBlockTag(String name)
    {
        try
        {
            name = name.toUpperCase(Locale.ENGLISH);
            return (Tag.Identified<Block>)Tags.Blocks.class.getDeclaredField(name).get(null);
        }
        catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e)
        {
            throw new IllegalStateException(Tags.Blocks.class.getName() + " is missing tag name: " + name);
        }
    }

    @SuppressWarnings("unchecked")
    private Tag.Identified<Item> getForgeItemTag(String name)
    {
        try
        {
            name = name.toUpperCase(Locale.ENGLISH);
            return (Tag.Identified<Item>)Tags.Items.class.getDeclaredField(name).get(null);
        }
        catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e)
        {
            throw new IllegalStateException(Tags.Items.class.getName() + " is missing tag name: " + name);
        }
    }

    private void func_240521_a_Colored(Tag.Identified<Block> blockGroup, Tag.Identified<Item> itemGroup)
    {
        String blockPre = blockGroup.getId().getPath().toUpperCase(Locale.ENGLISH) + '_';
        String itemPre = itemGroup.getId().getPath().toUpperCase(Locale.ENGLISH) + '_';
        for (DyeColor color  : DyeColor.values())
        {
            Tag.Identified<Block> from = getForgeBlockTag(blockPre + color.getName());
            Tag.Identified<Item> to = getForgeItemTag(itemPre + color.getName());
            copy(from, to);
        }
        copy(getForgeBlockTag(blockPre + "colorless"), getForgeItemTag(itemPre + "colorless"));
    }

    public FabricTagBuilder<Item> tag(Tag.Identified<Item> tag) {
        return getOrCreateTagBuilder(tag);
    }
}