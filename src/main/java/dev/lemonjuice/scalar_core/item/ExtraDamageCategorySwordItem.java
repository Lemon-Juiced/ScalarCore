package dev.lemonjuice.scalar_core.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.lemonjuice.scalar_core.category.Category.isUndeadEntity;

public class ExtraDamageCategorySwordItem extends SwordItem {
    private final String category;
    private final float extraDamage;

    /**
     * Creates a sword item with extra damage against a specific category of entities.
     *
     * @param tier the tier of the sword
     * @param properties the properties of the sword
     * @param category the category of entities to deal extra damage to
     * @param extraDamage the extra damage to deal to the category
     */
    public ExtraDamageCategorySwordItem(Tier tier, Properties properties, String category, float extraDamage) {
        super(tier, properties);
        this.category = category;
        this.extraDamage = extraDamage;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(category.equals("undead")){
            if (isUndeadEntity(target)) target.setHealth(target.getHealth() - extraDamage);
            // Add more categories here if needed
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
