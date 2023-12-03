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

public class DevModBlocks {

	public static void init(){

		//Blocks
		Registry.register(Registries.BLOCK, new Identifier(BossMain.MOD_ID, "test_block"), TEST_BLOCK);

		//Items
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "test_block"), new BlockItem(TEST_BLOCK, new QuiltItemSettings()));

		//Groups
		Registry.register(Registries.ITEM_GROUP, new Identifier(BossMain.MOD_ID, "test_block_group"), TEST_BLOCK_GROUP);
	}

	public static final Block TEST_BLOCK = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());

	private static final ItemGroup TEST_BLOCK_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(TEST_BLOCK))
		.name(Text.translatable("itemGroup.traumaticbosses.test_group"))
		.entries((displayContext, entries) -> {
			entries.addItem(DevModBlocks.TEST_BLOCK);
		})
		.build();

}
