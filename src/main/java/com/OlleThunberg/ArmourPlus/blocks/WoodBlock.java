package com.OlleThunberg.ArmourPlus.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WoodBlock extends BlockBase {

	public WoodBlock(String name, Material material) 
	{	
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.5F);
		setResistance(35.0F);
		setHarvestLevel("axe", 1);
	}

}
