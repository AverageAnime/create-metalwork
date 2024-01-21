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

    }
}
