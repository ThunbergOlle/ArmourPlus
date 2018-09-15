package com.OlleThunberg.ArmourPlus.items;

import com.OlleThunberg.ArmourPlus.Main;
import com.OlleThunberg.ArmourPlus.init.ModItems;
import com.OlleThunberg.ArmourPlus.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemBase extends Item implements IHasModel{

	
	//MAKE A CONSTRUCTOR
	public itemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		//REGISTER THE ITEM
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
