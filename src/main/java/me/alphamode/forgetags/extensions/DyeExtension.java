package me.alphamode.forgetags.extensions;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;

public interface DyeExtension {
    default TagKey<Item> getTag() {
        return null;
    }
}
