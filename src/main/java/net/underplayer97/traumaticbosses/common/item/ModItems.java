package net.underplayer97.traumaticbosses.common.item;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.underplayer97.traumaticbosses.BossMain;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.Map;

public class ModItems {

	//Item Init
	public static void init() {

		//Register Items
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_blade"), TRAUMATIC_BLADE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_guillotine"), TRAUMATIC_GUILLOTINE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "traumatic_scythe"), TRAUMATIC_SCYTHE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "raw_tungsten"), RAW_TUNGSTEN);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_pickaxe"), TUNGSTEN_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_helmet"), TUNGSTEN_HELMET);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_chestplate"), TUNGSTEN_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_leggings"), TUNGSTEN_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_boots"), TUNGSTEN_BOOTS);


		//Registers Groups
		Registry.register(Registries.ITEM_GROUP, new Identifier(BossMain.MOD_ID, "item_group"), ITEM_GROUP);



	}

	//Item Settings
	public static final Item TRAUMATIC_BLADE = new SwordItem(ModToolMaterial.TUNGSTEN, 10,0f, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item TRAUMATIC_GUILLOTINE = new AxeItem(ModToolMaterial.TUNGSTEN, 13, -1.0f, new QuiltItemSettings().maxCount(1).fireproof().maxDamage(15).rarity(Rarity.EPIC));
	public static final Item TRAUMATIC_SCYTHE = new HoeItem(ModToolMaterial.TUNGSTEN, 6, 0, new QuiltItemSettings().maxCount(1).fireproof().maxDamage(7).rarity(Rarity.EPIC));
	public static final Item TUNGSTEN_PICKAXE = new PickaxeItem(ModToolMaterial.TUNGSTEN, 6,0f, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item TUNGSTEN_HELMET = new ArmorItem(ModArmorMaterial.TUNGSTEN, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(ModArmorMaterial.TUNGSTEN, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(ModArmorMaterial.TUNGSTEN, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item TUNGSTEN_BOOTS = new ArmorItem(ModArmorMaterial.TUNGSTEN, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings().maxCount(1).fireproof());
	public static final Item RAW_TUNGSTEN = new Item(new QuiltItemSettings().maxCount(64).fireproof());
	public static final Item TUNGSTEN_INGOT = new Item(new QuiltItemSettings().maxCount(64).fireproof());

	//Group Registry
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(RAW_TUNGSTEN))
		.name(Text.translatable("itemGroup.traumaticbosses.item_group"))
		.entries((displayContext, entries) -> {
			//entries.addItem(ModItems.); <-- PLACEHOLDER

			entries.addItem(ModItems.RAW_TUNGSTEN);
			entries.addItem(ModItems.TUNGSTEN_INGOT);
			entries.addItem(ModItems.TRAUMATIC_BLADE);
			entries.addItem(ModItems.TRAUMATIC_SCYTHE);
			entries.addItem(ModItems.TRAUMATIC_GUILLOTINE);
			entries.addItem(ModItems.TUNGSTEN_PICKAXE);
			entries.addItem(ModItems.TUNGSTEN_HELMET);
			entries.addItem(ModItems.TUNGSTEN_CHESTPLATE);
			entries.addItem(ModItems.TUNGSTEN_LEGGINGS);
			entries.addItem(ModItems.TUNGSTEN_BOOTS);

		})
		.build();



}

