package net.underplayer97.traumaticbosses.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.ItemConvertible;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;
import net.underplayer97.traumaticbosses.common.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
	public ModLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.TUNGSTEN_ORE, (ItemConvertible) oreDrops(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
		addDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, (ItemConvertible) oreDrops(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
	}
}
