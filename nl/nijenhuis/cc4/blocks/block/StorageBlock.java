package nl.nijenhuis.cc4.blocks.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import nl.nijenhuis.cc4.CocoCraft4;
import nl.nijenhuis.cc4.helpers.Reference;
import nl.nijenhuis.cc4.helpers.UtilArray;

public class StorageBlock extends CCMultiBlock {

	public static final String[] storageTypes = new String[] { "cocoStorage", "mithrilStorage", "silverStorage", "amethystStorage" };
	private IIcon[] textures;

	public StorageBlock() {
		super(Material.iron);
		setCreativeTab(CocoCraft4.tabCocoCraft);
		setHardness(4F);
	}
	
	public int idDropped(int i, Random rand, int j) {
		return j;
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[storageTypes.length];
		for (int i = 0; i < storageTypes.length; i++) {
			textures[i] = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + storageTypes[i]);
		}
	}

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
			System.err.println("Invalid metadata for" + this.getItemIconName());
			return textures[0];
		}
		}
	}

	@Override
	public int[] getSubtypes() {
		return UtilArray.getArrayIndexes(storageTypes.length);
	}

	@Override
	public String getNameForType(int type) {
		return storageTypes[type];
	}

	@Override
	public boolean useCustomRender() {
		return false;
	}

}
