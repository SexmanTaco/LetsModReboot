package com.sexmantaco.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
    }
}
