package top.xbbweb.emerald.EmeraldNugget;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "emerald");
    public static RegistryObject<Item> emerald_nugget = ITEMS.register("emerald_nugget", EmeraldNugget::new);
}
