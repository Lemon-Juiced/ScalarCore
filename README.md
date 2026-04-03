# Scalar Core
Scalar Core is a library mod for Minecraft that provides a variety of utilities and tools for modders.  
It is primarily designed to make modding some common features a little easier and more efficient.  

# 26.1.1 Features
Active development is on 26.1.1, which has some fundamental changes compared to 1.21.1, as such this library has somewhat pivoted.
- Category Package
  - Category: Hold categories of mobs when checking against a mob type, currently holds:
    - Arthropod
    - Boss (Elder Guardians, Withers, and Ender Dragons)
    - BossLike (Bosses and other mobs that are similar to bosses, such as the Warden)
    - Dragon
    - Ender
    - Passive
    - Skeleton
    - Undead
    - Zombie
- Item Package
    - FuelBlockItem: A block that can be used as a fuel source in furnaces.
    - FuelItem: An item that can be used as a fuel source in furnaces.
    - InfiniteFluidBucketItem: An infinite "bucket" of a specific fluid.

# 1.21.1 Features
- Category Package
  - Category: Hold categories of mobs when checking against a mob type, currently holds:
    - Arthropod
    - Dragon
    - Ender
    - Passive
    - Undead 
- Item Package
  - ExtraDamageCategorySwordItem: A sword that deals extra damage to specific categories of mobs.
  - FuelBlockItem: A block that can be used as a fuel source in furnaces.
  - FuelItem: An item that can be used as a fuel source in furnaces.
  - ToolItemPropFactory: An easier and more efficient way to make typical vanilla-styled tools.
- Tier Package
  - MidTierFactory: A factory for creating tiers between two pre-existing tiers.
  - TierConverter: A converter between SimpleTier and Tier.