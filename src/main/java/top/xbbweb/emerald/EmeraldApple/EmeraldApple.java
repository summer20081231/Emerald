package top.xbbweb.emerald.EmeraldApple;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import top.xbbweb.emerald.EmeraldGroup.ModGroup;

public class EmeraldApple extends Item {
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(100)
            .build();

    public EmeraldApple() {
        super(new Properties().food(food).group(ModGroup.ITEM_GROUP));
    }
}
