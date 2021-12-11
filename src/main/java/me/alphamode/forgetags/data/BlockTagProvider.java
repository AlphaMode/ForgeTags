package me.alphamode.forgetags.data;

import static me.alphamode.forgetags.Tags.Blocks.*;
import me.alphamode.forgetags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import java.util.Locale;
import java.util.function.Consumer;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        tag(STONE).add(Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE, Blocks.INFESTED_STONE, Blocks.STONE, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_DIORITE, Blocks.POLISHED_GRANITE);
        tag(COBBLESTONE).add(Blocks.COBBLESTONE);
        tag(ORES_COAL).add(Blocks.COAL_ORE);
        tag(ORES_DIAMOND).add(Blocks.DIAMOND_ORE);
        tag(ORES_EMERALD).add(Blocks.EMERALD_ORE);
        tag(ORES_GOLD).add(Blocks.GOLD_ORE, Blocks.NETHER_GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE);
        tag(ORES_IRON).add(Blocks.IRON_ORE);
        tag(ORES_LAPIS).add(Blocks.LAPIS_ORE);
        tag(ORES_QUARTZ).add(Blocks.NETHER_QUARTZ_ORE);
        tag(ORES_REDSTONE).add(Blocks.REDSTONE_ORE);
        tag(ORES_NETHERITE_SCRAP).add(Blocks.ANCIENT_DEBRIS);
        tag(ORES).addTag(ORES_COAL).addTag(ORES_DIAMOND).addTag(ORES_EMERALD).addTag(ORES_GOLD).addTag(ORES_IRON).addTag(ORES_LAPIS).addTag(ORES_REDSTONE).addTag(ORES_QUARTZ).addTag(ORES_NETHERITE_SCRAP);
        tag(GLASS).addTag(GLASS_COLORLESS).addTag(STAINED_GLASS);
        addColored(tag(STAINED_GLASS)::add, GLASS, "{color}_stained_glass");
        tag(GLASS_COLORLESS).add(Blocks.GLASS);
        tag(GLASS_PANES_COLORLESS).add(Blocks.GLASS_PANE);
        addColored(tag(STAINED_GLASS_PANES)::add, GLASS_PANES, "{color}_stained_glass_pane");
    }

    private void addColored(Consumer<Block> consumer, Tag.Identified<Block> group, String pattern)
    {
        String prefix = group.getId().getPath().toUpperCase(Locale.ENGLISH) + '_';
        for (DyeColor color  : DyeColor.values())
        {
            Identifier key = new Identifier("minecraft", pattern.replace("{color}",  color.getName()));
            Tag.Identified<Block> tag = getForgeTag(prefix + color.getName());
            Block block = Registry.BLOCK.get(key);
            if (block == null || block  == Blocks.AIR)
                throw new IllegalStateException("Unknown vanilla block: " + key.toString());
            tag(tag).add(block);
            consumer.accept(block);
        }
    }

    @SuppressWarnings("unchecked")
    private Tag.Identified<Block> getForgeTag(String name)
    {
        try
        {
            name = name.toUpperCase(Locale.ENGLISH);
            return (Tag.Identified<Block>) Tags.Blocks.class.getDeclaredField(name).get(null);
        }
        catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e)
        {
            throw new IllegalStateException(Tags.Blocks.class.getName() + " is missing tag name: " + name);
        }
    }

    public FabricTagBuilder<Block> tag(Tag.Identified<Block> tag) {
        return getOrCreateTagBuilder(tag);
    }
}
