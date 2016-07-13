package com.koehn.ue.blocks;

import java.util.List;

import com.koehn.ue.BlockRegistry;
import com.koehn.ue.Names;
import com.koehn.ue.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockStorageCoral extends BlockBase
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;

    public BlockStorageCoral()
    {
        super();
        this.setBlockName(Names.Blocks.coralStorage);
        this.setHardness(3F);
        this.setResistance(12F);
    }
    
    
    //Amount of metablocks
    int ca = 5;
    
    //registers multiple textures for each respective block
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister){
    	texture = new IIcon[ca];
    	for(int i = 0; i < ca; i++){
    		texture[i] = par1IconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + i);
    	}
    }

    //adds metadata i think
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List){
    	for(int var4 = 0; var4 < ca; ++var4) {
    		par3List.add(new ItemStack(BlockRegistry.bStorageCoral, 1, var4));
    	}
    }

    //[something] icon for each block
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
    	return texture[meta];
    }

    //damage of blocks
    @Override
    public int damageDropped(int meta){
    	return meta;
    }
    
    
    
    
}