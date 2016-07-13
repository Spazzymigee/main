package com.koehn.ue;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

import com.koehn.ue.gen.WorldGenUE;
import com.koehn.ue.gen.WorldGenUnderwater;
import com.koehn.ue.handler.ConfigurationHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name=Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class UEBASE
{
	@Instance(value = Reference.MODID)
    public static UEBASE instance;
	
	public static CreativeTabs tabUE = new CreativeTabs("tabUE") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ItemRegistry.iCoral;
	    }
	};

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        
        BlockRegistry.init();
    	ItemRegistry.init();
    	
    	GameRegistry.registerWorldGenerator(new WorldGenUE(), 0);
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	Recipes.init();
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
    
}
