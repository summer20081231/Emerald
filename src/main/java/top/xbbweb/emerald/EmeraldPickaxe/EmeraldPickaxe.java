package top.xbbweb.emerald.EmeraldPickaxe;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;
import top.xbbweb.emerald.EmeraldSword.ModItemTier;

public class EmeraldPickaxe extends PickaxeItem {
    public EmeraldPickaxe() {
        super(ModItemTier.EMERALD, 2, -3F, (new Item.Properties().group(ModGroup.ITEM_GROUP)));
    }
}
