package com.revellia.voidmod.init;

import com.revellia.voidmod.VoidMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    //Register Init
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VoidMod.MOD_ID);

    //Add items here
    public static final RegistryObject<Item> VOID_SHARD = register("void_shard", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> VOID_DIAMOND = register("void_diamond", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> ENOKI_PIECE = register("enoki_piece", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> PHANTOM_SOUL = register("phantom_soul", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> DIMENSION_SHARD = register("dimension_shard", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> NULL_PARTICLE = register("null_particle", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> RADIANT_SINGULARIY = register("radiant_singularity", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<Item> VOID_STAR = register("void_star", () -> new Item(new Item.Properties().tab(VoidMod.VOID_TAB)));

    //Tools
    public static final RegistryObject<PickaxeItem> VOID_PICKAXE = register("void_pickaxe", () -> new PickaxeItem(ToolMaterialInit.VOID, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<PickaxeItem> ENOKI_PICKAXE = register("enoki_pickaxe", () -> new PickaxeItem(ToolMaterialInit.ENOKI, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<PickaxeItem> SOUL_PICKAXE = register("soul_pickaxe", () -> new PickaxeItem(ToolMaterialInit.SOUL, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<PickaxeItem> SHARD_PICKAXE = register("shard_pickaxe", () -> new PickaxeItem(ToolMaterialInit.SHARD, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<PickaxeItem> NULL_PICKAXE = register("null_pickaxe", () -> new PickaxeItem(ToolMaterialInit.NULL, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));
    public static final RegistryObject<PickaxeItem> RADIANT_PICKAXE = register("radiant_pickaxe", () -> new PickaxeItem(ToolMaterialInit.RADIANT, -2, -3f, new Item.Properties().tab(VoidMod.VOID_TAB)));

    //Init Item
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
