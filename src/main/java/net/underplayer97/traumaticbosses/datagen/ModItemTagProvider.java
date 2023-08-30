package net.underplayer97.traumaticbosses.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.ItemTags;
import net.underplayer97.traumaticbosses.common.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider arg) {
		getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
			.add(
				ModItems.TUNGSTEN_HELMET,
				ModItems.TUNGSTEN_CHESTPLATE,
				ModItems.TUNGSTEN_LEGGINGS,
				ModItems.TUNGSTEN_BOOTS
			);
	}
}
