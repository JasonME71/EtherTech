package com.bat.ethertech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ETHER_TAB = new CreativeModeTab("ethermodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ETHER_INGOT.get());
        }
    };
}
