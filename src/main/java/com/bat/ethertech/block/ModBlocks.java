package com.bat.ethertech.block;

import com.bat.ethertech.EtherTech;
import com.bat.ethertech.item.ModCreativeModeTab;
import com.bat.ethertech.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EtherTech.MOD_ID);

    //Adds new block to the game.
    public static final RegistryObject<Block> ETHER_BLOCK = registerBlock("ether_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.ETHER_TAB);

    public static final RegistryObject<Block> ETHER_ORE = registerBlock("ether_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.ETHER_TAB);

    public static final RegistryObject<Block> DEEPSLATE_ETHER_ORE = registerBlock("deepslate_ether_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.ETHER_TAB);

    public static final RegistryObject<Block> RAW_ETHER_BLOCK = registerBlock("raw_ether_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.ETHER_TAB);



    //Creates Block
    private static  <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    //Creates Item for the Block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
