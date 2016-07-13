package com.koehn.ue;

import com.koehn.ue.items.ItemBase;
import com.koehn.ue.items.ItemCoral;
import com.koehn.ue.items.ItemSulfur;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemRegistry
{
    public static ItemBase iCoral = new ItemCoral(null);
    public static ItemBase iSulfur= new ItemSulfur();

    public static void init()
    {
        GameRegistry.registerItem(iCoral = new ItemCoral("coral"), "coral");
        GameRegistry.registerItem(iSulfur, Names.Items.sulpur);
    }
}