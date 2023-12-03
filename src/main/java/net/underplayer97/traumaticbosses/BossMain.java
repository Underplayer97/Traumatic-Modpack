package net.underplayer97.traumaticbosses;

import net.underplayer97.traumaticbosses.common.blocks.DevModBlocks;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;
import net.underplayer97.traumaticbosses.common.blocks.entity.ModBlockEntities;
import net.underplayer97.traumaticbosses.common.item.DevModItems;
import net.underplayer97.traumaticbosses.common.item.ModItems;
import net.underplayer97.traumaticbosses.common.world.gen.ModWorldGeneration;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BossMain implements ModInitializer {

	public static final String MOD_ID = "traumaticbosses";
	public static final Logger LOGGER = LoggerFactory.getLogger("Traumatic Modpack");

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.init();
		ModBlocks.init();
		ModBlockEntities.init();

		ModWorldGeneration.generateModWorldGen();

		if(QuiltLoader.isDevelopmentEnvironment()) {
			DevModBlocks.init();
			DevModItems.init();
		}

		//LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
