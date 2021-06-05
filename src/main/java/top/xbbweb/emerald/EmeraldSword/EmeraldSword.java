package top.xbbweb.emerald.EmeraldSword;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;

public class EmeraldSword extends SwordItem {
    public EmeraldSword(){
        super(ModItemTier.EMERALD, 3, -2.4F, new Item.Properties().group(ModGroup.ITEM_GROUP));
    }
}
