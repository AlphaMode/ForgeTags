package me.alphamode.forgetags.data;

import me.alphamode.forgetags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import org.jetbrains.annotations.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;

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

        tag(Tags.Items.RODS).addTag(Tags.Items.RODS_BLAZE).addTag(Tags.Items.RODS_WOODEN);
        tag(Tags.Items.RODS_BLAZE).add(Items.BLAZE_ROD);
        tag(Tags.Items.RODS_WOODEN).add(Items.STICK);
    }

    public FabricTagBuilder<Item> tag(Tag.Identified<Item> tag) {
        return getOrCreateTagBuilder(tag);
    }
}
