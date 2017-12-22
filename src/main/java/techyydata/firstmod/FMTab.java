package techyydata.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import techyydata.firstmod.registry.ItemRegistry;

/**
 * Created by fabbe on 22/12/2017 - 3:39 AM.
 */
public class FMTab {
    public static CreativeTabs firstModTab = new CreativeTabs(Reference.MOD_ID + ".firsttab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemRegistry.TEST_ITEM);
        }
    };
}
