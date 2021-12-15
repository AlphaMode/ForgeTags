package me.alphamode.forgetags.bixin;

import me.alphamode.forgetags.DyeUtil;
import net.fabricmc.fabric.api.tag.TagFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

@Mixin(DyeColor.class)
public class DyeColorBixin implements DyeUtil.DyeAccessor {
    @Shadow @Final private String name;
    @Unique
    private Tag.Identified<Item> tag;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void addTag(String woolId, int id, int color, String mapColor, int fireworkColor, MapColor signColor, int j, int k, CallbackInfo ci) {
        tag = TagFactory.ITEM.create(new Identifier("c", name+"_dyes"));
    }

    @Override
    public Tag.Identified<Item> getTag() {
        return tag;
    }
}
