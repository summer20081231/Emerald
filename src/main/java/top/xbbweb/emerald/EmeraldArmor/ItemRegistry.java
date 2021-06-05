package top.xbbweb.emerald.EmeraldArmor;

import top.xbbweb.emerald.Utils;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> EmeraldHelmet = ITEMS.register("emerald_helmet", () -> new ArmorItem(EmeraldArmorMaterial.EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> EmeraldChestplate = ITEMS.register("emerald_chestplate", () -> new ArmorItem(EmeraldArmorMaterial.EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> EmeraldLeggings = ITEMS.register("emerald_leggings", () -> new ArmorItem(EmeraldArmorMaterial.EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> EmeraldBoots = ITEMS.register("emerald_boots", () -> new ArmorItem(EmeraldArmorMaterial.EMERALD, EquipmentSlotType.FEET, (new Item.Properties()).group(ModGroup.ITEM_GROUP)));
}
