package nl.nijenhuis.cc4.items.tools;

import net.minecraft.item.ItemAxe;
import nl.nijenhuis.cc4.CocoCraft4;

public class ModAxe extends ItemAxe {

	public ModAxe(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("pickaxe");
		setCreativeTab(CocoCraft4.tabCocoCraft);
	}

}
