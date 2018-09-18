package com.OlleThunberg.ArmourPlus.items.armor;

import com.OlleThunberg.ArmourPlus.Main;
import com.OlleThunberg.ArmourPlus.init.ModItems;
import com.OlleThunberg.ArmourPlus.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		// REGISTER THE ITEM
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		// TODO Auto-generated method stub
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(2) != null) {
			if( player.inventory.armorItemInSlot(3).getItem() == ModItems.WOODEN_IRON_HELMET
				&& player.inventory.armorItemInSlot(2).getItem() == ModItems.WOODEN_IRON_CHESTPLATE
				&& player.inventory.armorItemInSlot(1).getItem() == ModItems.WOODEN_IRON_LEGGINGS
				&& player.inventory.armorItemInSlot(0).getItem() == ModItems.WOODEN_IRON_BOOTS) {
			effectPlayer(player, Potion.getPotionById(1), 0);
			}
			if( player.inventory.armorItemInSlot(3).getItem() == ModItems.PEAST_HELMET
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.PEAST_CHESTPLATE
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.PEAST_LEGGINGS
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.PEAST_BOOTS) {
				effectPlayer(player, Potion.getPotionById(26), 0);
				effectPlayer(player, Potion.getPotionById(1), 1);
				}
		}
		super.onArmorTick(world, player, stack);
	}

	private void effectPlayer(EntityPlayer entity, Potion potion, int amplifier) {
		if(entity.getActivePotionEffect(potion) == null || entity.getActivePotionEffect(potion).getDuration() <= 1) {
			entity.addPotionEffect(new PotionEffect(potion, 150, amplifier));
		}
	}

}
