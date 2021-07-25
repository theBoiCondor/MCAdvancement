package condorcrest.mca.registry;

import condorcrest.mca.MCAdvancement;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCAdvancement.MOD_ID);

    public static final RegistryObject<Item> LOOMBERRIES = ITEMS.register("loomberries", () -> new ItemNameBlockItem(ModBlocks.LOOMBERRY_BUSH.get(), new Item.Properties().tab(MCAdvancement.GROUP).food(Foods.SWEET_BERRIES)));
    public static final RegistryObject<Item> LOOMING_WART = ITEMS.register("looming_wart", () -> new Item(new Item.Properties().tab(MCAdvancement.GROUP)));

}
