package net.underplayer97.traumaticbosses.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.underplayer97.traumaticbosses.BossMain;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	//Item Init
	public static void init() {

		//Register Items
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_blade"), TRAUMATIC_BLADE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_guillotine"), TRAUMATIC_GUILLOTINE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_scythe"), TRAUMATIC_SCYTHE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "raw_tungsten"), RAW_TUNGSTEN);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);

		//Registers Groups
		Registry.register(Registries.ITEM_GROUP, new Identifier(BossMain.MOD_ID, "item_group"), ITEM_GROUP);



	}

	//Item Settings
	public static final Item TRAUMATIC_BLADE = new Item(new QuiltItemSettings().maxCount(1).fireproof().maxDamage(10).rarity(Rarity.EPIC));
	public static final Item TRAUMATIC_GUILLOTINE = new Item(new QuiltItemSettings().maxCount(1).fireproof().maxDamage(15).rarity(Rarity.EPIC));
	public static final Item TRAUMATIC_SCYTHE = new Item(new QuiltItemSettings().maxCount(1).fireproof().maxDamage(7).rarity(Rarity.EPIC));
	public static final Item RAW_TUNGSTEN = new Item(new QuiltItemSettings().maxCount(64).fireproof());
	public static final Item TUNGSTEN_INGOT = new Item(new QuiltItemSettings().maxCount(64).fireproof());

	//Group Registry
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(RAW_TUNGSTEN))
		.name(Text.translatable("itemGroup.traumaticbosses.item_group"))
		.entries((displayContext, entries) -> {
			//enteries.addItem(ModItems.); <-- PLACEHOLDER

			entries.addItem(ModItems.RAW_TUNGSTEN);
			entries.addItem(ModItems.TUNGSTEN_INGOT);
			entries.addItem(ModItems.TRAUMATIC_BLADE);
			entries.addItem(ModItems.TRAUMATIC_SCYTHE);
			entries.addItem(ModItems.TRAUMATIC_GUILLOTINE);
		})
		.build();



}
