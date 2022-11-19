package com.github.reoseah.psychicoctomemory;

import cpw.mods.fml.common.registry.GameRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PsychicOctoMemory implements ModInitializer {
    @Override
    public void onInitialize() {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.DIAMOND), Item.APPLE);
    }
}
