package net.thefakeori.ulterracraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thefakeori.ulterracraft.UlterraCraft;
import net.thefakeori.ulterracraft.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UlterraCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> ULTERRA_TAB = CREATIVE_MODE_TAB.register("ulterra_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BABYOIL.get()))
                    .title(Component.translatable("creativetab.ulterracraft.ulterra"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BABYOIL);
                        output.accept(ModItems.EPSTINE_LIST);
                        output.accept(ModBlocks.PARTY_BLOCK);
                        output.accept(ModBlocks.MAGNESIUM_ORE);
                        output.accept(ModItems.MAGNESIUM);
                        output.accept(ModItems.CUMG_DUST);
                        output.accept(ModItems.CUMG_INGOT);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
