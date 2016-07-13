package com.koehn.ue.items;

import java.util.List;

import com.koehn.ue.Names;
import com.koehn.ue.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemCoral extends ItemBase
{
	int count = 4;
	public IIcon[] icons = new IIcon[count];
	
    public ItemCoral(String coral)
    {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(coral);
        
    }
    
    @Override
    public void registerIcons(IIconRegister reg) {
        for (int i = 0; i < count; i ++) {
            this.icons[i] = reg.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + i);
        }
    }
    
    @Override
    public IIcon getIconFromDamage(int meta) {
        if (meta > count)
            meta = 0;

        return this.icons[meta];
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < count; i ++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
}