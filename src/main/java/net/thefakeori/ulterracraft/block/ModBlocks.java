package net.thefakeori.ulterracraft.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thefakeori.ulterracraft.UlterraCraft;
import net.thefakeori.ulterracraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(UlterraCraft.MOD_ID);

    public static final DeferredBlock<Block> PARTY_BLOCK = registerBlocks("party_block",
            ()-> new Block(BlockBehaviour.Properties.of().strength(1f).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MAGNESIUM_ORE = registerBlocks("magnesium_ore",
            ()-> new Block(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.COPPER)));

    public static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
