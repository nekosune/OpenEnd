package com.newgaea.openEnd.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class DEndBrickBlock extends EndBrickBlock {

	public DEndBrickBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	@Override
	@Deprecated
	public boolean canDragonDestroy(World world, int x, int y, int z) {
		return false;
	}
}
