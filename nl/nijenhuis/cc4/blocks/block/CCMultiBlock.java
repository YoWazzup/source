package nl.nijenhuis.cc4.blocks.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import nl.nijenhuis.cc4.CocoCraft4;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class CCMultiBlock extends Block {

	public CCMultiBlock(Material material) {
		super(material);
		this.setCreativeTab(CocoCraft4.tabCocoCraft);
	}

	public CCMultiBlock() {
		this(Material.iron);
	}

	public CCMultiBlock(Material material, float hardness, float resistance) {
		this(material);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}

	public abstract int[] getSubtypes();

	public abstract String getNameForType(int type);

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(Item block, CreativeTabs tab, List list) {
		if (getSubtypes() == null || getSubtypes().length == 0) {
			list.add(new ItemStack(this, 1, 0));
		} else {
			for (int type : getSubtypes()) {
				list.add(new ItemStack(this, 1, type));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public abstract boolean useCustomRender();

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {

	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube() {
		return !this.useCustomRender();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean renderAsNormalBlock() {
		return !this.useCustomRender();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderType() {
		return this.useCustomRender() ? -1 : 0;
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		return null;
	}

}
