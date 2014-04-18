package nl.nijenhuis.cc4.blocks;

import net.minecraft.block.Block;
import nl.nijenhuis.cc4.blocks.block.CCItemBlock;
import nl.nijenhuis.cc4.blocks.block.ItemBlockOre;
import nl.nijenhuis.cc4.blocks.block.OreBlock;
import nl.nijenhuis.cc4.blocks.block.StorageBlock;
import nl.nijenhuis.cc4.helpers.RegisterHelper;

public class CocoCraftBlocks {

	public static Block storageBlock;
	public static Block oreBlock;

	public static void initBlocks() {

		storageBlock = new StorageBlock();
		oreBlock = new OreBlock();

		registerBlocks();
	}

	public static void registerBlocks() {
		RegisterHelper.registerBlock(storageBlock.setBlockName("storage"), CCItemBlock.class);
		RegisterHelper.registerBlock(oreBlock.setBlockName("ore"), ItemBlockOre.class);
	}
}
