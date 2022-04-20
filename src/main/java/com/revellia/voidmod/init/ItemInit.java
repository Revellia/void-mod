package com.revellia.voidmod.init;

import com.revellia.voidmod.VoidMod;
import com.revellia.voidmod.VoidToolMaterial;
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

    //Tools
    public static final RegistryObject<PickaxeItem> VOID_PICKAXE = register("void_pickaxe", () -> new PickaxeItem(ToolMaterialInit.VOID, 1, 5f, new Item.Properties().tab(VoidMod.VOID_TAB)));

    //Init Item
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
