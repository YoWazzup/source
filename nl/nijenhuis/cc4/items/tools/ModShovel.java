package nl.nijenhuis.cc4.items.tools;

import net.minecraft.item.ItemSpade;
import nl.nijenhuis.cc4.CocoCraft4;

public class ModShovel extends ItemSpade {

	public ModShovel(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("pickaxe");
		setCreativeTab(CocoCraft4.tabCocoCraft);
	}

}
