package com.bat.ethertech.item;

import com.bat.ethertech.EtherTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Think of this as a list of all items that your mod adds
    // ITEMS is in all caps, as it is a final field. Java convention states that finals are in all caps.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EtherTech.MOD_ID);

    public static final RegistryObject<Item> ETHER_INGOT = ITEMS.register("ether_ingot",
            // This () is a supplier. So it supplies whatever is after the ->
            () -> new Item((new Item.Properties().tab(ModCreativeModeTab.ETHER_TAB))));

    public static final RegistryObject<Item> ETHER_NUGGET = ITEMS.register("ether_nugget",
            () -> new Item((new Item.Properties().tab(ModCreativeModeTab.ETHER_TAB))));

    public static final RegistryObject<Item> RAW_ETHER_ORE = ITEMS.register("raw_ether_ore",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ETHER_TAB)));


    // Registers new DeferredRegister to the game
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
