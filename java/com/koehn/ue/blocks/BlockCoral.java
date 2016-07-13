package com.koehn.ue.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.koehn.ue.BlockRegistry;
import com.koehn.ue.ItemRegistry;
import com.koehn.ue.Names;
import com.koehn.ue.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCoral extends BlockBase
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;

    public BlockCoral()
    {
        super();
        this.setBlockName(Names.Blocks.coral);
        this.setHardness(1.75F);
        this.setResistance(5F);
    }
    
    //renders in a X
    @Override
    public int getRenderType() {
    	return 1;
    }
    
    //sets transparent
    @Override
    public boolean isOpaqueCube() {
    	return false;
    }
    
    //renders as non normal
    @Override
    public boolean renderAsNormalBlock() {
    	return false;
    }
    
    //removes collision
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
    
    //Amount of metablocks
    int ca = 4;
    
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
    		par3List.add(new ItemStack(BlockRegistry.bCoral, 1, var4));
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
    
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return (par1Random.nextInt(1) + 2);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemRegistry.iCoral;
    }   
    
}