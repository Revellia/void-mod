package com.revellia.voidmod;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class VoidToolMaterial implements Tier {

    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public VoidToolMaterial(float attackDamageBonus, int enchantability, int harvestLevel, float speed, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.speed = speed;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
