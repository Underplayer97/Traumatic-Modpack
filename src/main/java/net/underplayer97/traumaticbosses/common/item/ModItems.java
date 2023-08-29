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
		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "traumatic_guillotine"), TRAUMATIC_GUILLOTINE);
		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "traumatic_scythe"), TRAUMATIC_SCYTHE);
		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "raw_tungsten"), RAW_TUNGSTEN);
		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "tungsten_ingot"), TUNGSTEN_INGOT);

	}

	//Item Settings
	public static final Item TRAUMATIC_BLADE = new Item(new Item.Settings().maxCount(1).fireproof().maxDamage(10).rarity(Rarity.EPIC));
	public static final Item TRAUMATIC_GUILLOTINE = new Item(new Item.Settings().maxCount(1).fireproof().maxDamage(15).rarity(Rarity.EPIC));
	public static final Item TRAUMATIC_SCYTHE = new Item(new Item.Settings().maxCount(1).fireproof().maxDamage(7).rarity(Rarity.EPIC));
	public static final Item RAW_TUNGSTEN = new Item(new Item.Settings().maxCount(64).fireproof());
	public static final Item TUNGSTEN_INGOT = new Item(new Item.Settings().maxCount(64).fireproof());

}
