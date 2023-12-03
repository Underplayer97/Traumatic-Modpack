package net.underplayer97.traumaticbosses.common.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.underplayer97.traumaticbosses.BossMain;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	//Block Init
	public static void init() {

		//Blocks
		Registry.register(Registries.BLOCK, new Identifier(BossMain.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
		Registry.register(Registries.BLOCK, new Identifier(BossMain.MOD_ID, "deepslate_tungsten_ore"), DEEPSLATE_TUNGSTEN_ORE);
		Registry.register(Registries.BLOCK, new Identifier(BossMain.MOD_ID, "tungsten_block"), TUNGSTEN_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(BossMain.MOD_ID, "upg_smithing"), UPG_SMITHING);


		//Items
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new QuiltItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "deepslate_tungsten_ore"), new BlockItem(DEEPSLATE_TUNGSTEN_ORE, new QuiltItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "tungsten_block"), new BlockItem(TUNGSTEN_BLOCK, new QuiltItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "upg_smithing"), new BlockItem(UPG_SMITHING, new QuiltItemSettings()));

		//Register Group
		Registry.register(Registries.ITEM_GROUP, new Identifier(BossMain.MOD_ID, "block_group"), BLOCK_GROUP);

	}

	//Block Settings
	public static final Block TUNGSTEN_ORE = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());
	public static final Block DEEPSLATE_TUNGSTEN_ORE = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());
	public static final Block TUNGSTEN_BLOCK = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());
	public static final Block UPG_SMITHING = new Block(QuiltBlockSettings.create().strength(3.0f).requiresTool());

	//Group Registry
	private static final ItemGroup BLOCK_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(TUNGSTEN_ORE))
		.name(Text.translatable("itemGroup.traumaticbosses.block_group"))
		.entries((displayContext, entries) -> {
			// entries.addItem(ModBlocks.); <-- PLACEHOLDER
			entries.addItem(ModBlocks.TUNGSTEN_ORE);
			entries.addItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
			entries.addItem(ModBlocks.TUNGSTEN_BLOCK);
			entries.addItem(ModBlocks.UPG_SMITHING);
		})
		.build();
}
