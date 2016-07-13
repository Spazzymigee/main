package com.koehn.ue.gen;

import java.util.Random;

import com.koehn.ue.BlockRegistry;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenUE implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 15; k++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        		
        	(new WorldGenUnderwater(1, BlockRegistry.bVent)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
	
        }
        
        for(int k = 0; k < 20; k++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenUnderwater(3, BlockRegistry.bCoral, 0)).generateMeta(world, rand, firstBlockXCoord, firstBlockYCoord + 1, (firstBlockZCoord + 1));
        	(new WorldGenUnderwater(3, BlockRegistry.bCoral, 1)).generateMeta(world, rand, firstBlockXCoord, firstBlockYCoord + 1, (firstBlockZCoord + 1));
        	(new WorldGenUnderwater(3, BlockRegistry.bCoral, 2)).generateMeta(world, rand, firstBlockXCoord, firstBlockYCoord + 1, (firstBlockZCoord + 1));
        	(new WorldGenUnderwater(3, BlockRegistry.bCoral, 3)).generateMeta(world, rand, firstBlockXCoord, firstBlockYCoord + 1, (firstBlockZCoord + 1));
	
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}

}