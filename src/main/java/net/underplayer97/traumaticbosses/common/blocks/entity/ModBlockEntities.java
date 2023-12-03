package net.underplayer97.traumaticbosses.common.blocks.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.traumaticbosses.BossMain;
import net.underplayer97.traumaticbosses.common.blocks.ModBlocks;
import org.quiltmc.qsl.block.entity.api.QuiltBlockEntityTypeBuilder;

public class ModBlockEntities {
	//public static BlockEntityType<UpgradedSmithingTableBlockEntity> UPG_SMITHING;

	public static void init() {
		/**UPG_SMITHING = Registry.register(Registry.BLOCK_ENTITY_TYPE,
			new Identifier(BossMain.MOD_ID, "upg_smithing"),
			QuiltBlockEntityTypeBuilder.create(UpgradedSmithingTableBlockEntity::new,
				ModBlocks.UPG_SMITHING).build(null));**/
	}
}
