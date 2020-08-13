package com.fox_dever.fox_mod.items;

import com.fox_dever.fox_mod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item
{
    public MaterialItem() {
        super(new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB));
    }
}
