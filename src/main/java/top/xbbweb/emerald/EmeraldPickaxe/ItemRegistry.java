package top.xbbweb.emerald.EmeraldPickaxe;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.xbbweb.emerald.Utils;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> EmeraldPickaxe = ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);
}
