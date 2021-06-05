package top.xbbweb.emerald;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("emerald")
public class Emerald {
    public Emerald(){
        top.xbbweb.emerald.EmeraldStick.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        top.xbbweb.emerald.EmeraldArmor.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        top.xbbweb.emerald.EmeraldNugget.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        top.xbbweb.emerald.EmeraldApple.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        top.xbbweb.emerald.EmeraldPickaxe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        top.xbbweb.emerald.EmeraldSword.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}