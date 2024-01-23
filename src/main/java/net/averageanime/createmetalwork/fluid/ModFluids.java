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
            STILL_MOLTEN_IRON,
            STILL_MOLTEN_COPPER,
            STILL_MOLTEN_GOLD,
            STILL_MOLTEN_NETHERITE,
            STILL_MOLTEN_ADAMANTITE,
            STILL_MOLTEN_AQUARIUM,
            STILL_MOLTEN_BANGLUM,
            STILL_MOLTEN_CARMOT,
            STILL_MOLTEN_KYBER,
            STILL_MOLTEN_MANGANESE,
            STILL_MOLTEN_MIDAS_GOLD,
            STILL_MOLTEN_MORKITE,
            STILL_MOLTEN_MYTHRIL,
            STILL_MOLTEN_ORICHALCUM,
            STILL_MOLTEN_PALLADIUM,
            STILL_MOLTEN_PROMETHEUM,
            STILL_MOLTEN_QUADRILLUM,
            STILL_MOLTEN_RUNITE,
            STILL_MOLTEN_STORMYX,
            STILL_MOLTEN_STARRITE,
            STILL_MOLTEN_OSMIUM,
            STILL_MOLTEN_PLATINUM,
            STILL_MOLTEN_SILVER,
            STILL_MOLTEN_TIN
            ;
    public static FlowableFluid
            FLOWING_MOLTEN_IRON,
            FLOWING_MOLTEN_COPPER,
            FLOWING_MOLTEN_GOLD,
            FLOWING_MOLTEN_NETHERITE,
            FLOWING_MOLTEN_ADAMANTITE,
            FLOWING_MOLTEN_AQUARIUM,
            FLOWING_MOLTEN_BANGLUM,
            FLOWING_MOLTEN_CARMOT,
            FLOWING_MOLTEN_KYBER,
            FLOWING_MOLTEN_MANGANESE,
            FLOWING_MOLTEN_MIDAS_GOLD,
            FLOWING_MOLTEN_MORKITE,
            FLOWING_MOLTEN_MYTHRIL,
            FLOWING_MOLTEN_ORICHALCUM,
            FLOWING_MOLTEN_PALLADIUM,
            FLOWING_MOLTEN_PROMETHEUM,
            FLOWING_MOLTEN_QUADRILLUM,
            FLOWING_MOLTEN_RUNITE,
            FLOWING_MOLTEN_STORMYX,
            FLOWING_MOLTEN_STARRITE,
            FLOWING_MOLTEN_OSMIUM,
            FLOWING_MOLTEN_PLATINUM,
            FLOWING_MOLTEN_SILVER,
            FLOWING_MOLTEN_TIN
            ;
    public static Block
            MOLTEN_IRON_BLOCK,
            MOLTEN_COPPER_BLOCK,
            MOLTEN_GOLD_BLOCK,
            MOLTEN_NETHERITE_BLOCK,
            MOLTEN_ADAMANTITE_BLOCK,
            MOLTEN_AQUARIUM_BLOCK,
            MOLTEN_BANGLUM_BLOCK,
            MOLTEN_CARMOT_BLOCK,
            MOLTEN_KYBER_BLOCK,
            MOLTEN_MANGANESE_BLOCK,
            MOLTEN_MIDAS_GOLD_BLOCK,
            MOLTEN_MORKITE_BLOCK,
            MOLTEN_MYTHRIL_BLOCK,
            MOLTEN_ORICHALCUM_BLOCK,
            MOLTEN_PALLADIUM_BLOCK,
            MOLTEN_PROMETHEUM_BLOCK,
            MOLTEN_QUADRILLUM_BLOCK,
            MOLTEN_RUNITE_BLOCK,
            MOLTEN_STORMYX_BLOCK,
            MOLTEN_STARRITE_BLOCK,
            MOLTEN_OSMIUM_BLOCK,
            MOLTEN_PLATINUM_BLOCK,
            MOLTEN_SILVER_BLOCK,
            MOLTEN_TIN_BLOCK
            ;
    public static Item
            MOLTEN_IRON_BUCKET,
            MOLTEN_COPPER_BUCKET,
            MOLTEN_GOLD_BUCKET,
            MOLTEN_NETHERITE_BUCKET,
            MOLTEN_ADAMANTITE_BUCKET,
            MOLTEN_AQUARIUM_BUCKET,
            MOLTEN_BANGLUM_BUCKET,
            MOLTEN_CARMOT_BUCKET,
            MOLTEN_KYBER_BUCKET,
            MOLTEN_MANGANESE_BUCKET,
            MOLTEN_MIDAS_GOLD_BUCKET,
            MOLTEN_MORKITE_BUCKET,
            MOLTEN_MYTHRIL_BUCKET,
            MOLTEN_ORICHALCUM_BUCKET,
            MOLTEN_PALLADIUM_BUCKET,
            MOLTEN_PROMETHEUM_BUCKET,
            MOLTEN_QUADRILLUM_BUCKET,
            MOLTEN_RUNITE_BUCKET,
            MOLTEN_STORMYX_BUCKET,
            MOLTEN_STARRITE_BUCKET,
            MOLTEN_OSMIUM_BUCKET,
            MOLTEN_PLATINUM_BUCKET,
            MOLTEN_SILVER_BUCKET,
            MOLTEN_TIN_BUCKET
            ;

// Vanilla Materials
    public static boolean isMoltenIron(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_IRON) || state.isOf(ModFluids.FLOWING_MOLTEN_IRON);
    }
    public static boolean isMoltenCopper(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_COPPER) || state.isOf(ModFluids.FLOWING_MOLTEN_COPPER);
    }
    public static boolean isMoltenGold(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_GOLD) || state.isOf(ModFluids.FLOWING_MOLTEN_GOLD);
    }
    public static boolean isMoltenNetherite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_NETHERITE) || state.isOf(ModFluids.FLOWING_MOLTEN_NETHERITE);
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
    public static boolean isMoltenCarmot(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_CARMOT) || state.isOf(ModFluids.FLOWING_MOLTEN_CARMOT);
    }
    public static boolean isMoltenKyber(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_KYBER) || state.isOf(ModFluids.FLOWING_MOLTEN_KYBER);
    }
    public static boolean isMoltenManganese(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MANGANESE) || state.isOf(ModFluids.FLOWING_MOLTEN_MANGANESE);
    }
    public static boolean isMoltenMidasGold(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MIDAS_GOLD) || state.isOf(ModFluids.FLOWING_MOLTEN_MIDAS_GOLD);
    }
    public static boolean isMoltenMorkite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MORKITE) || state.isOf(ModFluids.FLOWING_MOLTEN_MORKITE);
    }
    public static boolean isMoltenMythril(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_MYTHRIL) || state.isOf(ModFluids.FLOWING_MOLTEN_MYTHRIL);
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
    public static boolean isMoltenStormyx(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STORMYX) || state.isOf(ModFluids.FLOWING_MOLTEN_STORMYX);
    }
    public static boolean isMoltenStarrite(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_STARRITE) || state.isOf(ModFluids.FLOWING_MOLTEN_STARRITE);
    }
    public static boolean isMoltenTin(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLTEN_TIN) || state.isOf(ModFluids.FLOWING_MOLTEN_TIN);
    }

    public static void register(){

// Vanilla Materials

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
            entries.add(MOLTEN_IRON_BUCKET);
        });
        STILL_MOLTEN_IRON = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_iron"), new MoltenIronFluid.Still());
        FLOWING_MOLTEN_IRON = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_iron"), new MoltenIronFluid.Flowing());
        MOLTEN_IRON_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_iron_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_IRON, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_IRON_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_iron_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_IRON, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
            entries.add(MOLTEN_COPPER_BUCKET);
        });
        STILL_MOLTEN_COPPER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_copper"), new MoltenCopperFluid.Still());
        FLOWING_MOLTEN_COPPER = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_copper"), new MoltenCopperFluid.Flowing());
        MOLTEN_COPPER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_copper_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_COPPER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_COPPER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_copper_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_COPPER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
            entries.add(MOLTEN_GOLD_BUCKET);
        });
        STILL_MOLTEN_GOLD = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_gold"), new MoltenGoldFluid.Still());
        FLOWING_MOLTEN_GOLD = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_gold"), new MoltenGoldFluid.Flowing());
        MOLTEN_GOLD_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_gold_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_GOLD, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_GOLD_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_gold_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_GOLD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
            entries.add(MOLTEN_NETHERITE_BUCKET);
        });
        STILL_MOLTEN_NETHERITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "molten_netherite"), new MoltenNetheriteFluid.Still());
        FLOWING_MOLTEN_NETHERITE = Registry.register(Registries.FLUID,
                new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_netherite"), new MoltenNetheriteFluid.Flowing());
        MOLTEN_NETHERITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_netherite_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_NETHERITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                });
        MOLTEN_NETHERITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_netherite_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_NETHERITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

// Mythic Metals

        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_ADAMANTITE_BUCKET);
            });
            STILL_MOLTEN_ADAMANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite"), new MoltenAdamantiteFluid.Still());
            FLOWING_MOLTEN_ADAMANTITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_adamantite"), new MoltenAdamantiteFluid.Flowing());
            MOLTEN_ADAMANTITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ADAMANTITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ADAMANTITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_adamantite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ADAMANTITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_AQUARIUM_BUCKET);
            });
            STILL_MOLTEN_AQUARIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium"), new MoltenAquariumFluid.Still());
            FLOWING_MOLTEN_AQUARIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_aquarium"), new MoltenAquariumFluid.Flowing());
            MOLTEN_AQUARIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_AQUARIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_AQUARIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_aquarium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_AQUARIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_BANGLUM_BUCKET);
            });
            STILL_MOLTEN_BANGLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_banglum"), new MoltenBanglumFluid.Still());
            FLOWING_MOLTEN_BANGLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_banglum"), new MoltenBanglumFluid.Flowing());
            MOLTEN_BANGLUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_banglum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_BANGLUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_BANGLUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_banglum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_BANGLUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_CARMOT_BUCKET);
            });
            STILL_MOLTEN_CARMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_carmot"), new MoltenCarmotFluid.Still());
            FLOWING_MOLTEN_CARMOT = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_carmot"), new MoltenCarmotFluid.Flowing());
            MOLTEN_CARMOT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_carmot_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_CARMOT, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_CARMOT_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_carmot_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_CARMOT, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_KYBER_BUCKET);
            });
            STILL_MOLTEN_KYBER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_kyber"), new MoltenKyberFluid.Still());
            FLOWING_MOLTEN_KYBER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_kyber"), new MoltenKyberFluid.Flowing());
            MOLTEN_KYBER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_kyber_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_KYBER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_KYBER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_kyber_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_KYBER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_MANGANESE_BUCKET);
            });
            STILL_MOLTEN_MANGANESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_manganese"), new MoltenManganeseFluid.Still());
            FLOWING_MOLTEN_MANGANESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_manganese"), new MoltenManganeseFluid.Flowing());
            MOLTEN_MANGANESE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_manganese_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MANGANESE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MANGANESE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_manganese_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MANGANESE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_MIDAS_GOLD_BUCKET);
            });
            STILL_MOLTEN_MIDAS_GOLD = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold"), new MoltenMidasGoldFluid.Still());
            FLOWING_MOLTEN_MIDAS_GOLD = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_midas_gold"), new MoltenMidasGoldFluid.Flowing());
            MOLTEN_MIDAS_GOLD_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MIDAS_GOLD, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MIDAS_GOLD_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_midas_gold_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MIDAS_GOLD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_MORKITE_BUCKET);
            });
            STILL_MOLTEN_MORKITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_morkite"), new MoltenMorkiteFluid.Still());
            FLOWING_MOLTEN_MORKITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_morkite"), new MoltenMorkiteFluid.Flowing());
            MOLTEN_MORKITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_morkite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MORKITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MORKITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_morkite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MORKITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_MYTHRIL_BUCKET);
            });
            STILL_MOLTEN_MYTHRIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_mythril"), new MoltenMythrilFluid.Still());
            FLOWING_MOLTEN_MYTHRIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_mythril"), new MoltenMythrilFluid.Flowing());
            MOLTEN_MYTHRIL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_mythril_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_MYTHRIL, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_MYTHRIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_mythril_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_MYTHRIL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_ORICHALCUM_BUCKET);
            });
            STILL_MOLTEN_ORICHALCUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum"), new MoltenOrichalcumFluid.Still());
            FLOWING_MOLTEN_ORICHALCUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_orichalcum"), new MoltenOrichalcumFluid.Flowing());
            MOLTEN_ORICHALCUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_ORICHALCUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_ORICHALCUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_orichalcum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_ORICHALCUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_OSMIUM_BUCKET);
            });
            STILL_MOLTEN_OSMIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_osmium"), new MoltenOsmiumFluid.Still());
            FLOWING_MOLTEN_OSMIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_osmium"), new MoltenOsmiumFluid.Flowing());
            MOLTEN_OSMIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_osmium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_OSMIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_OSMIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_osmium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_OSMIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_PALLADIUM_BUCKET);
            });
            STILL_MOLTEN_PALLADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_palladium"), new MoltenPalladiumFluid.Still());
            FLOWING_MOLTEN_PALLADIUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_palladium"), new MoltenPalladiumFluid.Flowing());
            MOLTEN_PALLADIUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_palladium_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PALLADIUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PALLADIUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_palladium_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PALLADIUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_PLATINUM_BUCKET);
            });
            STILL_MOLTEN_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_platinum"), new MoltenPlatinumFluid.Still());
            FLOWING_MOLTEN_PLATINUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_platinum"), new MoltenPlatinumFluid.Flowing());
            MOLTEN_PLATINUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_platinum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PLATINUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PLATINUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_platinum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PLATINUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_PROMETHEUM_BUCKET);
            });
            STILL_MOLTEN_PROMETHEUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum"), new MoltenPrometheumFluid.Still());
            FLOWING_MOLTEN_PROMETHEUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_prometheum"), new MoltenPrometheumFluid.Flowing());
            MOLTEN_PROMETHEUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_PROMETHEUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_PROMETHEUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_prometheum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_PROMETHEUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_QUADRILLUM_BUCKET);
            });
            STILL_MOLTEN_QUADRILLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum"), new MoltenQuadrillumFluid.Still());
            FLOWING_MOLTEN_QUADRILLUM = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_quadrillum"), new MoltenQuadrillumFluid.Flowing());
            MOLTEN_QUADRILLUM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_QUADRILLUM, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_QUADRILLUM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_quadrillum_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_QUADRILLUM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_RUNITE_BUCKET);
            });
            STILL_MOLTEN_RUNITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_runite"), new MoltenRuniteFluid.Still());
            FLOWING_MOLTEN_RUNITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_runite"), new MoltenRuniteFluid.Flowing());
            MOLTEN_RUNITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_runite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_RUNITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_RUNITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_runite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_RUNITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_SILVER_BUCKET);
            });
            STILL_MOLTEN_SILVER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_silver"), new MoltenSilverFluid.Still());
            FLOWING_MOLTEN_SILVER = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_silver"), new MoltenSilverFluid.Flowing());
            MOLTEN_SILVER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_silver_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_SILVER, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_SILVER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_silver_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_SILVER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_STORMYX_BUCKET);
            });
            STILL_MOLTEN_STORMYX = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx"), new MoltenStormyxFluid.Still());
            FLOWING_MOLTEN_STORMYX = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_stormyx"), new MoltenStormyxFluid.Flowing());
            MOLTEN_STORMYX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_STORMYX, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_STORMYX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_stormyx_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_STORMYX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_STARRITE_BUCKET);
            });
            STILL_MOLTEN_STARRITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_starrite"), new MoltenStarriteFluid.Still());
            FLOWING_MOLTEN_STARRITE = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_starrite"), new MoltenStarriteFluid.Flowing());
            MOLTEN_STARRITE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_starrite_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_STARRITE, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_STARRITE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_starrite_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_STARRITE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

            ItemGroupEvents.modifyEntriesEvent(CreateMetalwork.GROUP).register(entries -> {
                entries.add(MOLTEN_TIN_BUCKET);
            });
            STILL_MOLTEN_TIN = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "molten_tin"), new MoltenTinFluid.Still());
            FLOWING_MOLTEN_TIN = Registry.register(Registries.FLUID,
                    new Identifier(CreateMetalwork.MOD_ID, "flowing_molten_tin"), new MoltenTinFluid.Flowing());
            MOLTEN_TIN_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateMetalwork.MOD_ID, "molten_tin_block"),
                    new FluidBlock(ModFluids.STILL_MOLTEN_TIN, FabricBlockSettings.copyOf(Blocks.LAVA)) {
                    });
            MOLTEN_TIN_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateMetalwork.MOD_ID, "molten_tin_bucket"),
                    new BucketItem(ModFluids.STILL_MOLTEN_TIN, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


        }
    }
}