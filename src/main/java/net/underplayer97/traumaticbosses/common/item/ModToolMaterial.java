package net.underplayer97.traumaticbosses.common.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.quiltmc.quiltmappings.constants.MiningLevels;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

	TUNGSTEN(5,3000,2,2,26,
		()-> Ingredient.ofItems((ModItems.TUNGSTEN_INGOT)));

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantablilty;
	private final Supplier<Ingredient> repairIngredient;

	ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantablilty, Supplier<Ingredient> repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantablilty = enchantablilty;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDurability() {
		return this.itemDurability;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getMiningLevel() {
		return this.miningLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantablilty;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}
