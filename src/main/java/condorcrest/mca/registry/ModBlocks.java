package condorcrest.mca.registry;

import condorcrest.mca.MCAdvancement;
import condorcrest.mca.block.LoomberryBushBlock;
import condorcrest.mca.block.LoomingWartBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.SpruceTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCAdvancement.MOD_ID);

    // MANGROVE FAMILY
    public static final RegistryObject<Block> MANGROVE_SAPLING = registerBlock("mangrove_sapling", () -> new SaplingBlock(new SpruceTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)));
    public static final RegistryObject<Block> MANGROVE_LEAVES = registerBlock("mangrove_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)));
    public static final RegistryObject<Block> MANGROVE_LOG = registerBlock("mangrove_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)));
    public static final RegistryObject<Block> MANGROVE_WOOD = registerBlock("mangrove_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG = registerBlock("stripped_mangrove_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD = registerBlock("stripped_mangrove_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> MANGROVE_PLANKS = registerBlock("mangrove_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_STAIRS = registerBlock("mangrove_stairs", () -> new StairBlock(Blocks.SPRUCE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> MANGROVE_SLAB = registerBlock("mangrove_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> MANGROVE_FENCE = registerBlock("mangrove_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> MANGROVE_FENCE_GATE = registerBlock("mangrove_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE)));
    public static final RegistryObject<Block> MANGROVE_DOOR = registerBlock("mangrove_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> MANGROVE_TRAPDOOR = registerBlock("mangrove_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR)));
    public static final RegistryObject<Block> MANGROVE_PRESSURE_PLATE = registerBlock("mangrove_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE)));
    public static final RegistryObject<Block> MANGROVE_BUTTON = registerBlock("mangrove_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON)));

    // LOOMING FAMILY
    public static final RegistryObject<Block> LOOMBERRY_BUSH = BLOCKS.register("loomberry_bush", LoomberryBushBlock::new);
    public static final RegistryObject<Block> LOOMING_NYLIUM = registerBlock("looming_nylium", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> LOOMSTONE = registerBlock("loomstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GLOWING_LOOMSTONE = registerBlock("glowing_loomstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel((light) -> {return 10;})));
    public static final RegistryObject<Block> LOOMING_WART = BLOCKS.register("looming_wart", LoomingWartBlock::new);
    public static final RegistryObject<Block> LOOMING_STEM = registerBlock("looming_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(MCAdvancement.GROUP)));
        return toReturn;
    }
}
