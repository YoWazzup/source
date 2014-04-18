package nl.nijenhuis.cc4;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import nl.nijenhuis.cc4.blocks.CocoCraftBlocks;
import nl.nijenhuis.cc4.helpers.RecipeHandler;
import nl.nijenhuis.cc4.helpers.Reference;
import nl.nijenhuis.cc4.items.CocoCraftItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class CocoCraft4 {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		CocoCraftBlocks.initBlocks();
		CocoCraftItems.initItems();
		RecipeHandler.init();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evemt) {
	}

	// TODO Change Item icon
	public static CreativeTabs tabCocoCraft = new CreativeTabs("tabCocoCraft") {
		public Item getTabIconItem() {
			return Items.iron_boots;
		}
	};

}
