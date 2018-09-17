package com.OlleThunberg.ArmourPlus.init;

import java.util.ArrayList;
import java.util.List;

import com.OlleThunberg.ArmourPlus.blocks.WoodBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block REFINED_WOOD_BLOCK = new WoodBlock("refined_wood_block", Material.WOOD);
}
