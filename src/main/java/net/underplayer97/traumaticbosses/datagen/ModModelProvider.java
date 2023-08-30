package net.underplayer97.traumaticbosses.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;
import net.underplayer97.traumaticbosses.common.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		//SINGLE_LAYER_ITEM USES GENERATED -- USING DOUBLE_LAYER_ITEM ADDS ANOTHER TEXTURE
		itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.SINGLE_LAYER_ITEM);
	}
}
