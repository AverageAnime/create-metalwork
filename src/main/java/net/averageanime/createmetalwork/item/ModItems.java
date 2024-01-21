package net.averageanime.createmetalwork.item;

import net.averageanime.createmetalwork.CreateMetalwork;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICON = registerItem("icon", new Item(new FabricItemSettings()));
    public static final Item CRUSHEDNETHERITESCRAP = registerItem("crushed_netherite_scrap", new Item(new FabricItemSettings()));
    public static final Item NETHERITESHEET = registerItem("netherite_sheet", new Item(new FabricItemSettings()));
    public static final Item POLISHEDNETHERITESHEET = registerItem("polished_netherite_sheet", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateMetalwork.LOGGER.info("Registering Mod Items for " + CreateMetalwork.MOD_ID);

    }
}
