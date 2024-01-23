package net.averageanime.createmetalwork;

import net.averageanime.createmetalwork.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

@Environment(value= EnvType.CLIENT)
public class CreateMetalworkClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {


// Vanilla Materials

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_IRON, ModFluids.FLOWING_MOLTEN_IRON, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_iron_still"),
                new Identifier("createmetalwork:block/molten_iron_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_COPPER, ModFluids.FLOWING_MOLTEN_COPPER, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_copper_still"),
                new Identifier("createmetalwork:block/molten_copper_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_GOLD, ModFluids.FLOWING_MOLTEN_GOLD, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_gold_still"),
                new Identifier("createmetalwork:block/molten_gold_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_NETHERITE, ModFluids.FLOWING_MOLTEN_NETHERITE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_ore_still"),
                new Identifier("createmetalwork:block/molten_ore_flow"),
                0x654740
        ));

// Mythic Metals

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_ADAMANTITE, ModFluids.FLOWING_MOLTEN_ADAMANTITE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_adamantite_still"),
                new Identifier("createmetalwork:block/molten_adamantite_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_AQUARIUM, ModFluids.FLOWING_MOLTEN_AQUARIUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_aquarium_still"),
                new Identifier("createmetalwork:block/molten_aquarium_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_BANGLUM, ModFluids.FLOWING_MOLTEN_BANGLUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_banglum_still"),
                new Identifier("createmetalwork:block/molten_banglum_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_BRONZE, ModFluids.FLOWING_MOLTEN_BRONZE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_bronze_still"),
                new Identifier("createmetalwork:block/molten_bronze_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_CARMOT, ModFluids.FLOWING_MOLTEN_CARMOT, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_carmot_still"),
                new Identifier("createmetalwork:block/molten_carmot_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_KYBER, ModFluids.FLOWING_MOLTEN_KYBER, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_kyber_still"),
                new Identifier("createmetalwork:block/molten_kyber_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_MANGANESE, ModFluids.FLOWING_MOLTEN_MANGANESE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_manganese_still"),
                new Identifier("createmetalwork:block/molten_manganese_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_MIDAS_GOLD, ModFluids.FLOWING_MOLTEN_MIDAS_GOLD, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_midas_gold_still"),
                new Identifier("createmetalwork:block/molten_midas_gold_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_MORKITE, ModFluids.FLOWING_MOLTEN_MORKITE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_morkite_still"),
                new Identifier("createmetalwork:block/molten_morkite_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_MYTHRIL, ModFluids.FLOWING_MOLTEN_MYTHRIL, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_mythril_still"),
                new Identifier("createmetalwork:block/molten_mythril_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_ORICHALCUM, ModFluids.FLOWING_MOLTEN_ORICHALCUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_orichalcum_still"),
                new Identifier("createmetalwork:block/molten_orichalcum_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_OSMIUM, ModFluids.FLOWING_MOLTEN_OSMIUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_osmium_still"),
                new Identifier("createmetalwork:block/molten_osmium_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_PALLADIUM, ModFluids.FLOWING_MOLTEN_PALLADIUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_palladium_still"),
                new Identifier("createmetalwork:block/molten_palladium_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_PLATINUM, ModFluids.FLOWING_MOLTEN_PLATINUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_platinum_still"),
                new Identifier("createmetalwork:block/molten_platinum_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_PROMETHEUM, ModFluids.FLOWING_MOLTEN_PROMETHEUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_prometheum_still"),
                new Identifier("createmetalwork:block/molten_prometheum_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_QUADRILLUM, ModFluids.FLOWING_MOLTEN_QUADRILLUM, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_quadrillum_still"),
                new Identifier("createmetalwork:block/molten_quadrillum_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_RUNITE, ModFluids.FLOWING_MOLTEN_RUNITE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_runite_still"),
                new Identifier("createmetalwork:block/molten_runite_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_SILVER, ModFluids.FLOWING_MOLTEN_SILVER, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_silver_still"),
                new Identifier("createmetalwork:block/molten_silver_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_STORMYX, ModFluids.FLOWING_MOLTEN_STORMYX, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_stormyx_still"),
                new Identifier("createmetalwork:block/molten_stormyx_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_STARRITE, ModFluids.FLOWING_MOLTEN_STARRITE, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_starrite_still"),
                new Identifier("createmetalwork:block/molten_starrite_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLTEN_TIN, ModFluids.FLOWING_MOLTEN_TIN, new SimpleFluidRenderHandler(
                new Identifier("createmetalwork:block/molten_tin_still"),
                new Identifier("createmetalwork:block/molten_tin_flow")
        ));

    }
}
