package com.OlleThunberg.ArmourPlus.items.armor;

import com.OlleThunberg.ArmourPlus.Main;
import com.OlleThunberg.ArmourPlus.init.ModItems;
import com.OlleThunberg.ArmourPlus.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		//REGISTER THE ITEM
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
