package biomesoplenty.common.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenOriginValley extends BOPBiome
{

	public BiomeGenOriginValley(int par1)
	{
		super(par1);
		
		/*
		theBiomeDecorator = new BiomeDecoratorBOP(this);
		customBiomeDecorator = (BiomeDecoratorBOP)theBiomeDecorator;
		topBlock = (byte)Blocks.originGrass.get().blockID;
		customBiomeDecorator.treesPerChunk = 4;
		customBiomeDecorator.grassPerChunk = -999;
		customBiomeDecorator.generatePumpkins = false;
		customBiomeDecorator.sandPerChunk = 0;
		customBiomeDecorator.sandPerChunk2 = 0;
		customBiomeDecorator.clayPerChunk = 0;
		customBiomeDecorator.rootsPerChunk = -999;
		customBiomeDecorator.stalagmitesPerChunk = -999;
		customBiomeDecorator.stalactitesPerChunk = -999;
		customBiomeDecorator.minersDelightPerChunk = -999;
		customBiomeDecorator.generateUndergroundLakes = false;
		*/
	}

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	/*
	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return new WorldGenOriginTree(false);
	}
	*/

	/*@Override
	public int getBiomeGrassColor()
	{
		return 10682207;
	}

	@Override
	public int getBiomeFoliageColor()
	{
		return 3866368;
	}*/

	/*
	@Override
	public int getSkyColorByTemp(float par1)
	{
		if (BOPConfigurationMisc.skyColors)
			return 8441086;
		else
		{
			par1 /= 3.0F;

			if (par1 < -1.0F)
			{
				par1 = -1.0F;
			}

			if (par1 > 1.0F)
			{
				par1 = 1.0F;
			}

			return Color.getHSBColor(0.62222224F - par1 * 0.05F, 0.5F + par1 * 0.1F, 1.0F).getRGB();
		}
	}
	*/
}