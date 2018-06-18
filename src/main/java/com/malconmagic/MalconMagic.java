package com.malconmagic;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MalconMagic.MODID, name = MalconMagic.NAME, version = MalconMagic.VERSION, dependencies = MalconMagic.DEPENDENCIES, acceptableRemoteVersions = "*")
public class MalconMagic
{
    public static final String MODID = "malconmagic";
    public static final String NAME = "MalconMagic";
    public static final String VERSION = "1.0";
	public static final String DEPENDENCIES = "required-after:bloodmagic;required-after:biomesoplenty";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // forge example code
		// (at start) import net.minecraft.init.Blocks;
        // logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
