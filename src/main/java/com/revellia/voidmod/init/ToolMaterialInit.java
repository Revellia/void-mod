package com.revellia.voidmod.init;

import com.revellia.voidmod.VoidToolMaterial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.TierSortingRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class ToolMaterialInit {

    private ToolMaterialInit() {

    }

    public static final Tier VOID = new VoidToolMaterial(7f, 300, 10,10f,2000,
            () -> Ingredient.of(ItemInit.VOID_SHARD.get()));

}
