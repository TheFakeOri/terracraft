package net.thefakeori.ulterracraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thefakeori.ulterracraft.UlterraCraft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems(UlterraCraft.MOD_ID);

    public static final DeferredItem<Item> BABYOIL = ITEMS.register("babyoil",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> EPSTINE_LIST = ITEMS.register("epstinelist",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM = ITEMS.register("magnesium",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUMG_DUST = ITEMS.register("cumg_dust",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUMG_INGOT = ITEMS.register("cumg_ingot",
            ()->new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
