package condorcrest.mca.registry;

import condorcrest.mca.MCAdvancement;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCAdvancement.MOD_ID);

    public static final RegistryObject<Item> LOOMBERRY = ITEMS.register("loomberry", () -> new Item(new Item.Properties().food(Foods.SWEET_BERRIES)));
}
