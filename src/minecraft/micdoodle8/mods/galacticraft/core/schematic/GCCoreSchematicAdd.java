package micdoodle8.mods.galacticraft.core.schematic;

import micdoodle8.mods.galacticraft.API.ISchematicPage;
import micdoodle8.mods.galacticraft.core.GCCoreConfigManager;
import micdoodle8.mods.galacticraft.core.client.gui.GCCoreGuiSchematicInput;
import micdoodle8.mods.galacticraft.core.inventory.GCCoreContainerSchematic;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class GCCoreSchematicAdd implements ISchematicPage
{
	@Override
	public int getPageID() 
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public int getGuiID() 
	{
		return GCCoreConfigManager.idGuiAddSchematic;
	}

	@Override
	public ItemStack getRequiredItem() 
	{
		return null;
	}

	@Override
	public String getTitle() 
	{
		return "Add Schematic";
	}

	@Override
	public GuiScreen getResultScreen(EntityPlayer player, int x, int y, int z) 
	{
		return new GCCoreGuiSchematicInput(player.inventory, x, y, z);
	}

	@Override
	public Container getResultContainer(EntityPlayer player, int x, int y, int z) 
	{
		return new GCCoreContainerSchematic(player.inventory, x, y, z);
	}

	@Override
	public int compareTo(ISchematicPage o) 
	{
		if (this.getPageID() > o.getPageID())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
