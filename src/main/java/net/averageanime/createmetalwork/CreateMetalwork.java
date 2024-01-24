package net.averageanime.createmetalwork;

import net.averageanime.createmetalwork.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.averageanime.createmetalwork.fluid.ModFluids.register;
import static net.averageanime.createmetalwork.item.ModItems.registerItem;

public class CreateMetalwork implements ModInitializer {
	public static final String MOD_ID = "createmetalwork";

	public static final Logger LOGGER = LoggerFactory.getLogger("createmetalwork");

	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.createmetalwork"))
				.icon(() -> new ItemStack(ModItems.ICON))
				.entries(((displayContext, entries) -> {
					entries.add(ModItems.CRUSHEDNETHERITESCRAP);
				}))
				.build());

		if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
			final Item CRUSHEDRAWADAMANTITE = registerItem("crushed_raw_adamantite", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWADAMANTITE);
			});
			final Item CRUSHEDRAWAQUARIUM = registerItem("crushed_raw_aquarium", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWAQUARIUM);
			});
			final Item CRUSHEDRAWBANGLUM = registerItem("crushed_raw_banglum", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWBANGLUM);
			});
			final Item CRUSHEDRAWCARMOT = registerItem("crushed_raw_carmot", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWCARMOT);
			});
			final Item CRUSHEDRAWKYBER = registerItem("crushed_raw_kyber", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWKYBER);
			});
			final Item CRUSHEDRAWMANGANESE = registerItem("crushed_raw_manganese", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWMANGANESE);
			});
			final Item CRUSHEDRAWMIDASGOLD = registerItem("crushed_raw_midas_gold", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWMIDASGOLD);
			});
			final Item CRUSHEDMORKITE = registerItem("crushed_morkite", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDMORKITE);
			});
			final Item CRUSHEDRAWMYTHRIL = registerItem("crushed_raw_mythril", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWMYTHRIL);
			});
			final Item CRUSHEDRAWORICHALCUM = registerItem("crushed_raw_orichalcum", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWORICHALCUM);
			});
			final Item CRUSHEDRAWPALLADIUM = registerItem("crushed_raw_palladium", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWPALLADIUM);
			});
			final Item CRUSHEDRAWPROMETHEUM = registerItem("crushed_raw_prometheum", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWPROMETHEUM);
			});
			final Item CRUSHEDRAWQUADRILLUM = registerItem("crushed_raw_quadrillum", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWQUADRILLUM);
			});
			final Item CRUSHEDRAWRUNITE = registerItem("crushed_raw_runite", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWRUNITE);
			});
			final Item CRUSHEDRAWSTORMYX = registerItem("crushed_raw_stormyx", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDRAWSTORMYX);
			});
			final Item CRUSHEDSTARRITE = registerItem("crushed_starrite", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDSTARRITE);
			});
			final Item CRUSHEDUNOBTAINIUM = registerItem("crushed_unobtainium", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
				entries.add(CRUSHEDUNOBTAINIUM);
			});
		}

		ModItems.registerModItems();
		register();

	}
}

