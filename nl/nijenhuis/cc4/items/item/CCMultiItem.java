package nl.nijenhuis.cc4.items.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import nl.nijenhuis.cc4.CocoCraft4;
import nl.nijenhuis.cc4.helpers.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CCMultiItem extends Item {

	public static final String[] names = new String[] { "dustIron", "dustGold", "dustMithril", "dustSilver", "ingotCoco", "ingotMithril", "ingotSilver",
			"gemAmethyst" };

	public CCMultiItem() {
		setHasSubtypes(true);
		setCreativeTab(CocoCraft4.tabCocoCraft);
		setUnlocalizedName("cc4");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";

		switch (itemstack.getItemDamage()) {
		case 0:
			name = names[0];
			break;
		case 1:
			name = names[1];
			break;
		case 2:
			name = names[2];
			break;
		case 3:
			name = names[3];
			break;
		case 4:
			name = names[4];
			break;
		case 5:
			name = names[5];
			break;
		case 6:
			name = names[6];
			break;
		case 7:
			name = names[7];
			break;
		default:
			name = "invalid";
		}
		return getUnlocalizedName() + "." + name;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[names.length];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + names[i]);
		}
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
		switch (meta) {
		case 0:
			return icons[0];
		case 1:
			return icons[1];
		case 2:
			return icons[2];
		case 3:
			return icons[3];
		case 4:
			return icons[4];
		case 5:
			return icons[5];
		case 6:
			return icons[6];
		case 7:
			return icons[7];

		default:
			return icons[0];
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item block, CreativeTabs tab, List list) {
		for (int x = 0; x < names.length; x++) {
			list.add(new ItemStack(this, 1, x));
		}
	}

}
