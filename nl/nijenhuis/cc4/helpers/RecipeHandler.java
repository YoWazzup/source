package nl.nijenhuis.cc4.helpers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import nl.nijenhuis.cc4.items.CocoCraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void init() {
		addRecipes();
		addSmelting();
	}

	public static void addRecipes() {

	}
	
	public static void addSmelting() {
		GameRegistry.addSmelting(new ItemStack(CocoCraftItems.itemDust, 1, 0), new ItemStack(Items.iron_ingot), 0.2f);
		GameRegistry.addSmelting(new ItemStack(CocoCraftItems.itemDust, 1, 1), new ItemStack(Items.gold_ingot), 0.2f);
		GameRegistry.addSmelting(new ItemStack(CocoCraftItems.itemDust, 1, 2), new ItemStack(CocoCraftItems.itemDust, 1, 5), 0.2f);
		GameRegistry.addSmelting(new ItemStack(CocoCraftItems.itemDust, 1, 3), new ItemStack(CocoCraftItems.itemDust, 1, 6), 0.2f);
	}
}
