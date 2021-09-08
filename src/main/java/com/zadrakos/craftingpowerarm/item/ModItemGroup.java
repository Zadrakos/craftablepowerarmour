package com.zadrakos.craftingpowerarm.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CRAFTINGPOWERARM_GROUP = new ItemGroup("powerArmourCraftingTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BOTTLE_CAP.get());
        }
    };

}
