package micdoodle8.mods.galacticraft.planets.mars.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import micdoodle8.mods.galacticraft.core.items.ItemBlockDesc;
import micdoodle8.mods.galacticraft.core.items.ItemBlockGC;
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks;
import micdoodle8.mods.galacticraft.planets.mars.items.ItemBlockEgg;
import micdoodle8.mods.galacticraft.planets.mars.items.ItemBlockMachine;
import micdoodle8.mods.galacticraft.planets.mars.items.ItemBlockMars;
import micdoodle8.mods.galacticraft.planets.mars.items.ItemBlockTintedGlassPane;
import net.minecraft.block.Block;

public class MarsBlocks
{
	public static Block marsBlock;
	public static Block blockSludge;
	public static Block vine;
	public static Block rock;
	public static Block tier2TreasureChest;
	public static Block machine;
	public static Block machineT2;
	public static Block creeperEgg;

	public static void initBlocks()
	{
		MarsBlocks.marsBlock = new BlockBasicMars().setHardness(2.2F).setBlockName("mars");
		MarsBlocks.blockSludge = new BlockSludge().setBlockName("sludge");
		MarsBlocks.vine = new BlockCavernousVine().setHardness(0.1F).setBlockName("cavernVines");
		MarsBlocks.rock = new BlockSlimelingEgg().setHardness(0.75F).setBlockName("slimelingEgg");
		MarsBlocks.tier2TreasureChest = AsteroidBlocks.treasureChestTier2;
		MarsBlocks.machine = new BlockMachineMars().setHardness(1.8F).setBlockName("marsMachine");
		MarsBlocks.machineT2 = new BlockMachineMarsT2().setHardness(1.8F).setBlockName("marsMachineT2");
		MarsBlocks.creeperEgg = new BlockCreeperEgg().setHardness(-1.0F).setBlockName("creeperEgg");
	}

	public static void setHarvestLevels()
	{
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 2, 0); //Copper ore
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 2, 1); //Tin ore
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 3, 2); //Desh ore
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 1, 3); //Iron ore
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 0, 4); //Cobblestone
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 3, 7); //Dungeon brick
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 0, 8); //Decoration block
		MarsBlocks.marsBlock.setHarvestLevel("pickaxe", 1, 9); //Stone
		MarsBlocks.marsBlock.setHarvestLevel("shovel", 0, 5); //Top dirt
		MarsBlocks.marsBlock.setHarvestLevel("shovel", 0, 6); //Dirt
		MarsBlocks.rock.setHarvestLevel("pickaxe", 3);
	}

	public static void registerBlocks()
	{
		GameRegistry.registerBlock(MarsBlocks.marsBlock, ItemBlockMars.class, MarsBlocks.marsBlock.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.blockSludge, ItemBlockDesc.class, MarsBlocks.blockSludge.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.vine, ItemBlockDesc.class, MarsBlocks.vine.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.rock, ItemBlockEgg.class, MarsBlocks.rock.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.creeperEgg, ItemBlockDesc.class, MarsBlocks.creeperEgg.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.machine, ItemBlockMachine.class, MarsBlocks.machine.getUnlocalizedName());
		GameRegistry.registerBlock(MarsBlocks.machineT2, ItemBlockMachine.class, MarsBlocks.machineT2.getUnlocalizedName());
	}
}
