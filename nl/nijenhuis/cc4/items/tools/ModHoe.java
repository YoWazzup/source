package nl.nijenhuis.cc4.items.tools;

import net.minecraft.item.ItemHoe;
import nl.nijenhuis.cc4.CocoCraft4;

public class ModHoe extends ItemHoe {

	public ModHoe(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("pickaxe");
		setCreativeTab(CocoCraft4.tabCocoCraft);
	}

}
