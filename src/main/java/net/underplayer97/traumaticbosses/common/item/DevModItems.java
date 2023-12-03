package net.underplayer97.traumaticbosses.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.underplayer97.traumaticbosses.BossMain;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class DevModItems {

	public static void init(){

		//Items
		Registry.register(Registries.ITEM, new Identifier(BossMain.MOD_ID, "test_item"), TEST_ITEM);

		//Group
		Registry.register(Registries.ITEM_GROUP, new Identifier(BossMain.MOD_ID, "test_item_group"), TEST_ITEM_GROUP);
	}

	public static final Item TEST_ITEM = new Item(new QuiltItemSettings());

	private static final ItemGroup TEST_ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(TEST_ITEM))
		.name(Text.translatable("itemGroup.traumaticbosses.test_item_group"))
		.entries((displayContext, entries) -> {

			entries.addItem(DevModItems.TEST_ITEM);
		})
		.build();

}
