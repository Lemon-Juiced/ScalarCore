package dev.lemonjuice.scalar_core.category;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.camel.CamelHusk;
import net.minecraft.world.entity.animal.equine.SkeletonHorse;
import net.minecraft.world.entity.animal.equine.ZombieHorse;
import net.minecraft.world.entity.animal.nautilus.ZombieNautilus;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.skeleton.*;
import net.minecraft.world.entity.monster.spider.CaveSpider;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.zombie.*;

public class Category {

    /**
     * Checks if the entity is an undead entity.
     *
     * @param entity the entity to check
     * @return true if the entity is undead, false otherwise
     */
    public static boolean isUndeadEntity(LivingEntity entity) {
        return (entity instanceof Phantom || isZombieEntity(entity) || isSkeletonEntity(entity));
    }

    /**
     * Checks if the entity is a zombie entity
     *
     * @param entity the entity to check
     * @return true if the entity is a zombie, false otherwise
     */
    public static boolean isZombieEntity(LivingEntity entity){
        return (entity instanceof CamelHusk ||
                entity instanceof Zoglin ||
                entity instanceof ZombieHorse ||
                entity instanceof ZombieNautilus ||
                entity instanceof Zombie);  // (Drowned, Husk, Zombie, Zombie Villager, Zombified Piglin)
    }

    /**
     * Checks if the entity is a skeleton entity
     *
     * @param entity the entity to check
     * @return true if the entity is a skeleton, false otherwise
     */
    public static boolean isSkeletonEntity(LivingEntity entity){
        return (entity instanceof Bogged ||
                entity instanceof Parched ||
                entity instanceof SkeletonHorse ||
                entity instanceof Stray ||
                entity instanceof WitherBoss ||
                entity instanceof WitherSkeleton ||
                entity instanceof Skeleton);
    }

    /**
     * Checks if the entity is an arthropod entity.
     *
     * @param entity the entity to check
     * @return true if the entity is an arthropod, false otherwise
     */
    public static boolean isArthropodEntity(LivingEntity entity) {
        return (entity instanceof Spider ||
                entity instanceof CaveSpider ||
                entity instanceof Silverfish ||
                entity instanceof Endermite);
    }

    /**
     * Checks if the entity is a dragon entity.
     * (Holding out hope for the Red Dragon in the future... even though it's been a decade.)
     *
     * @param entity the entity to check
     * @return true if the entity is a dragon, false otherwise
     */
    public static boolean isDragonEntity(LivingEntity entity) {
        return (entity instanceof EnderDragon);
    }

    /**
     * Checks if the entity is an ender entity.
     * This includes Endermen, Endermites, Shulkers, and the Ender Dragon.
     *
     * @param entity the entity to check
     * @return true if the entity is an ender entity, false otherwise
     */
    public static boolean isEnderEntity(LivingEntity entity) {
        return (entity instanceof EnderMan ||
                entity instanceof Endermite ||
                entity instanceof Shulker ||
                entity instanceof EnderDragon);
    }

    /**
     * Checks if the entity is a passive entity.
     * This includes animals and villagers, excluding neutral entities like wolves and iron golems.
     *
     * @param entity the entity to check
     * @return true if the entity is passive, false otherwise
     */
    public static boolean isPassiveEntity(LivingEntity entity) {
        return (entity instanceof net.minecraft.world.entity.animal.Animal ||
                entity instanceof net.minecraft.world.entity.npc.villager.AbstractVillager);
    }

    /**
     * Checks if the entity is a boss entity.
     *
     * @param entity the entity to check
     * @return true if the entity is a boss, false otherwise
     */
    public static boolean isBossEntity(LivingEntity entity) {
        return (entity instanceof WitherBoss ||
                entity instanceof EnderDragon ||
                entity instanceof ElderGuardian);
    }

    /**
     * Checks if the entity is a boss-like entity.
     * This includes all boss entities and the Warden.
     * Anything in the health range of a boss entity is considered boss-like.
     *
     * @param entity the entity to check
     * @return true if the entity is a boss-like entity, false otherwise
     */
    public static boolean isBossLikeEntity(LivingEntity entity) {
        return (isBossEntity(entity) || entity instanceof Warden);
    }
}
