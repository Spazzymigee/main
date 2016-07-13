package com.koehn.ue.blocks;

import java.util.List;
import java.util.Random;

import com.koehn.ue.BlockRegistry;
import com.koehn.ue.ItemRegistry;
import com.koehn.ue.Names;
import com.koehn.ue.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockVent extends BlockBase
{
	
	 @SideOnly(Side.CLIENT)
	 private IIcon iconTop;
	  
	 public BlockVent(Material material)
	 {
		 super(material);
		 this.setBlockName(Names.Blocks.vent);
		 this.setTickRandomly(true);
	     this.setHardness(0.75F);
	     this.setResistance(0.5F);
	        this.setStepSound(Block.soundTypeGravel);
	 }
	 
	 public BlockVent()
	 {
		 this(Material.ground);
	 }
	 
	
	  @SideOnly(Side.CLIENT)
	  @Override
	  public void registerBlockIcons(IIconRegister iconRegister)
	  {
	     this.blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_0");
	     this.iconTop = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_1");
	  }

	  @SideOnly(Side.CLIENT)
	  @Override
	  public IIcon getIcon(int side, int meta)
	  {
	     return side == 1 ? this.iconTop : (side == 0 ? this.blockIcon : (side != meta ? this.blockIcon : this.blockIcon));
	  }
	    
	  @Override
	  public void randomDisplayTick(World world, int x, int y, int z, Random r)
	  {

	      float f = (float)x + 0.5f;
	      float f1 = (float)y + 1.1f;
	      float f2 = (float)z + 0.5f;
	      world.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.2D, 0.0D);
	      world.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.2D, 0.0D);
	      world.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.2D, 0.0D);
	      world.spawnParticle("smoke", (double)f - 0.1, (double)f1 + 0.1, (double)f2, 0.0D, 0.0D, 0.0D);
	      world.spawnParticle("smoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
	      
	  }
	  
	    @Override
	    public int quantityDropped(Random par1Random)
	    {
	        return (par1Random.nextInt(2) + 2);
	    }

	    @Override
	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return ItemRegistry.iSulfur;
	    }   
}