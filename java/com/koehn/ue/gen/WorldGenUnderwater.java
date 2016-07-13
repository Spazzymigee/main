package com.koehn.ue.gen;

import java.util.Random;

import com.koehn.ue.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenUnderwater extends WorldGenerator
{
    private Block Block;
    /** The number of blocks to generate. */
    private int numberOfBlocks;
    
    private int metaData;

    public WorldGenUnderwater(int blockNumber,Block whatblock)
    {
        this.Block = whatblock;
        this.numberOfBlocks = blockNumber;
    }
    
    public WorldGenUnderwater(int blockNumber,Block whatblock, int Metadata)
    {
        this.Block = whatblock;
        this.numberOfBlocks = blockNumber;
        
        this.metaData = Metadata;
    }

    public boolean generate(World world, Random rand, int coordx, int coordy, int coordz)
    {
        if (world.getBlock(coordx, coordy, coordz).getMaterial() != Material.water)
        {
            return false;
        }
        else
        {
            int l = rand.nextInt(this.numberOfBlocks);
            byte b0 = 1;

            for (int i1 = coordx - l; i1 <= coordx + l; ++i1)
            {
                for (int j1 = coordz - l; j1 <= coordz + l; ++j1)
                {
                    int k1 = i1 - coordx;
                    int l1 = j1 - coordz;

                    if (k1 * k1 + l1 * l1 <= l * l)
                    {
                        for (int i2 = coordy - b0; i2 <= coordy + b0; ++i2)
                        {
                            Block block = world.getBlock(i1, i2, j1);

                            if (block == Blocks.dirt || block == Blocks.sand|| block == Blocks.gravel)
                            {
                            	world.setBlock(i1, i2, j1, this.Block, 0, 2);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }
    
    public boolean generateMeta(World world, Random rand, int coordx, int coordy, int coordz)
    {
        if (world.getBlock(coordx, coordy, coordz).getMaterial() != Material.water)
        {
            return false;
        }
        else
        {
            int l = rand.nextInt(this.numberOfBlocks);
            byte b0 = 1;

            for (int i1 = coordx - l; i1 <= coordx + l; ++i1)
            {
                for (int j1 = coordz - l; j1 <= coordz + l; ++j1)
                {
                    int k1 = i1 - coordx;
                    int l1 = j1 - coordz;

                    if (k1 * k1 + l1 * l1 <= l * l)
                    {
                        for (int i2 = coordy - b0; i2 <= coordy + b0; ++i2)
                        {
                            Block block = world.getBlock(i1, i2, j1);

                            if (block == Blocks.dirt || block == Blocks.sand|| block == Blocks.gravel)
                            {
                            	world.setBlock(i1, i2 + 1, j1+1, this.Block, this.metaData, 2);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }
}