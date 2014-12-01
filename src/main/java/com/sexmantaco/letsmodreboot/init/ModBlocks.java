package com.sexmantaco.letsmodreboot.init;

import com.sexmantaco.letsmodreboot.block.BlockFlag;
import com.sexmantaco.letsmodreboot.block.BlockLMRB;
import com.sexmantaco.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
