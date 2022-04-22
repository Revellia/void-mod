package com.revellia.voidmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.*;

public final class ToolMaterialInit {

    private ToolMaterialInit() {

    }

    public static final TagKey<Block> VOID_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_void_tool"));

    public static final Tier VOID = TierSortingRegistry.registerTier(new ForgeTier(10, 2000, 6f, 5f, 300, VOID_TIER,
            () -> Ingredient.of(ItemInit.VOID_SHARD.get())), new ResourceLocation("voidmod:void_tier"), List.of(Tiers.NETHERITE), List.of());

    public static final TagKey<Block> ENOKI_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_enoki_tool"));

    public static final Tier ENOKI = TierSortingRegistry.registerTier(new ForgeTier(15, 2500, 7f, 6f, 500, ENOKI_TIER,
            () -> Ingredient.of(ItemInit.ENOKI_PIECE.get())), new ResourceLocation("voidmod:enoki_tier"), List.of(VOID), List.of());

    public static final TagKey<Block> SOUL_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_soul_tool"));

    public static final Tier SOUL = TierSortingRegistry.registerTier(new ForgeTier(20, 3200, 8f, 8f, 650, SOUL_TIER,
            () -> Ingredient.of(ItemInit.PHANTOM_SOUL.get())), new ResourceLocation("voidmod:soul_tier"), List.of(ENOKI), List.of());

    public static final TagKey<Block> SHARD_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_shard_tool"));

    public static final Tier SHARD = TierSortingRegistry.registerTier(new ForgeTier(25, 3800, 9f, 10f, 800, SHARD_TIER,
            () -> Ingredient.of(ItemInit.DIMENSION_SHARD.get())), new ResourceLocation("voidmod:shard_tier"), List.of(SOUL), List.of());

    public static final TagKey<Block> NULL_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_null_tool"));

    public static final Tier NULL = TierSortingRegistry.registerTier(new ForgeTier(30, 4000, 10f, 12f, 1000, NULL_TIER,
            () -> Ingredient.of(ItemInit.NULL_PARTICLE.get())), new ResourceLocation("voidmod:null_tier"), List.of(SHARD), List.of());

    public static final TagKey<Block> RADIANT_TIER = BlockTags.create(new ResourceLocation("voidmod:needs_radiant_tool"));

    public static final Tier RADIANT = TierSortingRegistry.registerTier(new ForgeTier(45, 7000, 15f, 20f, 2000, RADIANT_TIER,
            () -> Ingredient.of(ItemInit.RADIANT_SINGULARIY.get())), new ResourceLocation("voidmod:radiant_tier"), List.of(NULL), List.of());


}
