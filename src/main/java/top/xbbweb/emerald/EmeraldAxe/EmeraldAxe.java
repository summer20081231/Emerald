package top.xbbweb.emerald.EmeraldAxe;

import net.minecraft.item.AxeItem;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;
import top.xbbweb.emerald.EmeraldSword.ModItemTier;

public class EmeraldAxe extends AxeItem {
    public EmeraldAxe() {
        super(ModItemTier.EMERALD, 3, -2.4F, new Properties().group(ModGroup.ITEM_GROUP));
    }
}
