package net.averageanime.createmetalwork.fluid;

import net.averageanime.createmetalwork.CreateMetalwork;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid
            STILL_MOLTEN_ENDERIUM,STILL_MOLTEN_IRON, STILL_MOLTEN_COPPER, STILL_MOLTEN_GOLD, STILL_MOLTEN_NETHERITE, STILL_MOLTEN_ZINC, STILL_MOLTEN_ADAMANTITE, STILL_MOLTEN_AQUARIUM, STILL_MOLTEN_BANGLUM, STILL_MOLTEN_CARMOT, STILL_MOLTEN_KYBER, STILL_MOLTEN_MANGANESE, STILL_MOLTEN_MIDAS_GOLD, STILL_MOLTEN_MORKITE, STILL_MOLTEN_MYTHRIL, STILL_MOLTEN_ORICHALCUM, STILL_MOLTEN_PALLADIUM, STILL_MOLTEN_PROMETHEUM, STILL_MOLTEN_QUADRILLUM, STILL_MOLTEN_RUNITE, STILL_MOLTEN_STORMYX, STILL_MOLTEN_STARRITE, STILL_MOLTEN_OSMIUM, STILL_MOLTEN_PLATINUM, STILL_MOLTEN_SILVER, STILL_MOLTEN_TIN, STILL_MOLTEN_METALLURGIUM, STILL_MOLTEN_MYTHANTITE, STILL_MOLTEN_ANDESITE, STILL_MOLTEN_ANDESITE_ALLOY, STILL_MOLTEN_HALLOWED, STILL_MOLTEN_ORICHADIUM,STILL_MOLTEN_KYRMOT,STILL_MOLTEN_DURASTEEL,STILL_MOLTEN_BRONZE,STILL_MOLTEN_STEEL,STILL_MOLTEN_BRASS,STILL_MOLTEN_OSTRUM,STILL_MOLTEN_CALORITE,STILL_MOLTEN_DESH,STILL_MOLTEN_CELESTIUM, STILL_MOLTEN_STAR_PLATINUM, STILL_MOLTEN_TUNGSTEN, STILL_MOLTEN_ELECTRUM, STILL_MOLTEN_NIKOLITE, STILL_MOLTEN_ENRICHED_NIKOLITE
            ;
    public static FlowableFluid
            FLOWING_MOLTEN_ENDERIUM,FLOWING_MOLTEN_IRON, FLOWING_MOLTEN_COPPER, FLOWING_MOLTEN_GOLD, FLOWING_MOLTEN_NETHERITE, FLOWING_MOLTEN_ZINC, FLOWING_MOLTEN_ADAMANTITE, FLOWING_MOLTEN_AQUARIUM, FLOWING_MOLTEN_BANGLUM, FLOWING_MOLTEN_CARMOT, FLOWING_MOLTEN_KYBER, FLOWING_MOLTEN_MANGANESE, FLOWING_MOLTEN_MIDAS_GOLD, FLOWING_MOLTEN_MORKITE, FLOWING_MOLTEN_MYTHRIL, FLOWING_MOLTEN_ORICHALCUM, FLOWING_MOLTEN_PALLADIUM, FLOWING_MOLTEN_PROMETHEUM, FLOWING_MOLTEN_QUADRILLUM, FLOWING_MOLTEN_RUNITE, FLOWING_MOLTEN_STORMYX, FLOWING_MOLTEN_STARRITE, FLOWING_MOLTEN_OSMIUM, FLOWING_MOLTEN_PLATINUM, FLOWING_MOLTEN_SILVER, FLOWING_MOLTEN_TIN, FLOWING_MOLTEN_METALLURGIUM, FLOWING_MOLTEN_MYTHANTITE, FLOWING_MOLTEN_ANDESITE, FLOWING_MOLTEN_ANDESITE_ALLOY, FLOWING_MOLTEN_HALLOWED,FLOWING_MOLTEN_ORICHADIUM,FLOWING_MOLTEN_KYRMOT,FLOWING_MOLTEN_DURASTEEL,FLOWING_MOLTEN_BRONZE,FLOWING_MOLTEN_STEEL,FLOWING_MOLTEN_BRASS,FLOWING_MOLTEN_OSTRUM,FLOWING_MOLTEN_CALORITE,FLOWING_MOLTEN_DESH,FLOWING_MOLTEN_CELESTIUM, FLOWING_MOLTEN_STAR_PLATINUM, FLOWING_MOLTEN_TUNGSTEN, FLOWING_MOLTEN_ELECTRUM, FLOWING_MOLTEN_NIKOLITE, FLOWING_MOLTEN_ENRICHED_NIKOLITE
            ;
    public static Block
            MOLTEN_ENDERIUM_BLOCK,MOLTEN_IRON_BLOCK, MOLTEN_COPPER_BLOCK, MOLTEN_GOLD_BLOCK, MOLTEN_NETHERITE_BLOCK, MOLTEN_ZINC_BLOCK, MOLTEN_ADAMANTITE_BLOCK, MOLTEN_AQUARIUM_BLOCK, MOLTEN_BANGLUM_BLOCK, MOLTEN_CARMOT_BLOCK, MOLTEN_KYBER_BLOCK, MOLTEN_MANGANESE_BLOCK, MOLTEN_MIDAS_GOLD_BLOCK, MOLTEN_MORKITE_BLOCK, MOLTEN_MYTHRIL_BLOCK, MOLTEN_ORICHALCUM_BLOCK, MOLTEN_PALLADIUM_BLOCK, MOLTEN_PROMETHEUM_BLOCK, MOLTEN_QUADRILLUM_BLOCK, MOLTEN_RUNITE_BLOCK, MOLTEN_STORMYX_BLOCK, MOLTEN_STARRITE_BLOCK, MOLTEN_OSMIUM_BLOCK, MOLTEN_PLATINUM_BLOCK, MOLTEN_SILVER_BLOCK, MOLTEN_TIN_BLOCK, MOLTEN_METALLURGIUM_BLOCK, MOLTEN_MYTHANTITE_BLOCK, MOLTEN_ANDESITE_BLOCK, MOLTEN_ANDESITE_ALLOY_BLOCK, MOLTEN_HALLOWED_BLOCK,MOLTEN_ORICHADIUM_BLOCK,MOLTEN_KYRMOT_BLOCK,MOLTEN_DURASTEEL_BLOCK,MOLTEN_BRONZE_BLOCK,MOLTEN_STEEL_BLOCK,MOLTEN_BRASS_BLOCK,MOLTEN_OSTRUM_BLOCK,MOLTEN_CALORITE_BLOCK,MOLTEN_DESH_BLOCK, MOLTEN_CELESTIUM_BLOCK, MOLTEN_STAR_PLATINUM_BLOCK, MOLTEN_TUNGSTEN_BLOCK, MOLTEN_ELECTRUM_BLOCK, MOLTEN_NIKOLITE_BLOCK, MOLTEN_ENRICHED_NIKOLITE_BLOCK
            ;
    public static Item
            MOLTEN_ENDERIUM_BUCKET,MOLTEN_IRON_BUCKET, MOLTEN_COPPER_BUCKET, MOLTEN_GOLD_BUCKET, MOLTEN_NETHERITE_BUCKET, MOLTEN_ZINC_BUCKET, MOLTEN_ADAMANTITE_BUCKET, MOLTEN_AQUARIUM_BUCKET, MOLTEN_BANGLUM_BUCKET, MOLTEN_CARMOT_BUCKET, MOLTEN_KYBER_BUCKET, MOLTEN_MANGANESE_BUCKET, MOLTEN_MIDAS_GOLD_BUCKET, MOLTEN_MORKITE_BUCKET, MOLTEN_MYTHRIL_BUCKET, MOLTEN_ORICHALCUM_BUCKET, MOLTEN_PALLADIUM_BUCKET, MOLTEN_PROMETHEUM_BUCKET, MOLTEN_QUADRILLUM_BUCKET, MOLTEN_RUNITE_BUCKET, MOLTEN_STORMYX_BUCKET, MOLTEN_STARRITE_BUCKET, MOLTEN_OSMIUM_BUCKET, MOLTEN_PLATINUM_BUCKET, MOLTEN_SILVER_BUCKET, MOLTEN_TIN_BUCKET, MOLTEN_METALLURGIUM_BUCKET, MOLTEN_MYTHANTITE_BUCKET, MOLTEN_ANDESITE_BUCKET, MOLTEN_ANDESITE_ALLOY_BUCKET, MOLTEN_HALLOWED_BUCKET, MOLTEN_ORICHADIUM_BUCKET, MOLTEN_KYRMOT_BUCKET, MOLTEN_DURASTEEL_BUCKET, MOLTEN_BRONZE_BUCKET, MOLTEN_STEEL_BUCKET, MOLTEN_BRASS_BUCKET, MOLTEN_OSTRUM_BUCKET, MOLTEN_CALORITE_BUCKET, MOLTEN_DESH_BUCKET, MOLTEN_CELESTIUM_BUCKET, MOLTEN_STAR_PLATINUM_BUCKET, MOLTEN_TUNGSTEN_BUCKET, MOLTEN_ELECTRUM_BUCKET, MOLTEN_NIKOLITE_BUCKET, MOLTEN_ENRICHED_NIKOLITE_BUCKET
            ;

    public static void registerModFluids () {
        CreateMetalwork.LOGGER.info("Registering Fluids for " + CreateMetalwork.MOD_ID);
    }

    public static void registerFluid() {

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ANDESITE_ALLOY_BUCKET));
        STILL_MOLTEN_ANDESITE_ALLOY = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_andesite_alloy"), new MoltenAndesiteAlloyFluid.Still());
        FLOWING_MOLTEN_ANDESITE_ALLOY = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_andesite_alloy"), new MoltenAndesiteAlloyFluid.Flowing());
        MOLTEN_ANDESITE_ALLOY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_andesite_alloy_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_ANDESITE_ALLOY, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_ANDESITE_ALLOY_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_andesite_alloy_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_ANDESITE_ALLOY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ANDESITE_BUCKET));
        STILL_MOLTEN_ANDESITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_andesite"), new MoltenAndesiteFluid.Still());
        FLOWING_MOLTEN_ANDESITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_andesite"), new MoltenAndesiteFluid.Flowing());
        MOLTEN_ANDESITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_andesite_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_ANDESITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_ANDESITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_andesite_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_ANDESITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_BRASS_BUCKET));
        STILL_MOLTEN_BRASS = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_brass"), new MoltenBrassFluid.Still());
        FLOWING_MOLTEN_BRASS = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_brass"), new MoltenBrassFluid.Flowing());
        MOLTEN_BRASS_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_brass_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_BRASS, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_BRASS_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_brass_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_BRASS, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_BRONZE_BUCKET));
        STILL_MOLTEN_BRONZE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_bronze"), new MoltenBronzeFluid.Still());
        FLOWING_MOLTEN_BRONZE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_bronze"), new MoltenBronzeFluid.Flowing());
        MOLTEN_BRONZE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_bronze_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_BRONZE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_BRONZE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_bronze_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_BRONZE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_COPPER_BUCKET));
        STILL_MOLTEN_COPPER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_copper"), new MoltenCopperFluid.Still());
        FLOWING_MOLTEN_COPPER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_copper"), new MoltenCopperFluid.Flowing());
        MOLTEN_COPPER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_copper_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_COPPER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_COPPER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_copper_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_COPPER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ELECTRUM_BUCKET));
        STILL_MOLTEN_ELECTRUM = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_electrum"), new MoltenElectrumFluid.Still());
        FLOWING_MOLTEN_ELECTRUM = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_electrum"), new MoltenElectrumFluid.Flowing());
        MOLTEN_ELECTRUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_electrum_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_ELECTRUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_ELECTRUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_electrum_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_ELECTRUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_GOLD_BUCKET));
        STILL_MOLTEN_GOLD = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_gold"), new MoltenGoldFluid.Still());
        FLOWING_MOLTEN_GOLD = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_gold"), new MoltenGoldFluid.Flowing());
        MOLTEN_GOLD_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_gold_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_GOLD, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_GOLD_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_gold_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_GOLD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_IRON_BUCKET));
        STILL_MOLTEN_IRON = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_iron"), new MoltenIronFluid.Still());
        FLOWING_MOLTEN_IRON = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_iron"), new MoltenIronFluid.Flowing());
        MOLTEN_IRON_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_iron_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_IRON, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_IRON_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_iron_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_IRON, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_MYTHRIL_BUCKET));
        STILL_MOLTEN_MYTHRIL = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_mythril"), new MoltenMythrilFluid.Still());
        FLOWING_MOLTEN_MYTHRIL = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_mythril"), new MoltenMythrilFluid.Flowing());
        MOLTEN_MYTHRIL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_mythril_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_MYTHRIL, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_MYTHRIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_mythril_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_MYTHRIL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_NETHERITE_BUCKET));
        STILL_MOLTEN_NETHERITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_netherite"), new MoltenNetheriteFluid.Still());
        FLOWING_MOLTEN_NETHERITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_netherite"), new MoltenNetheriteFluid.Flowing());
        MOLTEN_NETHERITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_netherite_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_NETHERITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_NETHERITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_netherite_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_NETHERITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_SILVER_BUCKET));
        STILL_MOLTEN_SILVER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_silver"), new MoltenSilverFluid.Still());
        FLOWING_MOLTEN_SILVER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_silver"), new MoltenSilverFluid.Flowing());
        MOLTEN_SILVER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_silver_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_SILVER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_SILVER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_silver_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_SILVER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_STEEL_BUCKET));
        STILL_MOLTEN_STEEL = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_steel"), new MoltenSteelFluid.Still());
        FLOWING_MOLTEN_STEEL = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_steel"), new MoltenSteelFluid.Flowing());
        MOLTEN_STEEL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_steel_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_STEEL, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_STEEL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_steel_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_STEEL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_TIN_BUCKET));
        STILL_MOLTEN_TIN = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_tin"), new MoltenTinFluid.Still());
        FLOWING_MOLTEN_TIN = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_tin"), new MoltenTinFluid.Flowing());
        MOLTEN_TIN_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_tin_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_TIN, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_TIN_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_tin_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_TIN, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ZINC_BUCKET));
        STILL_MOLTEN_ZINC = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_zinc"), new MoltenZincFluid.Still());
        FLOWING_MOLTEN_ZINC = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_zinc"), new MoltenZincFluid.Flowing());
        MOLTEN_ZINC_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_zinc_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_ZINC, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_ZINC_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_zinc_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_ZINC, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_CALORITE_BUCKET));
            STILL_MOLTEN_CALORITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_calorite"), new MoltenCaloriteFluid.Still());
            FLOWING_MOLTEN_CALORITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_calorite"), new MoltenCaloriteFluid.Flowing());
            MOLTEN_CALORITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_calorite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_CALORITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_CALORITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_calorite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_CALORITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_DESH_BUCKET));
            STILL_MOLTEN_DESH = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_desh"), new MoltenDeshFluid.Still());
            FLOWING_MOLTEN_DESH = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_desh"), new MoltenDeshFluid.Flowing());
            MOLTEN_DESH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_desh_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_DESH, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_DESH_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_desh_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_DESH, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_OSTRUM_BUCKET));
            STILL_MOLTEN_OSTRUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_ostrum"), new MoltenOstrumFluid.Still());
            FLOWING_MOLTEN_OSTRUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_ostrum"), new MoltenOstrumFluid.Flowing());
            MOLTEN_OSTRUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_ostrum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_OSTRUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_OSTRUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_ostrum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_OSTRUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        }

        if (FabricLoader.getInstance().isModLoaded("create_dd")) {

        }

        if (FabricLoader.getInstance().isModLoaded("createbigcannons")) {

        }

        if (FabricLoader.getInstance().isModLoaded("galosphere")) {

        }

        if (FabricLoader.getInstance().isModLoaded("indrev")) {

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ENRICHED_NIKOLITE_BUCKET));
            STILL_MOLTEN_ENRICHED_NIKOLITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_enriched_nikolite"), new MoltenEnrichedNikoliteFluid.Still());
            FLOWING_MOLTEN_ENRICHED_NIKOLITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_enriched_nikolite"), new MoltenEnrichedNikoliteFluid.Flowing());
            MOLTEN_ENRICHED_NIKOLITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_enriched_nikolite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ENRICHED_NIKOLITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ENRICHED_NIKOLITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_enriched_nikolite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ENRICHED_NIKOLITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_NIKOLITE_BUCKET));
            STILL_MOLTEN_NIKOLITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_nikolite"), new MoltenNikoliteFluid.Still());
            FLOWING_MOLTEN_NIKOLITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_nikolite"), new MoltenNikoliteFluid.Flowing());
            MOLTEN_NIKOLITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_nikolite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_NIKOLITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_NIKOLITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_nikolite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_NIKOLITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_TUNGSTEN_BUCKET));
            STILL_MOLTEN_TUNGSTEN = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_tungsten"), new MoltenTungstenFluid.Still());
            FLOWING_MOLTEN_TUNGSTEN = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_tungsten"), new MoltenTungstenFluid.Flowing());
            MOLTEN_TUNGSTEN_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_tungsten_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_TUNGSTEN, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_TUNGSTEN_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_tungsten_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_TUNGSTEN, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        }

        if (FabricLoader.getInstance().isModLoaded("majruszsdifficulty")) {

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ENDERIUM_BUCKET));
            STILL_MOLTEN_ENDERIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_enderium"), new MoltenEnderiumFluid.Still());
            FLOWING_MOLTEN_ENDERIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_enderium"), new MoltenEnderiumFluid.Flowing());
            MOLTEN_ENDERIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_enderium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ENDERIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ENDERIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_enderium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ENDERIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        }

        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ADAMANTITE_BUCKET));
            STILL_MOLTEN_ADAMANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite"), new MoltenAdamantiteFluid.Still());
            FLOWING_MOLTEN_ADAMANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_adamantite"), new MoltenAdamantiteFluid.Flowing());
            MOLTEN_ADAMANTITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ADAMANTITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ADAMANTITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ADAMANTITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_AQUARIUM_BUCKET));
            STILL_MOLTEN_AQUARIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium"), new MoltenAquariumFluid.Still());
            FLOWING_MOLTEN_AQUARIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_aquarium"), new MoltenAquariumFluid.Flowing());
            MOLTEN_AQUARIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_AQUARIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_AQUARIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_AQUARIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_BANGLUM_BUCKET));
            STILL_MOLTEN_BANGLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_banglum"), new MoltenBanglumFluid.Still());
            FLOWING_MOLTEN_BANGLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_banglum"), new MoltenBanglumFluid.Flowing());
            MOLTEN_BANGLUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_banglum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_BANGLUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_BANGLUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_banglum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_BANGLUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_CARMOT_BUCKET));
            STILL_MOLTEN_CARMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_carmot"), new MoltenCarmotFluid.Still());
            FLOWING_MOLTEN_CARMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_carmot"), new MoltenCarmotFluid.Flowing());
            MOLTEN_CARMOT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_carmot_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_CARMOT, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_CARMOT_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_carmot_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_CARMOT, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_CELESTIUM_BUCKET));
            STILL_MOLTEN_CELESTIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_celestium"), new MoltenCelestiumFluid.Still());
            FLOWING_MOLTEN_CELESTIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_celestium"), new MoltenCelestiumFluid.Flowing());
            MOLTEN_CELESTIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_celestium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_CELESTIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_CELESTIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_celestium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_CELESTIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_DURASTEEL_BUCKET));
            STILL_MOLTEN_DURASTEEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_durasteel"), new MoltenDurasteelFluid.Still());
            FLOWING_MOLTEN_DURASTEEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_durasteel"), new MoltenDurasteelFluid.Flowing());
            MOLTEN_DURASTEEL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_durasteel_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_DURASTEEL, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_DURASTEEL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_durasteel_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_DURASTEEL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_HALLOWED_BUCKET));
            STILL_MOLTEN_HALLOWED = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_hallowed"), new MoltenHallowedFluid.Still());
            FLOWING_MOLTEN_HALLOWED = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_hallowed"), new MoltenHallowedFluid.Flowing());
            MOLTEN_HALLOWED_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_hallowed_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_HALLOWED, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_HALLOWED_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_hallowed_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_HALLOWED, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_KYBER_BUCKET));
            STILL_MOLTEN_KYBER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_kyber"), new MoltenKyberFluid.Still());
            FLOWING_MOLTEN_KYBER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_kyber"), new MoltenKyberFluid.Flowing());
            MOLTEN_KYBER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_kyber_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_KYBER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_KYBER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_kyber_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_KYBER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_KYRMOT_BUCKET));
            STILL_MOLTEN_KYRMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_kyrmot"), new MoltenKyrmotFluid.Still());
            FLOWING_MOLTEN_KYRMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_kyrmot"), new MoltenKyrmotFluid.Flowing());
            MOLTEN_KYRMOT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_kyrmot_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_KYRMOT, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_KYRMOT_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_kyrmot_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_KYRMOT, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_MANGANESE_BUCKET));
            STILL_MOLTEN_MANGANESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_manganese"), new MoltenManganeseFluid.Still());
            FLOWING_MOLTEN_MANGANESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_manganese"), new MoltenManganeseFluid.Flowing());
            MOLTEN_MANGANESE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_manganese_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MANGANESE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MANGANESE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_manganese_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MANGANESE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_METALLURGIUM_BUCKET));
            STILL_MOLTEN_METALLURGIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_metallurgium"), new MoltenMetallurgiumFluid.Still());
            FLOWING_MOLTEN_METALLURGIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_metallurgium"), new MoltenMetallurgiumFluid.Flowing());
            MOLTEN_METALLURGIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_metallurgium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_METALLURGIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_METALLURGIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_metallurgium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_METALLURGIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_MIDAS_GOLD_BUCKET));
            STILL_MOLTEN_MIDAS_GOLD = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold"), new MoltenMidasGoldFluid.Still());
            FLOWING_MOLTEN_MIDAS_GOLD = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_midas_gold"), new MoltenMidasGoldFluid.Flowing());
            MOLTEN_MIDAS_GOLD_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MIDAS_GOLD, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MIDAS_GOLD_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MIDAS_GOLD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_MORKITE_BUCKET));
            STILL_MOLTEN_MORKITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_morkite"), new MoltenMorkiteFluid.Still());
            FLOWING_MOLTEN_MORKITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_morkite"), new MoltenMorkiteFluid.Flowing());
            MOLTEN_MORKITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_morkite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MORKITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MORKITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_morkite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MORKITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_MYTHANTITE_BUCKET));
            STILL_MOLTEN_MYTHANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_mythantite"), new MoltenMythantiteFluid.Still());
            FLOWING_MOLTEN_MYTHANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_mythantite"), new MoltenMythantiteFluid.Flowing());
            MOLTEN_MYTHANTITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_mythantite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MYTHANTITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MYTHANTITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_mythantite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MYTHANTITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ORICHADIUM_BUCKET));
            STILL_MOLTEN_ORICHADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_orichadium"), new MoltenOrichadiumFluid.Still());
            FLOWING_MOLTEN_ORICHADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_orichadium"), new MoltenOrichadiumFluid.Flowing());
            MOLTEN_ORICHADIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_orichadium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ORICHADIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ORICHADIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_orichadium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ORICHADIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_ORICHALCUM_BUCKET));
            STILL_MOLTEN_ORICHALCUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum"), new MoltenOrichalcumFluid.Still());
            FLOWING_MOLTEN_ORICHALCUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_orichalcum"), new MoltenOrichalcumFluid.Flowing());
            MOLTEN_ORICHALCUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ORICHALCUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ORICHALCUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ORICHALCUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_OSMIUM_BUCKET));
            STILL_MOLTEN_OSMIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_osmium"), new MoltenOsmiumFluid.Still());
            FLOWING_MOLTEN_OSMIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_osmium"), new MoltenOsmiumFluid.Flowing());
            MOLTEN_OSMIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_osmium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_OSMIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_OSMIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_osmium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_OSMIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_PALLADIUM_BUCKET));
            STILL_MOLTEN_PALLADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_palladium"), new MoltenPalladiumFluid.Still());
            FLOWING_MOLTEN_PALLADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_palladium"), new MoltenPalladiumFluid.Flowing());
            MOLTEN_PALLADIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_palladium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PALLADIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PALLADIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_palladium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PALLADIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_PLATINUM_BUCKET));
            STILL_MOLTEN_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_platinum"), new MoltenPlatinumFluid.Still());
            FLOWING_MOLTEN_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_platinum"), new MoltenPlatinumFluid.Flowing());
            MOLTEN_PLATINUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_platinum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PLATINUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PLATINUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_platinum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PLATINUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_PROMETHEUM_BUCKET));
            STILL_MOLTEN_PROMETHEUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum"), new MoltenPrometheumFluid.Still());
            FLOWING_MOLTEN_PROMETHEUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_prometheum"), new MoltenPrometheumFluid.Flowing());
            MOLTEN_PROMETHEUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PROMETHEUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PROMETHEUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PROMETHEUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_QUADRILLUM_BUCKET));
            STILL_MOLTEN_QUADRILLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum"), new MoltenQuadrillumFluid.Still());
            FLOWING_MOLTEN_QUADRILLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_quadrillum"), new MoltenQuadrillumFluid.Flowing());
            MOLTEN_QUADRILLUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_QUADRILLUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_QUADRILLUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_QUADRILLUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_RUNITE_BUCKET));
            STILL_MOLTEN_RUNITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_runite"), new MoltenRuniteFluid.Still());
            FLOWING_MOLTEN_RUNITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_runite"), new MoltenRuniteFluid.Flowing());
            MOLTEN_RUNITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_runite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_RUNITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_RUNITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_runite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_RUNITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_STARRITE_BUCKET));
            STILL_MOLTEN_STARRITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_starrite"), new MoltenStarriteFluid.Still());
            FLOWING_MOLTEN_STARRITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_starrite"), new MoltenStarriteFluid.Flowing());
            MOLTEN_STARRITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_starrite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_STARRITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_STARRITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_starrite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_STARRITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_STAR_PLATINUM_BUCKET));
            STILL_MOLTEN_STAR_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_star_platinum"), new MoltenStarPlatinumFluid.Still());
            FLOWING_MOLTEN_STAR_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_star_platinum"), new MoltenStarPlatinumFluid.Flowing());
            MOLTEN_STAR_PLATINUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_star_platinum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_STAR_PLATINUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_STAR_PLATINUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_star_platinum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_STAR_PLATINUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> entries.add(MOLTEN_STORMYX_BUCKET));
            STILL_MOLTEN_STORMYX = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx"), new MoltenStormyxFluid.Still());
            FLOWING_MOLTEN_STORMYX = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_stormyx"), new MoltenStormyxFluid.Flowing());
            MOLTEN_STORMYX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_STORMYX, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_STORMYX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_STORMYX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        }

        if (FabricLoader.getInstance().isModLoaded("oreganized")) {

        }

    }

    // Majrusz's Progressive Difficulty
    public static boolean isMoltenEnderium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ENDERIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_ENDERIUM);
    }

    // Vanilla Materials
    public static boolean isMoltenAndesite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ANDESITE) || state.isOf(ModFluids.FLOWING_MOLTEN_ANDESITE);
    }
    public static boolean isMoltenCopper(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_COPPER) || state.isOf(ModFluids.FLOWING_MOLTEN_COPPER);
    }
    public static boolean isMoltenGold(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_GOLD) || state.isOf(ModFluids.FLOWING_MOLTEN_GOLD);
    }
    public static boolean isMoltenIron(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_IRON) || state.isOf(ModFluids.FLOWING_MOLTEN_IRON);
    }
    public static boolean isMoltenNetherite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_NETHERITE) || state.isOf(ModFluids.FLOWING_MOLTEN_NETHERITE);
    }

    // Create
    public static boolean isMoltenAndesiteAlloy(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ANDESITE_ALLOY) || state.isOf(ModFluids.FLOWING_MOLTEN_ANDESITE_ALLOY);
    }
    public static boolean isMoltenBrass(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_BRASS) || state.isOf(ModFluids.FLOWING_MOLTEN_BRASS);
    }
    public static boolean isMoltenZinc(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ZINC) || state.isOf(ModFluids.FLOWING_MOLTEN_ZINC);
    }

// Ad Astra

    public static boolean isMoltenCalorite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_CALORITE) || state.isOf(ModFluids.FLOWING_MOLTEN_CALORITE);
    }
    public static boolean isMoltenDesh(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_DESH) || state.isOf(ModFluids.FLOWING_MOLTEN_DESH);
    }
    public static boolean isMoltenOstrum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_OSTRUM) || state.isOf(ModFluids.FLOWING_MOLTEN_OSTRUM);
    }

// Mythic Metals

    public static boolean isMoltenAdamantite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ADAMANTITE) || state.isOf(ModFluids.FLOWING_MOLTEN_ADAMANTITE);
    }
    public static boolean isMoltenAquarium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_AQUARIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_AQUARIUM);
    }
    public static boolean isMoltenBanglum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_BANGLUM) || state.isOf(ModFluids.FLOWING_MOLTEN_BANGLUM);
    }
    public static boolean isMoltenBronze(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_BRONZE) || state.isOf(ModFluids.FLOWING_MOLTEN_BRONZE);
    }
    public static boolean isMoltenCarmot(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_CARMOT) || state.isOf(ModFluids.FLOWING_MOLTEN_CARMOT);
    }
    public static boolean isMoltenCelestium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_CELESTIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_CELESTIUM);
    }
    public static boolean isMoltenDurasteel(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_DURASTEEL) || state.isOf(ModFluids.FLOWING_MOLTEN_DURASTEEL);
    }
    public static boolean isMoltenHallowed(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_HALLOWED) || state.isOf(ModFluids.FLOWING_MOLTEN_HALLOWED);
    }
    public static boolean isMoltenKyber(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_KYBER) || state.isOf(ModFluids.FLOWING_MOLTEN_KYBER);
    }
    public static boolean isMoltenKyrmot(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_KYRMOT) || state.isOf(ModFluids.FLOWING_MOLTEN_KYRMOT);
    }
    public static boolean isMoltenManganese(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MANGANESE) || state.isOf(ModFluids.FLOWING_MOLTEN_MANGANESE);
    }
    public static boolean isMoltenMetallurgium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_METALLURGIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_METALLURGIUM);
    }
    public static boolean isMoltenMidasGold(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MIDAS_GOLD) || state.isOf(ModFluids.FLOWING_MOLTEN_MIDAS_GOLD);
    }
    public static boolean isMoltenMorkite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MORKITE) || state.isOf(ModFluids.FLOWING_MOLTEN_MORKITE);
    }
    public static boolean isMoltenMythantite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MYTHANTITE) || state.isOf(ModFluids.FLOWING_MOLTEN_MYTHANTITE);
    }
    public static boolean isMoltenMythril(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MYTHRIL) || state.isOf(ModFluids.FLOWING_MOLTEN_MYTHRIL);
    }
    public static boolean isMoltenOrichadium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ORICHADIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_ORICHADIUM);
    }
    public static boolean isMoltenOrichalcum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ORICHALCUM) || state.isOf(ModFluids.FLOWING_MOLTEN_ORICHALCUM);
    }
    public static boolean isMoltenOsmium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_OSMIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_OSMIUM);
    }
    public static boolean isMoltenPalladium(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_PALLADIUM) || state.isOf(ModFluids.FLOWING_MOLTEN_PALLADIUM);
    }
    public static boolean isMoltenPlatinum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_PLATINUM) || state.isOf(ModFluids.FLOWING_MOLTEN_PLATINUM);
    }
    public static boolean isMoltenPrometheum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_PROMETHEUM) || state.isOf(ModFluids.FLOWING_MOLTEN_PROMETHEUM);
    }
    public static boolean isMoltenQuadrillum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_QUADRILLUM) || state.isOf(ModFluids.FLOWING_MOLTEN_QUADRILLUM);
    }
    public static boolean isMoltenRunite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_RUNITE) || state.isOf(ModFluids.FLOWING_MOLTEN_RUNITE);
    }
    public static boolean isMoltenSilver(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_SILVER) || state.isOf(ModFluids.FLOWING_MOLTEN_SILVER);
    }
    public static boolean isMoltenStarrite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STARRITE) || state.isOf(ModFluids.FLOWING_MOLTEN_STARRITE);
    }
    public static boolean isMoltenStarPlatinum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STAR_PLATINUM) || state.isOf(ModFluids.FLOWING_MOLTEN_STAR_PLATINUM);
    }
    public static boolean isMoltenSteel(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STEEL) || state.isOf(ModFluids.FLOWING_MOLTEN_STEEL);
    }
    public static boolean isMoltenStormyx(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STORMYX) || state.isOf(ModFluids.FLOWING_MOLTEN_STORMYX);
    }
    public static boolean isMoltenTin(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_TIN) || state.isOf(ModFluids.FLOWING_MOLTEN_TIN);
    }

// Industrial Revolution

    public static boolean isMoltenTungsten(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_TUNGSTEN) || state.isOf(ModFluids.FLOWING_MOLTEN_TUNGSTEN);
    }
    public static boolean isMoltenElectrum(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ELECTRUM) || state.isOf(ModFluids.FLOWING_MOLTEN_ELECTRUM);
    }
    public static boolean isMoltenNikolite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_NIKOLITE) || state.isOf(ModFluids.FLOWING_MOLTEN_NIKOLITE);
    }
    public static boolean isMoltenEnrichedNikolite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_ENRICHED_NIKOLITE) || state.isOf(ModFluids.FLOWING_MOLTEN_ENRICHED_NIKOLITE);
    }
}