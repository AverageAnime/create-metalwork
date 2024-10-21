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

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateMetalwork.LOGGER.info("Registering Items for " + CreateMetalwork.MOD_ID);
    }

    public static boolean isCrushedRawMythrilLoaded = false;

    public static void registerItem(){

        final Item CRUSHED_ANDESITE = registerItem("crushed_andesite", new Item(new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_ANDESITE));

        final Item CRUSHED_NETHERITE_SCRAP = registerItem("crushed_netherite_scrap", new Item(new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_NETHERITE_SCRAP));

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {

            final Item CRUSHED_RAW_CALORITE = registerItem("crushed_raw_calorite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_CALORITE));

            final Item CRUSHED_RAW_DESH = registerItem("crushed_raw_desh", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_DESH));

            final Item CRUSHED_RAW_OSTRUM = registerItem("crushed_raw_ostrum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_OSTRUM));

        }

        if (!isCrushedRawMythrilLoaded && (FabricLoader.getInstance().isModLoaded("mythicmetals") || FabricLoader.getInstance().isModLoaded("createbigcannons"))) {
            final Item CRUSHED_RAW_MYTHRIL = registerItem("crushed_raw_mythril", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_MYTHRIL));
            isCrushedRawMythrilLoaded = true;
        }

        if (FabricLoader.getInstance().isModLoaded("createbigcannons")) {

        }

        if (FabricLoader.getInstance().isModLoaded("galosphere")) {

        }

        if (FabricLoader.getInstance().isModLoaded("indrev")) {

            final Item CRUSHED_RAW_TUNGSTEN = registerItem("crushed_raw_tungsten", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_TUNGSTEN));

        }

        if (FabricLoader.getInstance().isModLoaded("majruszsdifficulty")) {

            final Item CRUSHED_ENDERIUM_SHARD = registerItem("crushed_enderium_shard", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_ENDERIUM_SHARD));

        }

        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {

            final Item CRUSHED_MORKITE = registerItem("crushed_morkite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_MORKITE));

            final Item CRUSHED_RAW_ADAMANTITE = registerItem("crushed_raw_adamantite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_ADAMANTITE));

            final Item CRUSHED_RAW_AQUARIUM = registerItem("crushed_raw_aquarium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_AQUARIUM));

            final Item CRUSHED_RAW_BANGLUM = registerItem("crushed_raw_banglum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_BANGLUM));

            final Item CRUSHED_RAW_CARMOT = registerItem("crushed_raw_carmot", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_CARMOT));

            final Item CRUSHED_RAW_KYBER = registerItem("crushed_raw_kyber", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_KYBER));

            final Item CRUSHED_RAW_MANGANESE = registerItem("crushed_raw_manganese", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_MANGANESE));

            final Item CRUSHED_RAW_MIDAS_GOLD = registerItem("crushed_raw_midas_gold", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_MIDAS_GOLD));

            final Item CRUSHED_RAW_ORICHALCUM = registerItem("crushed_raw_orichalcum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_ORICHALCUM));

            final Item CRUSHED_RAW_PALLADIUM = registerItem("crushed_raw_palladium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_PALLADIUM));

            final Item CRUSHED_RAW_PROMETHEUM = registerItem("crushed_raw_prometheum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_PROMETHEUM));

            final Item CRUSHED_RAW_QUADRILLUM = registerItem("crushed_raw_quadrillum", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_QUADRILLUM));

            final Item CRUSHED_RAW_RUNITE = registerItem("crushed_raw_runite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_RUNITE));

            final Item CRUSHED_RAW_STORMYX = registerItem("crushed_raw_stormyx", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_RAW_STORMYX));

            final Item CRUSHEDSTARRITE = registerItem("crushed_starrite", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHEDSTARRITE));

            final Item CRUSHED_UNOBTAINIUM = registerItem("crushed_unobtainium", new Item(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(CRUSHED_UNOBTAINIUM));

        }

        if (FabricLoader.getInstance().isModLoaded("oreganized")) {

        }

    }
}
