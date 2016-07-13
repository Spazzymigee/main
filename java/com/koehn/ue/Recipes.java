package com.koehn.ue;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.bStorageCoral, 1, 0), "XX", "XX", 'X', new ItemStack(ItemRegistry.iCoral, 1, 0)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.bStorageCoral, 1, 1), "XX", "XX", 'X', new ItemStack(ItemRegistry.iCoral, 1, 1)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.bStorageCoral, 1, 2), "XX", "XX", 'X', new ItemStack(ItemRegistry.iCoral, 1, 2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.bStorageCoral, 1, 3), "XX", "XX", 'X', new ItemStack(ItemRegistry.iCoral, 1, 3)));
        
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bStorageCoral, 1, 4), new ItemStack(ItemRegistry.iCoral, 1, 0), new ItemStack(ItemRegistry.iCoral, 1, 1), new ItemStack(ItemRegistry.iCoral, 1, 2), new ItemStack(ItemRegistry.iCoral, 1, 3)));   
        
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.iCoral, 4, 0), new ItemStack(BlockRegistry.bStorageCoral, 1, 0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.iCoral, 4, 1), new ItemStack(BlockRegistry.bStorageCoral, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.iCoral, 4, 2), new ItemStack(BlockRegistry.bStorageCoral, 1, 2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.iCoral, 4, 3), new ItemStack(BlockRegistry.bStorageCoral, 1, 3)));
        
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralBrick, 4, 0), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(ItemRegistry.iCoral, 1,0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralBrick, 4, 1), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(ItemRegistry.iCoral, 1,1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralBrick, 4, 2), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(ItemRegistry.iCoral, 1,2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralBrick, 4, 3), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stonebrick), new ItemStack(ItemRegistry.iCoral, 1,3)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralGlass, 4, 0), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(ItemRegistry.iCoral, 1,0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralGlass, 4, 1), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(ItemRegistry.iCoral, 1,1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralGlass, 4, 2), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(ItemRegistry.iCoral, 1,2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockRegistry.bCoralGlass, 4, 3), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(Blocks.glass), new ItemStack(ItemRegistry.iCoral, 1,3)));

    }
}