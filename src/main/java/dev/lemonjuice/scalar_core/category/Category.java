package dev.lemonjuice.scalar_core.category;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Zombie;

public class Category {

    /**
     * Checks if the entity is an undead entity.
     *
     * @param entity the entity to check
     * @return true if the entity is undead, false otherwise
     */
    public static boolean isUndeadEntity(LivingEntity entity) {
        return (entity instanceof Phantom
                || entity instanceof AbstractSkeleton // Bogged, Stray, Wither Skeleton
                || entity instanceof SkeletonHorse
                || entity instanceof WitherBoss
                || entity instanceof Zoglin
                || entity instanceof Zombie // Drowned, Husk, Zombie Villager, Zombified Piglin
                || entity instanceof ZombieHorse);
    }
}
