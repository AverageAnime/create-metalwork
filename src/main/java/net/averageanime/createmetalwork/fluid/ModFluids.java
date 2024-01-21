package net.averageanime.createmetalwork.fluid;

import net.averageanime.createmetalwork.CreateMetalwork;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
            STILL_MOLTEN_NETHERITE

            ;
    public static FlowableFluid
            FLOWING_MOLTEN_IRON,
            FLOWING_MOLTEN_COPPER,
            FLOWING_MOLTEN_GOLD,
            FLOWING_MOLTEN_NETHERITE
            ;
    public static Block
            MOLTEN_IRON_BLOCK,
            MOLTEN_COPPER_BLOCK,
            MOLTEN_GOLD_BLOCK,
            MOLTEN_NETHERITE_BLOCK
            ;
    public static Item
            MOLTEN_IRON_BUCKET,
            MOLTEN_COPPER_BUCKET,
            MOLTEN_GOLD_BUCKET,
            MOLTEN_NETHERITE_BUCKET
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

    }
}