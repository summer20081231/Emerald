package top.xbbweb.emerald.EmeraldGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.xbbweb.emerald.EmeraldArmor.ItemRegistry;

public class EmeraldGroup extends ItemGroup {
    public EmeraldGroup() {
        super("emerald_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.EmeraldHelmet.get());
    }
}
