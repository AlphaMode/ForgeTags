package me.alphamode.forgetags.bixin;

import me.alphamode.forgetags.extensions.DyeExtension;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

@Mixin(DyeColor.class)
public class DyeColorBixin implements DyeExtension {
    @Shadow @Final private String name;
    @Unique
    private TagKey<Item> tag;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void addTag(String woolId, int id, int color, String mapColor, int fireworkColor, MapColor signColor, int j, int k, CallbackInfo ci) {
        tag = TagKey.of(Registry.ITEM_KEY, new Identifier("c", name+"_dyes"));
    }

    @Override
    public TagKey<Item> getTag() {
        return tag;
    }
}
