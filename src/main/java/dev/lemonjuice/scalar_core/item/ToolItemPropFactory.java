package dev.lemonjuice.scalar_core.item;

import net.minecraft.world.item.*;

/**
 * Factory class for creating Item.Properties for tool items.
 *
 * @author Lemon_Juice
 */
public class ToolItemPropFactory {

    /**
     * Creates Item.Properties for a sword item.
     *
     * @param tier the tier of the sword
     * @return the Item.Properties for the sword
     */
    public static Item.Properties getSwordItemProperties(Tier tier){
        return new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4F));
    }

    /**
     * Creates Item.Properties for a pickaxe item.
     *
     * @param tier the tier of the pickaxe
     * @return the Item.Properties for the pickaxe
     */
    public static Item.Properties getPickaxeItemProperties(Tier tier){
        return new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1.0F, -2.8F));
    }

    /**
     * Creates Item.Properties for an axe item.
     *
     * @param tier the tier of the axe
     * @return the Item.Properties for the axe
     */
    public static Item.Properties getAxeItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 6.0F, -3.2F));
    }

    /**
     * Creates Item.Properties for a shovel item.
     *
     * @param tier the tier of the shovel
     * @return the Item.Properties for the shovel
     */
    public static Item.Properties getShovelItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 1.5F, -3.0F));
    }

    /**
     * Creates Item.Properties for a hoe item.
     *
     * @param tier the tier of the hoe
     * @return the Item.Properties for the hoe
     */
    public static Item.Properties getHoeItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 0.0F, -3.0F));
    }
}
