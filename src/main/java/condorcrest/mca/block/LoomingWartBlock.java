package condorcrest.mca.block;

import condorcrest.mca.registry.ModBlocks;
import condorcrest.mca.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class LoomingWartBlock extends NetherWartBlock {
    public LoomingWartBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.NETHER_WART));
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(ModBlocks.LOOMING_NYLIUM.get());
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter p_54973_, BlockPos p_54974_, BlockState p_54975_) {
        return new ItemStack(ModItems.LOOMING_WART.get());
    }
}
