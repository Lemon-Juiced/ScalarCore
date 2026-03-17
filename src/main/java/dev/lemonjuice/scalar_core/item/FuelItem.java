package dev.lemonjuice.scalar_core.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;

public class FuelItem extends Item{
    private final int items;

    public FuelItem(Item.Properties properties, int items) {
        super(properties);
        this.items = items;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @org.jspecify.annotations.Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
        return items * 200;
    }

}
