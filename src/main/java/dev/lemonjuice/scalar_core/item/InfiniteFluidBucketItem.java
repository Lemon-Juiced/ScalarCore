package dev.lemonjuice.scalar_core.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class InfiniteFluidBucketItem extends BucketItem {

    public InfiniteFluidBucketItem(Fluid content, Properties properties) {
        super(content, properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        InteractionResult result = super.use(level, player, hand);

        // Keep infinite buckets from transforming into an empty bucket after placement.
        if (result instanceof InteractionResult.Success success && this.getContent() != Fluids.EMPTY) {
            ItemStack heldStack = player.getItemInHand(hand);
            return success.heldItemTransformedTo(heldStack);
        }

        return result;
    }

}
