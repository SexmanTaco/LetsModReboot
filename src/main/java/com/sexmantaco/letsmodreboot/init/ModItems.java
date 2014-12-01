package com.sexmantaco.letsmodreboot.init;

import com.sexmantaco.letsmodreboot.item.ItemLMRB;
import com.sexmantaco.letsmodreboot.item.ItemMapleLeaf;
import com.sexmantaco.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
