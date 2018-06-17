package com.malconmagic.altar;

import WayofTime.bloodmagic.api.BloodMagicPlugin;
import WayofTime.bloodmagic.api.IBloodMagicAPI;
import WayofTime.bloodmagic.api.IBloodMagicPlugin;
import WayofTime.bloodmagic.altar.ComponentType;

import biomesoplenty.api.block.BOPBlocks;

@BloodMagicPlugin
public class BMPlugin implements IBloodMagicPlugin
{

    @Override
    public void register(IBloodMagicAPI apiInterface)
    {
        apiInterface.registerAltarComponent(BOPBlocks.crystal.getDefaultState(), ComponentType.GLOWSTONE.name());
	}
}