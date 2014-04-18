package nl.nijenhuis.cc4.items.tools;

import net.minecraft.item.ItemPickaxe;
import nl.nijenhuis.cc4.CocoCraft4;

public class ModPickaxe extends ItemPickaxe {

	public ModPickaxe(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("pickaxe");
		setCreativeTab(CocoCraft4.tabCocoCraft);
	}

}
