package net.averageanime.createmetalwork.item;

import net.averageanime.createmetalwork.CreateMetalwork;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICON = registerItem("icon", new Item(new FabricItemSettings()));
    public static final Item CRUSHEDNETHERITESCRAP = registerItem("crushed_netherite_scrap", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateMetalwork.LOGGER.info("Registering Items for " + CreateMetalwork.MOD_ID);
    }
    public static void registerItem(){

            final Item CRUSHEDANDESITE = registerItem("crushed_andesite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDANDESITE));

        if (FabricLoader.getInstance().isModLoaded("majruszsdifficulty")) {
            final Item CRUSHEDENDERIUMSHARD = registerItem("crushed_enderium_shard", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDENDERIUMSHARD));
        }

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            final Item CRUSHEDRAWCALORITE = registerItem("crushed_raw_calorite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWCALORITE));
            final Item CRUSHEDRAWDESH = registerItem("crushed_raw_desh", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWDESH));
            final Item CRUSHEDRAWOSTRUM = registerItem("crushed_raw_ostrum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWOSTRUM));
        }

        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            final Item CRUSHEDRAWADAMANTITE = registerItem("crushed_raw_adamantite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWADAMANTITE));
            final Item CRUSHEDRAWAQUARIUM = registerItem("crushed_raw_aquarium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWAQUARIUM));
            final Item CRUSHEDRAWBANGLUM = registerItem("crushed_raw_banglum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWBANGLUM));
            final Item CRUSHEDRAWCARMOT = registerItem("crushed_raw_carmot", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWCARMOT));
            final Item CRUSHEDRAWKYBER = registerItem("crushed_raw_kyber", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWKYBER));
            final Item CRUSHEDRAWMANGANESE = registerItem("crushed_raw_manganese", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWMANGANESE));
            final Item CRUSHEDRAWMIDASGOLD = registerItem("crushed_raw_midas_gold", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWMIDASGOLD));
            final Item CRUSHEDMORKITE = registerItem("crushed_morkite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDMORKITE));
            final Item CRUSHEDRAWMYTHRIL = registerItem("crushed_raw_mythril", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWMYTHRIL));
            final Item CRUSHEDRAWORICHALCUM = registerItem("crushed_raw_orichalcum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWORICHALCUM));
            final Item CRUSHEDRAWPALLADIUM = registerItem("crushed_raw_palladium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWPALLADIUM));
            final Item CRUSHEDRAWPROMETHEUM = registerItem("crushed_raw_prometheum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWPROMETHEUM));
            final Item CRUSHEDRAWQUADRILLUM = registerItem("crushed_raw_quadrillum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWQUADRILLUM));
            final Item CRUSHEDRAWRUNITE = registerItem("crushed_raw_runite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWRUNITE));
            final Item CRUSHEDRAWSTORMYX = registerItem("crushed_raw_stormyx", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWSTORMYX));
            final Item CRUSHEDSTARRITE = registerItem("crushed_starrite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDSTARRITE));
            final Item CRUSHEDUNOBTAINIUM = registerItem("crushed_unobtainium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDUNOBTAINIUM));
        }

        if (FabricLoader.getInstance().isModLoaded("indrev")) {
            final Item CRUSHEDRAWTUNGSTEN = registerItem("crushed_raw_tungsten", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDRAWTUNGSTEN));
        }
    }
}
