package techyydata.firstmod.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import techyydata.firstmod.FMTab;
import techyydata.firstmod.Reference;
import techyydata.firstmod.handler.RegistryHandler;

/**
 * Created by fabbe on 22/12/2017 - 3:37 AM.
 */
public class BlockRegistry {
    public static final Block TEST_BLOCK = new Block(Material.ROCK, MapColor.GRAY).setRegistryName(Reference.MOD_ID, "testblock").setUnlocalizedName(Reference.MOD_ID + ":testblock").setCreativeTab(FMTab.firstModTab);

    public static void init() {
        RegistryHandler.registerBlock(TEST_BLOCK);
    }
}
