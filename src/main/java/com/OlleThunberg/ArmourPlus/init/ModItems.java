package com.OlleThunberg.ArmourPlus.init;

import java.util.ArrayList;
import java.util.List;

import com.OlleThunberg.ArmourPlus.items.itemBase;
import com.OlleThunberg.ArmourPlus.items.armor.ArmorBase;
import com.OlleThunberg.ArmourPlus.utils.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
//THIS IS GOING TO HOLD ALL OF AOUR MOD ITEMS
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial ARMOUR_MATERIAL_REFINED_WOOD = EnumHelper.addArmorMaterial("armour_material_refined_wood", Reference.MOD_ID + ":refined_wood", 7, 
			new int[] {1, 5, 4, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	public static final Item REFINED_WOOD = new itemBase("refined_wood");
	
	
	//Armour
	public static final Item REFINED_WOOD_HELMET = new ArmorBase("refined_wood_helmet", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.HEAD); //HELMET OBJECT
	public static final Item REFINED_WOOD_CHESTPLATE = new ArmorBase("refined_wood_chestplate", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.CHEST); 
	public static final Item REFINED_WOOD_LEGGINGS = new ArmorBase("refined_wood_leggings", ARMOUR_MATERIAL_REFINED_WOOD, 2, EntityEquipmentSlot.LEGS); 
	public static final Item REFINED_WOOD_BOOTS = new ArmorBase("refined_wood_boots", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.FEET); 
}
