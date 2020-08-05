package com.fox_dever.fox_mod.init;

import com.fox_dever.fox_mod.FoxMod;
import com.fox_dever.fox_mod.items.MaterialItem;
import javafx.scene.paint.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoxMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", MaterialItem::new);
}
