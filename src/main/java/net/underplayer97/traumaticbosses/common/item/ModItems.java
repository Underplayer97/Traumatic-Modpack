package net.underplayer97.traumaticbosses.common.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

	//Item Init
	public static void init() {

		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "traumatic_blade"), TRAUMATIC_BLADE);

	}

	//Item Settings
public static final Item TRAUMATIC_BLADE = new Item(new Item.Settings().maxCount(1).fireproof().maxDamage(10).rarity(Rarity.EPIC));

}
