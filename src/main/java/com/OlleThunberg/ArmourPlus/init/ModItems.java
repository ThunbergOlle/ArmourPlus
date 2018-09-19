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
			new int[] {1, 3, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOUR_MATERIAL_WOODEN_IRON = EnumHelper.addArmorMaterial("armour_material_wooden_iron", Reference.MOD_ID + ":wooden_iron", 7, 
			new int[] {2, 4, 3, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_MATERIAL_PEAST = EnumHelper.addArmorMaterial("armour_material_peast", Reference.MOD_ID + ":peast", 7, 
			new int[] {3, 5, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	//ITEMS
	public static final Item REFINED_WOOD = new itemBase("refined_wood");
	public static final Item WOODEN_IRON = new itemBase("wooden_iron");
	public static final Item BURNED_IRON = new itemBase("burned_iron");
	public static final Item PEAST = new itemBase("peast");
	public static final Item RED_DIAMOND = new itemBase("red_diamond");
	//Armour
	//REFINED WOOD ARMOUR
	public static final Item REFINED_WOOD_HELMET = new ArmorBase("refined_wood_helmet", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.HEAD); //HELMET OBJECT
	public static final Item REFINED_WOOD_CHESTPLATE = new ArmorBase("refined_wood_chestplate", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.CHEST); 
	public static final Item REFINED_WOOD_LEGGINGS = new ArmorBase("refined_wood_leggings", ARMOUR_MATERIAL_REFINED_WOOD, 2, EntityEquipmentSlot.LEGS); 
	public static final Item REFINED_WOOD_BOOTS = new ArmorBase("refined_wood_boots", ARMOUR_MATERIAL_REFINED_WOOD, 1, EntityEquipmentSlot.FEET); 
	
	//WOODEN IRON ARMOUR
	public static final Item WOODEN_IRON_HELMET = new ArmorBase("wooden_iron_helmet", ARMOUR_MATERIAL_WOODEN_IRON,1, EntityEquipmentSlot.HEAD);
	public static final Item WOODEN_IRON_CHESTPLATE = new ArmorBase("wooden_iron_chestplate", ARMOUR_MATERIAL_WOODEN_IRON,1, EntityEquipmentSlot.CHEST);
	public static final Item WOODEN_IRON_LEGGINGS = new ArmorBase("wooden_iron_leggings", ARMOUR_MATERIAL_WOODEN_IRON,2, EntityEquipmentSlot.LEGS);
	public static final Item WOODEN_IRON_BOOTS = new ArmorBase("wooden_iron_boots", ARMOUR_MATERIAL_WOODEN_IRON,1, EntityEquipmentSlot.FEET);
	
	//PEAST ARMOUR
	public static final Item PEAST_HELMET = new ArmorBase("peast_helmet", ARMOUR_MATERIAL_PEAST,1 ,EntityEquipmentSlot.HEAD);
	public static final Item PEAST_CHESTPLATE = new ArmorBase("peast_chestplate", ARMOUR_MATERIAL_PEAST,1 ,EntityEquipmentSlot.CHEST);
	public static final Item PEAST_LEGGINGS = new ArmorBase("peast_leggings", ARMOUR_MATERIAL_PEAST,2 ,EntityEquipmentSlot.LEGS);
	public static final Item PEAST_BOOTS = new ArmorBase("peast_boots", ARMOUR_MATERIAL_PEAST,1 ,EntityEquipmentSlot.FEET);


}
