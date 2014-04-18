package nl.nijenhuis.cc4.items;

import net.minecraft.item.Item;
import nl.nijenhuis.cc4.enums.ToolMaterials;
import nl.nijenhuis.cc4.helpers.Reference;
import nl.nijenhuis.cc4.helpers.RegisterHelper;
import nl.nijenhuis.cc4.items.item.CCMultiItem;
import nl.nijenhuis.cc4.items.tools.ModAxe;
import nl.nijenhuis.cc4.items.tools.ModHoe;
import nl.nijenhuis.cc4.items.tools.ModPickaxe;
import nl.nijenhuis.cc4.items.tools.ModShovel;
import nl.nijenhuis.cc4.items.tools.ModSword;

public class CocoCraftItems {

	public static Item itemDust;
	
	public static Item pickaxeCoco, pickaxeMithril, pickaxeSilver;
	public static Item axeCoco, axeMithril, axeSilver;
	public static Item shovelCoco, shovelMithril, shovelSilver;
	public static Item swordCoco, swordMithril, swordSilver;
	public static Item hoeCoco, hoeMithril, hoeSilver;

	public static void initItems() {

		itemDust = new CCMultiItem();
		
		pickaxeCoco = new ModPickaxe(ToolMaterials.Coco).setUnlocalizedName("pickaxeCoco").setTextureName(Reference.RESOURCE_PREFIX + "pickaxeCoco");
		pickaxeMithril = new ModPickaxe(ToolMaterials.Mithril).setUnlocalizedName("pickaxeMithril").setTextureName(Reference.RESOURCE_PREFIX + "pickaxeMithril");
		pickaxeSilver = new ModPickaxe(ToolMaterials.Silver).setUnlocalizedName("pickaxeSilver").setTextureName(Reference.RESOURCE_PREFIX + "pickaxeSilver");
		
		axeCoco = new ModAxe(ToolMaterials.Coco).setUnlocalizedName("axeCoco").setTextureName(Reference.RESOURCE_PREFIX + "axeCoco");
		axeMithril = new ModAxe(ToolMaterials.Mithril).setUnlocalizedName("axeMithril").setTextureName(Reference.RESOURCE_PREFIX + "axeMithril");
		axeSilver = new ModAxe(ToolMaterials.Silver).setUnlocalizedName("axeSilver").setTextureName(Reference.RESOURCE_PREFIX + "axeSilver");
		
		shovelCoco = new ModShovel(ToolMaterials.Coco).setUnlocalizedName("shovelCoco").setTextureName(Reference.RESOURCE_PREFIX + "shovelCoco");
		shovelMithril = new ModShovel(ToolMaterials.Mithril).setUnlocalizedName("shovelMithril").setTextureName(Reference.RESOURCE_PREFIX + "shovelMithril");
		shovelSilver = new ModShovel(ToolMaterials.Silver).setUnlocalizedName("shovelSilver").setTextureName(Reference.RESOURCE_PREFIX + "shovelSilver");
	
		swordCoco = new ModSword(ToolMaterials.Coco).setUnlocalizedName("swordCoco").setTextureName(Reference.RESOURCE_PREFIX + "swordCoco");
		swordMithril = new ModSword(ToolMaterials.Mithril).setUnlocalizedName("swordMithril").setTextureName(Reference.RESOURCE_PREFIX + "swordMithril");
		swordSilver = new ModSword(ToolMaterials.Silver).setUnlocalizedName("swordSilver").setTextureName(Reference.RESOURCE_PREFIX + "swordSilver");
	
		hoeCoco = new ModHoe(ToolMaterials.Coco).setUnlocalizedName("hoeCoco").setTextureName(Reference.RESOURCE_PREFIX + "hoeCoco");
		hoeMithril = new ModHoe(ToolMaterials.Mithril).setUnlocalizedName("hoeMithril").setTextureName(Reference.RESOURCE_PREFIX + "hoeMithril");
		hoeSilver = new ModHoe(ToolMaterials.Silver).setUnlocalizedName("hoeSilver").setTextureName(Reference.RESOURCE_PREFIX + "hoeSilver");
	
		
		registerItems();
	}

	public static void registerItems() {
		RegisterHelper.registerItem(itemDust);
		
		RegisterHelper.registerItem(pickaxeCoco);
		RegisterHelper.registerItem(pickaxeMithril);
		RegisterHelper.registerItem(pickaxeSilver);
		RegisterHelper.registerItem(axeCoco);
		RegisterHelper.registerItem(axeMithril);
		RegisterHelper.registerItem(axeSilver);
		RegisterHelper.registerItem(shovelCoco);
		RegisterHelper.registerItem(shovelMithril);
		RegisterHelper.registerItem(shovelSilver);
		RegisterHelper.registerItem(swordCoco);
		RegisterHelper.registerItem(swordMithril);
		RegisterHelper.registerItem(swordSilver);
		RegisterHelper.registerItem(hoeCoco);
		RegisterHelper.registerItem(hoeMithril);
		RegisterHelper.registerItem(hoeSilver);
		
		
	}
}
