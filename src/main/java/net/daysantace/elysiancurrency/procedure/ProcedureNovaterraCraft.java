package net.daysantace.elysiancurrency.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.client.gui.GuiTextField;

import net.daysantace.elysiancurrency.item.ItemNovaterraPoundTwoHundred;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundTwo;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundTwenty;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundTen;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundOneThousand;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundOneHundred;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundOne;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundFiveHundred;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundFive;
import net.daysantace.elysiancurrency.item.ItemNovaterraPoundFifty;
import net.daysantace.elysiancurrency.ElementsElysianCurrency;

import java.util.HashMap;

@ElementsElysianCurrency.ModElement.Tag
public class ProcedureNovaterraCraft extends ElementsElysianCurrency.ModElement {
	public ProcedureNovaterraCraft(ElementsElysianCurrency instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure NovaterraCraft!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure NovaterraCraft!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure NovaterraCraft!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure NovaterraCraft!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure NovaterraCraft!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Items.PAPER, (int) (1)).getItem())) {
			if ((((new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText())).equals("1"))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemNovaterraPoundOne.block, (int) (1));
						_setstack.setCount(1);
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
					}
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
				}
			} else {
				if ((((new Object() {
					public String getText() {
						GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
						if (textField != null) {
							return textField.getText();
						}
						return "";
					}
				}.getText())).equals("2"))) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemNovaterraPoundTwo.block, (int) (1));
							_setstack.setCount(1);
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
					}
				} else {
					if ((((new Object() {
						public String getText() {
							GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
							if (textField != null) {
								return textField.getText();
							}
							return "";
						}
					}.getText())).equals("5"))) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv != null && (inv instanceof TileEntityLockableLoot)) {
								ItemStack _setstack = new ItemStack(ItemNovaterraPoundFive.block, (int) (1));
								_setstack.setCount(1);
								((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
							}
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
					} else {
						if ((((new Object() {
							public String getText() {
								GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
								if (textField != null) {
									return textField.getText();
								}
								return "";
							}
						}.getText())).equals("10"))) {
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv != null && (inv instanceof TileEntityLockableLoot)) {
									ItemStack _setstack = new ItemStack(ItemNovaterraPoundTen.block, (int) (1));
									_setstack.setCount(1);
									((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
								}
							}
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv instanceof TileEntityLockableLoot)
									((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
							}
						} else {
							if ((((new Object() {
								public String getText() {
									GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
									if (textField != null) {
										return textField.getText();
									}
									return "";
								}
							}.getText())).equals("20"))) {
								{
									TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (inv != null && (inv instanceof TileEntityLockableLoot)) {
										ItemStack _setstack = new ItemStack(ItemNovaterraPoundTwenty.block, (int) (1));
										_setstack.setCount(1);
										((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
									}
								}
								{
									TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (inv instanceof TileEntityLockableLoot)
										((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
								}
							} else {
								if ((((new Object() {
									public String getText() {
										GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
										if (textField != null) {
											return textField.getText();
										}
										return "";
									}
								}.getText())).equals("50"))) {
									{
										TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
										if (inv != null && (inv instanceof TileEntityLockableLoot)) {
											ItemStack _setstack = new ItemStack(ItemNovaterraPoundFifty.block, (int) (1));
											_setstack.setCount(1);
											((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
										}
									}
									{
										TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
										if (inv instanceof TileEntityLockableLoot)
											((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
									}
								} else {
									if ((((new Object() {
										public String getText() {
											GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
											if (textField != null) {
												return textField.getText();
											}
											return "";
										}
									}.getText())).equals("100"))) {
										{
											TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
											if (inv != null && (inv instanceof TileEntityLockableLoot)) {
												ItemStack _setstack = new ItemStack(ItemNovaterraPoundOneHundred.block, (int) (1));
												_setstack.setCount(1);
												((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
											}
										}
										{
											TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
											if (inv instanceof TileEntityLockableLoot)
												((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
										}
									} else {
										if ((((new Object() {
											public String getText() {
												GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
												if (textField != null) {
													return textField.getText();
												}
												return "";
											}
										}.getText())).equals("200"))) {
											{
												TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
												if (inv != null && (inv instanceof TileEntityLockableLoot)) {
													ItemStack _setstack = new ItemStack(ItemNovaterraPoundTwoHundred.block, (int) (1));
													_setstack.setCount(1);
													((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
												}
											}
											{
												TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
												if (inv instanceof TileEntityLockableLoot)
													((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
											}
										} else {
											if ((((new Object() {
												public String getText() {
													GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
													if (textField != null) {
														return textField.getText();
													}
													return "";
												}
											}.getText())).equals("500"))) {
												{
													TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
													if (inv != null && (inv instanceof TileEntityLockableLoot)) {
														ItemStack _setstack = new ItemStack(ItemNovaterraPoundFiveHundred.block, (int) (1));
														_setstack.setCount(1);
														((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
													}
												}
												{
													TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
													if (inv instanceof TileEntityLockableLoot)
														((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
												}
											} else {
												if ((((new Object() {
													public String getText() {
														GuiTextField textField = (GuiTextField) guistate.get("text:denomcount");
														if (textField != null) {
															return textField.getText();
														}
														return "";
													}
												}.getText())).equals("1000"))) {
													{
														TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (inv != null && (inv instanceof TileEntityLockableLoot)) {
															ItemStack _setstack = new ItemStack(ItemNovaterraPoundOneThousand.block, (int) (1));
															_setstack.setCount(1);
															((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
														}
													}
													{
														TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (inv instanceof TileEntityLockableLoot)
															((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
													}
												} else {
													{
														TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (inv != null && (inv instanceof TileEntityLockableLoot)) {
															ItemStack _setstack = new ItemStack(Items.PAPER, (int) (1));
															_setstack.setCount(1);
															((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
														}
													}
													{
														TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (inv instanceof TileEntityLockableLoot)
															((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
