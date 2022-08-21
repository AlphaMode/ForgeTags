package me.alphamode.forgetags.data;

import me.alphamode.forgetags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tag.BiomeTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public final class BiomeTagsProvider extends FabricTagProvider.DynamicRegistryTagProvider<Biome> {

    public BiomeTagsProvider(FabricDataGenerator arg) {
        super(arg, Registry.BIOME_KEY);
    }

    @Override
    protected void generateTags() {
        tag(BiomeKeys.PLAINS, Tags.Biomes.IS_PLAINS);
        tag(BiomeKeys.DESERT, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_DRY_OVERWORLD, Tags.Biomes.IS_SANDY);
        tag(BiomeKeys.TAIGA, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_CONIFEROUS);
        tag(BiomeKeys.SWAMP, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_SWAMP);
        tag(BiomeKeys.NETHER_WASTES, Tags.Biomes.IS_HOT_NETHER, Tags.Biomes.IS_DRY_NETHER);
        tag(BiomeKeys.THE_END, Tags.Biomes.IS_COLD_END, Tags.Biomes.IS_DRY_END);
        tag(BiomeKeys.FROZEN_OCEAN, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SNOWY);
        tag(BiomeKeys.FROZEN_RIVER, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SNOWY);
        tag(BiomeKeys.SNOWY_PLAINS, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_WASTELAND, Tags.Biomes.IS_PLAINS);
        tag(BiomeKeys.MUSHROOM_FIELDS, Tags.Biomes.IS_MUSHROOM, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.JUNGLE, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_DENSE_OVERWORLD);
        tag(BiomeKeys.SPARSE_JUNGLE, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.BEACH, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_SANDY);
        tag(BiomeKeys.SNOWY_BEACH, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SNOWY);
        tag(BiomeKeys.DARK_FOREST, Tags.Biomes.IS_SPOOKY, Tags.Biomes.IS_DENSE_OVERWORLD);
        tag(BiomeKeys.SNOWY_TAIGA, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_CONIFEROUS, Tags.Biomes.IS_SNOWY);
        tag(BiomeKeys.OLD_GROWTH_PINE_TAIGA, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_CONIFEROUS);
        tag(BiomeKeys.WINDSWEPT_FOREST, Tags.Biomes.IS_SPARSE_OVERWORLD);
        tag(BiomeKeys.SAVANNA, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD);
        tag(BiomeKeys.SAVANNA_PLATEAU, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_RARE, Tags.Biomes.IS_SLOPE, Tags.Biomes.IS_PLATEAU);
        tag(BiomeKeys.BADLANDS, Tags.Biomes.IS_SANDY, Tags.Biomes.IS_DRY_OVERWORLD);
        tag(BiomeKeys.WOODED_BADLANDS, Tags.Biomes.IS_SANDY, Tags.Biomes.IS_DRY_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_SLOPE, Tags.Biomes.IS_PLATEAU);
        tag(BiomeKeys.MEADOW, Tags.Biomes.IS_PLAINS, Tags.Biomes.IS_PLATEAU, Tags.Biomes.IS_SLOPE);
        tag(BiomeKeys.GROVE, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_CONIFEROUS, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_SLOPE);
        tag(BiomeKeys.SNOWY_SLOPES, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_SLOPE);
        tag(BiomeKeys.JAGGED_PEAKS, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_PEAK);
        tag(BiomeKeys.FROZEN_PEAKS, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_PEAK);
        tag(BiomeKeys.STONY_PEAKS, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_PEAK);
        tag(BiomeKeys.SMALL_END_ISLANDS, Tags.Biomes.IS_COLD_END, Tags.Biomes.IS_DRY_END);
        tag(BiomeKeys.END_MIDLANDS, Tags.Biomes.IS_COLD_END, Tags.Biomes.IS_DRY_END);
        tag(BiomeKeys.END_HIGHLANDS, Tags.Biomes.IS_COLD_END, Tags.Biomes.IS_DRY_END);
        tag(BiomeKeys.END_BARRENS, Tags.Biomes.IS_COLD_END, Tags.Biomes.IS_DRY_END);
        tag(BiomeKeys.WARM_OCEAN, Tags.Biomes.IS_HOT_OVERWORLD);
        tag(BiomeKeys.COLD_OCEAN, Tags.Biomes.IS_COLD_OVERWORLD);
        tag(BiomeKeys.DEEP_COLD_OCEAN, Tags.Biomes.IS_COLD_OVERWORLD);
        tag(BiomeKeys.DEEP_FROZEN_OCEAN, Tags.Biomes.IS_COLD_OVERWORLD);
        tag(BiomeKeys.THE_VOID, Tags.Biomes.IS_VOID);
        tag(BiomeKeys.SUNFLOWER_PLAINS, Tags.Biomes.IS_PLAINS, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.WINDSWEPT_GRAVELLY_HILLS, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.FLOWER_FOREST, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.ICE_SPIKES, Tags.Biomes.IS_COLD_OVERWORLD, Tags.Biomes.IS_SNOWY, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.OLD_GROWTH_BIRCH_FOREST, Tags.Biomes.IS_DENSE_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, Tags.Biomes.IS_DENSE_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.WINDSWEPT_SAVANNA, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_DRY_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.ERODED_BADLANDS, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_DRY_OVERWORLD, Tags.Biomes.IS_SPARSE_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.BAMBOO_JUNGLE, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_RARE);
        tag(BiomeKeys.LUSH_CAVES, Tags.Biomes.IS_UNDERGROUND, Tags.Biomes.IS_LUSH, Tags.Biomes.IS_WET_OVERWORLD);
        tag(BiomeKeys.DRIPSTONE_CAVES, Tags.Biomes.IS_UNDERGROUND, Tags.Biomes.IS_SPARSE_OVERWORLD);
        tag(BiomeKeys.SOUL_SAND_VALLEY, Tags.Biomes.IS_HOT_NETHER, Tags.Biomes.IS_DRY_NETHER);
        tag(BiomeKeys.CRIMSON_FOREST, Tags.Biomes.IS_HOT_NETHER, Tags.Biomes.IS_DRY_NETHER);
        tag(BiomeKeys.WARPED_FOREST, Tags.Biomes.IS_HOT_NETHER, Tags.Biomes.IS_DRY_NETHER);
        tag(BiomeKeys.BASALT_DELTAS, Tags.Biomes.IS_HOT_NETHER, Tags.Biomes.IS_DRY_NETHER);
        tag(BiomeKeys.MANGROVE_SWAMP, Tags.Biomes.IS_WET, Tags.Biomes.IS_WET_OVERWORLD, Tags.Biomes.IS_HOT, Tags.Biomes.IS_HOT_OVERWORLD, Tags.Biomes.IS_SWAMP);
        tag(BiomeKeys.DEEP_DARK, Tags.Biomes.IS_UNDERGROUND, Tags.Biomes.IS_RARE, Tags.Biomes.IS_SPOOKY);

        tag(Tags.Biomes.IS_HOT).addTag(Tags.Biomes.IS_HOT_OVERWORLD).addTag(Tags.Biomes.IS_HOT_NETHER).addOptionalTag(Tags.Biomes.IS_HOT_END.id());
        tag(Tags.Biomes.IS_COLD).addTag(Tags.Biomes.IS_COLD_OVERWORLD).addOptionalTag(Tags.Biomes.IS_COLD_NETHER.id()).addTag(Tags.Biomes.IS_COLD_END);
        tag(Tags.Biomes.IS_SPARSE).addTag(Tags.Biomes.IS_SPARSE_OVERWORLD).addOptionalTag(Tags.Biomes.IS_SPARSE_NETHER.id()).addOptionalTag(Tags.Biomes.IS_SPARSE_END.id());
        tag(Tags.Biomes.IS_DENSE).addTag(Tags.Biomes.IS_DENSE_OVERWORLD).addOptionalTag(Tags.Biomes.IS_DENSE_NETHER.id()).addOptionalTag(Tags.Biomes.IS_DENSE_END.id());
        tag(Tags.Biomes.IS_WET).addTag(Tags.Biomes.IS_WET_OVERWORLD).addOptionalTag(Tags.Biomes.IS_WET_NETHER.id()).addOptionalTag(Tags.Biomes.IS_WET_END.id());
        tag(Tags.Biomes.IS_DRY).addTag(Tags.Biomes.IS_DRY_OVERWORLD).addTag(Tags.Biomes.IS_DRY_NETHER).addTag(Tags.Biomes.IS_DRY_END);

        tag(Tags.Biomes.IS_WATER).forceAddTag(BiomeTags.IS_OCEAN).forceAddTag(BiomeTags.IS_RIVER);
        tag(Tags.Biomes.IS_MOUNTAIN).addTag(Tags.Biomes.IS_PEAK).addTag(Tags.Biomes.IS_SLOPE);
    }

    @SafeVarargs
    private void tag(RegistryKey<Biome> biome, TagKey<Biome>... tags) {
        for(TagKey<Biome> key : tags) {
            tag(key).add(biome);
        }
    }

    public FabricTagBuilder<Biome> tag(TagKey<Biome> tag) {
        return getOrCreateTagBuilder(tag);
    }
}