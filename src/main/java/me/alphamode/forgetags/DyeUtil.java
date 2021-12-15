package me.alphamode.forgetags;

import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;

public class DyeUtil {
    public static Tag.Identified<Item> getDyeTag(DyeColor color) {
        return ((DyeAccessor) (Object)color).getTag();
    }

    public interface DyeAccessor {
        Tag.Identified<Item> getTag();
    }
}
