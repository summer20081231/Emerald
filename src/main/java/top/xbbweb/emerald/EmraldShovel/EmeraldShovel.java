package top.xbbweb.emerald.EmraldShovel;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import top.xbbweb.emerald.EmeraldAxe.EmeraldAxe;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;
import top.xbbweb.emerald.EmeraldSword.ModItemTier;

public class EmeraldShovel extends ShovelItem {
    public EmeraldShovel() {
        super(ModItemTier.EMERALD, 2, -2.4F, (new Item.Properties().group(ModGroup.ITEM_GROUP)));
    }
}
