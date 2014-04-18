package nl.nijenhuis.cc4.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CCItemBlock extends ItemBlock {

	public CCItemBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		String name = "";

		switch (stack.getItemDamage()) {
		case 0:
			name = "cocoStorage";
			break;
		case 1:
			name = "mithrilStorage";
			break;
		case 2:
			name = "silverStorage";
			break;
		case 3:
			name = "amethystStorage";
			break;
		default:
			name = "invalid";
		}
		return getUnlocalizedName() + "." + name;
	}

}
