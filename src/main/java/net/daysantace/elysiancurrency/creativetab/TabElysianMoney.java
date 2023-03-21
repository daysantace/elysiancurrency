
package net.daysantace.elysiancurrency.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.daysantace.elysiancurrency.item.ItemNovaterraPoundOne;
import net.daysantace.elysiancurrency.ElementsElysiancurrencyMod;

@ElementsElysiancurrencyMod.ModElement.Tag
public class TabElysianMoney extends ElementsElysiancurrencyMod.ModElement {
	public TabElysianMoney(ElementsElysiancurrencyMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabelysianmoney") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemNovaterraPoundOne.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
