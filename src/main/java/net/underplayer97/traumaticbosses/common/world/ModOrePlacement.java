package net.underplayer97.traumaticbosses.common.world;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacementModifier;

import java.util.List;

public class ModOrePlacement {

	public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
		return List.of(countModifier, InSquarePlacementModifier.getInstance(), heightModifier, BiomePlacementModifier.getInstance());
	}

	public static List<PlacementModifier> commonOrePlacementModifiers(int count, PlacementModifier heightModifier) {
		return modifiers(CountPlacementModifier.create(count), heightModifier);
	}

	public static List<PlacementModifier> rareOrePlacementModifiers(int chance, PlacementModifier heightModifier) {
		return modifiers(RarityFilterPlacementModifier.create(chance), heightModifier);
	}


}
