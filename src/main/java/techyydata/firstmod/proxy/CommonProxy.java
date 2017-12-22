package techyydata.firstmod.proxy;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import techyydata.firstmod.registry.BlockRegistry;
import techyydata.firstmod.registry.ItemRegistry;

/**
 * Created by fabbe on 08/12/2017 - 11:41 PM.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlockRegistry.init();
        ItemRegistry.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void onServerStarted(FMLServerStartedEvent event) {
        
    }
}