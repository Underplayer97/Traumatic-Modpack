package net.underplayer97.traumaticbosses.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	//Block Init
	public static void init() {

		//Blocks
		Registry.register(Registries.BLOCK, new Identifier("traumaticbosses", "tungsten_ore"), TUNGSTEN_ORE);

		//Items
		Registry.register(Registries.ITEM, new Identifier("traumaticbosses", "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new QuiltItemSettings()));
	}

	//Block Settings
public static final Block TUNGSTEN_ORE = new Block(QuiltBlockSettings.create().strength(4.0f).requiresTool());

}
