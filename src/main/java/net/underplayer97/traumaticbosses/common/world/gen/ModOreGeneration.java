package net.underplayer97.traumaticbosses.common.world.gen;

import net.minecraft.world.gen.GenerationStep;
import net.underplayer97.traumaticbosses.common.world.ModPlacedFeatures;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

public class ModOreGeneration {

	public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY);

	}

}
