package condorcrest.mca;

import condorcrest.mca.registry.ModBlocks;
import condorcrest.mca.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MCAdvancement.MOD_ID)
public class MCAdvancement
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mca";

    public static final CreativeModeTab GROUP = new CreativeModeTab(MCAdvancement.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LOOMBERRIES.get());
        }
    };

    public MCAdvancement() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
