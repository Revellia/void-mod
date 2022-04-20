package com.revellia.voidmod.init;

import com.revellia.voidmod.VoidMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    //Register Init
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            VoidMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    //Create blocks here
    public static final RegistryObject<Block> VOID_ORE = register("void_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK).strength(5.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new BlockItem.Properties().tab(VoidMod.VOID_TAB)));

    //Init Block item part of block
    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }
    //Makes Item item equal to Block item
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
