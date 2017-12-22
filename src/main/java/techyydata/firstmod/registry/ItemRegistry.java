package techyydata.firstmod.registry;

import net.minecraft.item.Item;
import techyydata.firstmod.FMTab;
import techyydata.firstmod.Reference;
import techyydata.firstmod.handler.RegistryHandler;

/**
 * Created by fabbe on 22/12/2017 - 3:37 AM.
 */
public class ItemRegistry {
    public static final Item TEST_ITEM = new Item().setRegistryName(Reference.MOD_ID, "testitem").setUnlocalizedName(Reference.MOD_ID + ":testitem").setCreativeTab(FMTab.firstModTab);

    public static void init() {
        RegistryHandler.registerItem(TEST_ITEM);
    }
}
