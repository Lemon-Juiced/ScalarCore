# Scalar Core

Scalar Core is a library mod for Minecraft that provides a variety of utilities and tools for modders.  
It is primarily designed to make modding some common features a little easier and more efficient.  

# 1.21.11 Features
This is currently in the process of porting to 1.21.11 which has a lot of changes, so complete feature parity may not be possible (at least not line-for-line).  
- Category Package
  - Category: Hold categories of mobs when checking against a mob type, currently holds:
    - Arthropod
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
- Tier Package
  - How Tiers and Tools in general work were completely overhauled, so this package will be iterated upon.

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