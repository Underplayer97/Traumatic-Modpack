package net.underplayer97.traumaticbosses.common.world;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.BootstrapContext;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.underplayer97.traumaticbosses.BossMain;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

	public static final RegistryKey<ConfiguredFeature<?,?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");

	public static void boostrap(BootstrapContext<ConfiguredFeature<?,?>> context) {

		RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

		List<OreFeatureConfig.Target> overworldTungstenOres =
			List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
					OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState()));

		register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTungstenOres, 3));

	}

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BossMain.MOD_ID, name));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																				   RegistryKey<ConfiguredFeature<?, ?>> key, F feature,
																				   FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}


}
