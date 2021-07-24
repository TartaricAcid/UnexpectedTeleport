package com.github.tartaricacid.unexpectedteleport.util;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.LongNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.util.Constants;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class TeleportData {
    public static final Map<String, Item> TYPES = Maps.newHashMap();
    private static final String DIM_TAG_NAME = "DimTag";
    private static final String POS_TAG_NAME = "PosTag";
    private static final String FEATURE_TAG_NAME = "FeatureTag";
    private static final String OVER_WORLD = "minecraft:overworld";

    public static ItemStack setDim(String dimName, ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag == null) {
            tag = new CompoundNBT();
        }
        tag.put(DIM_TAG_NAME, StringNBT.valueOf(dimName));
        stack.setTag(tag);
        return stack;
    }

    public static String getDimName(ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag != null) {
            return tag.getString(DIM_TAG_NAME);
        }
        return "";
    }

    public static ItemStack setFeature(String featureName, ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag == null) {
            tag = new CompoundNBT();
        }
        tag.put(FEATURE_TAG_NAME, StringNBT.valueOf(featureName));
        stack.setTag(tag);
        return stack;
    }

    public static String getFeatureName(ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag != null) {
            return tag.getString(FEATURE_TAG_NAME);
        }
        return "";
    }

    public static ItemStack setPos(BlockPos pos, ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag == null) {
            tag = new CompoundNBT();
        }
        tag.put(POS_TAG_NAME, LongNBT.valueOf(pos.asLong()));
        stack.setTag(tag);
        return stack;
    }

    @Nullable
    public static BlockPos getPos(ItemStack stack) {
        CompoundNBT tag = stack.getTag();
        if (tag != null && tag.contains(POS_TAG_NAME, Constants.NBT.TAG_LONG)) {
            return BlockPos.of(tag.getLong(POS_TAG_NAME));
        }
        return null;
    }

    public static void addType(String typeName, Item item) {
        TYPES.put(typeName, item);
    }

    public static void addItemCategory(NonNullList<ItemStack> stacks, Item item) {
        stacks.add(setDim(OVER_WORLD, setFeature("Desert_Pyramid", item.getDefaultInstance())));
        stacks.add(setDim(OVER_WORLD, setFeature("Swamp_Hut", item.getDefaultInstance())));
        stacks.add(setDim(OVER_WORLD, setFeature("Ocean_Ruin", item.getDefaultInstance())));
        stacks.add(setDim(OVER_WORLD, setFeature("Village", item.getDefaultInstance())));
        stacks.add(setDim(OVER_WORLD, setFeature("Igloo", item.getDefaultInstance())));
        stacks.add(setDim(OVER_WORLD, setFeature("Jungle_Pyramid", item.getDefaultInstance())));
    }

    public static void addHoverText(ItemStack stack, List<ITextComponent> components) {
        components.add(new TranslationTextComponent("tooltips.unexpectedteleport.teleport.dim", getDimName(stack)));

        BlockPos pos = getPos(stack);
        if (pos != null) {
            components.add(new TranslationTextComponent("tooltips.unexpectedteleport.teleport.pos", pos.getX(), pos.getY(), pos.getZ()));
        }

        String feature = getFeatureName(stack);
        if (StringUtils.isNotBlank(feature)) {
            components.add(new TranslationTextComponent("tooltips.unexpectedteleport.teleport.feature", getFeatureName(stack)));
        }
    }
}
