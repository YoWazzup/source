package nl.nijenhuis.cc4.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOre extends ItemBlock {

	public ItemBlockOre(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		String name = "";

		switch (item.getItemDamage()) {
		case 0:
			name = "oreCoco";
			break;
		case 1:
			name = "oreMithril";
			break;
		case 2:
			name = "oreSilver";
			break;
		case 3:
			name = "oreAmethyst";
			break;
		default:
			name = "invalid";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
