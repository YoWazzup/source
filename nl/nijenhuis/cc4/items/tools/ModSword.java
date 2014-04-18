package nl.nijenhuis.cc4.items.tools;

import net.minecraft.item.ItemSword;
import nl.nijenhuis.cc4.CocoCraft4;

public class ModSword extends ItemSword {

	public ModSword(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("pickaxe");
		setCreativeTab(CocoCraft4.tabCocoCraft);
	}

}
