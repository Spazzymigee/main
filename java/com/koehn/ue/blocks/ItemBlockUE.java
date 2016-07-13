package com.koehn.ue.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockUE extends ItemBlock{

//private final static String[] SUBNAMES = {"Blue", "Red", "Orange", "Pink"};

public ItemBlockUE(Block block){
	super(block);
	setHasSubtypes(true);
}

@Override
public String getUnlocalizedName(ItemStack stack) {
    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
}

@Override
public int getMetadata(int meta){
	return meta;
}

}