package dev.lemonjuice.scalar_core.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.FuelValues;
import org.jetbrains.annotations.Nullable;

public class FuelBlockItem extends BlockItem {
    private final int items;

    public FuelBlockItem(Block block, Properties properties, int items) {
        super(block, properties);
        this.items = items;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @org.jspecify.annotations.Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
        return items * 200;
    }
}
