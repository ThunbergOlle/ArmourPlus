package com.OlleThunberg.ArmourPlus.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.STICK, new ItemStack(ModItems.REFINED_WOOD), 1.5f);
		GameRegistry.addSmelting(ModItems.WOODEN_IRON, new ItemStack(ModItems.BURNED_IRON), 1.5f);
	}
}
