package net.underplayer97.traumaticbosses.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.RecipeCategory;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;
import net.underplayer97.traumaticbosses.common.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

	private static List<ItemConvertible> TUNGSTEN_SMELTABLES = List.of(
		ModItems.RAW_TUNGSTEN,
		ModBlocks.TUNGSTEN_ORE,
		ModBlocks.DEEPSLATE_TUNGSTEN_ORE
	);
	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		offerSmelting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.7f,
			250,"tungsten");
		offerBlasting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.4f,
			150, "tungsten");
	}
}
