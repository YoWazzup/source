package nl.nijenhuis.cc4.blocks.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import nl.nijenhuis.cc4.CocoCraft4;
import nl.nijenhuis.cc4.helpers.Reference;
import nl.nijenhuis.cc4.items.CocoCraftItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreBlock extends Block {

	public OreBlock() {
		super(Material.iron);
		this.setCreativeTab(CocoCraft4.tabCocoCraft);
		setHardness(3F);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune) {
		ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, meta, fortune);
		System.err.println("Haai");

		if (world.getBlockMetadata(x, y, z) == 2) {
			ret.add(new ItemStack(CocoCraftItems.itemDust, 1, 7));
			System.err.println(meta);
		}
		return ret;
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] textures;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[4];

		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + getUnlocalizedName().substring(5) + i);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		switch (meta) {
		case 0:
			return textures[0];
		case 1:
			return textures[1];
		case 2:
			return textures[2];
		case 3:
			return textures[3];

		default: {
			System.err.println("Invalid metadata for" + this.getUnlocalizedName());
			return textures[0];
		}
		}
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(Item block, CreativeTabs tab, List list) {
		for (int i = 0; i < 4; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}

}
