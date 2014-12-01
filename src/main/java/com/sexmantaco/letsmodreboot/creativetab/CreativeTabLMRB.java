package com.sexmantaco.letsmodreboot.creativetab;

import com.sexmantaco.letsmodreboot.init.ModItems;
import com.sexmantaco.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
