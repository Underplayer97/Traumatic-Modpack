package net.underplayer97.traumaticbosses.common.world;

import net.minecraft.registry.Holder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.BootstrapContext;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacementModifier;
import net.underplayer97.traumaticbosses.BossMain;

import java.util.List;

public class ModPlacedFeatures {

	public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");

	public static void	boostrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatureLookup = context.lookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatureLookup.getHolderOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
				ModOrePlacement.commonOrePlacementModifiers(12, //Veins per Chunk
					HeightRangePlacementModifier.createUniform(YOffset.fixed(-64), YOffset.fixed(-50))));
	}

	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BossMain.MOD_ID, name));
	}

	private static void register(BootstrapContext<PlacedFeature> context, RegistryKey<PlacedFeature> key,
								 Holder<ConfiguredFeature<?, ?>> configuration,
								 List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}


}
