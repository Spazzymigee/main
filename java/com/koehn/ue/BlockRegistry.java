package com.koehn.ue;

import com.koehn.ue.blocks.BlockBase;
import com.koehn.ue.blocks.BlockCoral;
import com.koehn.ue.blocks.BlockCoralBrick;
import com.koehn.ue.blocks.BlockCoralGlass;
import com.koehn.ue.blocks.BlockKelp;
import com.koehn.ue.blocks.BlockStorageCoral;
import com.koehn.ue.blocks.BlockVent;
import com.koehn.ue.blocks.ItemBlockUE;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockRegistry
{
    public static final BlockBase bCoral = new BlockCoral();
    public static final BlockBase bStorageCoral = new BlockStorageCoral();
    public static final BlockBase bVent = new BlockVent();
    
    public static final BlockBase bCoralBrick = new BlockCoralBrick();
    public static final BlockBase bCoralGlass = new BlockCoralGlass();
    
    public static final BlockBase bKelp = new BlockKelp();

    public static void init()
    {
        GameRegistry.registerBlock(bVent, Names.Blocks.vent);
        
        GameRegistry.registerBlock(bCoral, ItemBlockUE.class, Names.Blocks.coral);
        GameRegistry.registerBlock(bStorageCoral, ItemBlockUE.class, Names.Blocks.coralStorage);
        GameRegistry.registerBlock(bCoralBrick, ItemBlockUE.class, Names.Blocks.coralBrick);
        GameRegistry.registerBlock(bCoralGlass, ItemBlockUE.class, Names.Blocks.coralGlass);
        GameRegistry.registerBlock(bKelp, ItemBlockUE.class, Names.Blocks.kelp);
    }
}
