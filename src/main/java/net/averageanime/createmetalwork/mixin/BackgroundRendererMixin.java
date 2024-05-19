package net.averageanime.createmetalwork.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.averageanime.createmetalwork.fluid.ModFluids;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

    @Environment(EnvType.CLIENT)
    @Mixin(BackgroundRenderer.class)
    public abstract class BackgroundRendererMixin {
    @Shadow
    private static float red;

    @Shadow
    private static float green;

    @Shadow
    private static float blue;

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void $modifyFogColors(Args args, Camera camera, float partialTicks, ClientWorld level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPos());

// Vanilla Materials

        if (ModFluids.isMoltenAndesite(state)) {
            red = (float) 83 / 255;
            green = (float) 91 / 255;
            blue = (float) 85 / 255;
        }
        if (ModFluids.isMoltenIron(state)) {
            red = (float) 240 / 255;
            green = (float) 190 / 255;
            blue = (float) 123 / 255;
        }
        if (ModFluids.isMoltenCopper(state)) {
            red = (float) 173 / 255;
            green = (float) 63 / 255;
            blue = (float) 0 / 255;
        }
        if (ModFluids.isMoltenGold(state)) {
            red = (float) 255 / 255;
            green = (float) 205 / 255;
            blue = (float) 91 / 255;
        }
        if (ModFluids.isMoltenNetherite(state)) {
            red = (float) 101 / 255;
            green = (float) 71 / 255;
            blue = (float) 64 / 255;
        }

// Create
        if (ModFluids.isMoltenAndesiteAlloy(state)) {
            red = (float) 83 / 255;
            green = (float) 91 / 255;
            blue = (float) 85 / 255;
        }
        if (ModFluids.isMoltenBrass(state)) {
            red = (float) 255 / 255;
            green = (float) 205 / 255;
            blue = (float) 91 / 255;
        }
        if (ModFluids.isMoltenZinc(state)) {
            red = (float) 140 / 255;
            green = (float) 200 / 255;
            blue = (float) 140 / 255;
        }

// Ad Astra

        if (ModFluids.isMoltenCalorite(state)) {
            red = (float) 176 / 255;
            green = (float) 77 / 255;
            blue = (float) 123 / 255;
        }
        if (ModFluids.isMoltenDesh(state)) {
            red = (float) 255 / 255;
            green = (float) 87 / 255;
            blue = (float) 57 / 255;
        }
        if (ModFluids.isMoltenOstrum(state)) {
            red = (float) 110 / 255;
            green = (float) 73 / 255;
            blue = (float) 113 / 255;
        }

// Mythic Metals

        if (ModFluids.isMoltenAdamantite(state)) {
            red = (float) 218 / 255;
            green = (float) 26 / 255;
            blue = (float) 26 / 255;
        }
        if (ModFluids.isMoltenAquarium(state)) {
            red = (float) 108 / 255;
            green = (float) 206 / 255;
            blue = (float) 206 / 255;
        }
        if (ModFluids.isMoltenBanglum(state)) {
            red = (float) 146 / 255;
            green = (float) 76 / 255;
            blue = (float) 24 / 255;
        }
        if (ModFluids.isMoltenBronze(state)) {
            red = (float) 255 / 255;
            green = (float) 205 / 255;
            blue = (float) 91 / 255;
        }
        if (ModFluids.isMoltenCarmot(state)) {
            red = (float) 236 / 255;
            green = (float) 71 / 255;
            blue = (float) 134 / 255;
        }
        if (ModFluids.isMoltenCelestium(state)) {
            red = (float) 30 / 255;
            green = (float) 15 / 255;
            blue = (float) 90 / 255;
        }
        if (ModFluids.isMoltenDurasteel(state)) {
            red = (float) 33 / 255;
            green = (float) 30 / 255;
            blue = (float) 21 / 255;
        }
        if (ModFluids.isMoltenHallowed(state)) {
            red = (float) 255 / 255;
            green = (float) 205 / 255;
            blue = (float) 91 / 255;
        }
        if (ModFluids.isMoltenKyber(state)) {
            red = (float) 165 / 255;
            green = (float) 92 / 255;
            blue = (float) 234 / 255;
        }
        if (ModFluids.isMoltenKyrmot(state)) {
            red = (float) 165 / 255;
            green = (float) 92 / 255;
            blue = (float) 234 / 255;
        }
        if (ModFluids.isMoltenManganese(state)) {
            red = (float) 204 / 255;
            green = (float) 108 / 255;
            blue = (float) 114 / 255;
        }
        if (ModFluids.isMoltenMetallurgium(state)) {
            red = (float) 30 / 255;
            green = (float) 15 / 255;
            blue = (float) 90 / 255;
        }
        if (ModFluids.isMoltenMidasGold(state)) {
            red = (float) 255 / 255;
            green = (float) 205 / 255;
            blue = (float) 91 / 255;
        }
        if (ModFluids.isMoltenMorkite(state)) {
            red = (float) 67 / 255;
            green = (float) 190 / 255;
            blue = (float) 180 / 255;
        }
        if (ModFluids.isMoltenMythantite(state)) {
            red = (float) 218 / 255;
            green = (float) 26 / 255;
            blue = (float) 26 / 255;
        }
        if (ModFluids.isMoltenMythril(state)) {
            red = (float) 37 / 255;
            green = (float) 124 / 255;
            blue = (float) 190 / 255;
        }
        if (ModFluids.isMoltenOrichadium(state)) {
            red = (float) 250 / 255;
            green = (float) 160 / 255;
            blue = (float) 75 / 255;
        }
        if (ModFluids.isMoltenOrichalcum(state)) {
            red = (float) 140 / 255;
            green = (float) 200 / 255;
            blue = (float) 140 / 255;
        }
        if (ModFluids.isMoltenOsmium(state)) {
            red = (float) 60 / 255;
            green = (float) 80 / 255;
            blue = (float) 100 / 255;
        }
        if (ModFluids.isMoltenPalladium(state)) {
            red = (float) 250 / 255;
            green = (float) 160 / 255;
            blue = (float) 75 / 255;
        }
        if (ModFluids.isMoltenPlatinum(state)) {
            red = (float) 157 / 255;
            green = (float) 138 / 255;
            blue = (float) 202 / 255;
        }
        if (ModFluids.isMoltenPrometheum(state)) {
            red = (float) 90 / 255;
            green = (float) 177 / 255;
            blue = (float) 66 / 255;
        }
        if (ModFluids.isMoltenQuadrillum(state)) {
            red = (float) 108 / 255;
            green = (float) 206 / 255;
            blue = (float) 192 / 255;
        }
        if (ModFluids.isMoltenRunite(state)) {
            red = (float) 28 / 255;
            green = (float) 90 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isMoltenSilver(state)) {
            red = (float) 158 / 255;
            green = (float) 163 / 255;
            blue = (float) 200 / 255;
        }
        if (ModFluids.isMoltenStarrite(state)) {
            red = (float) 30 / 255;
            green = (float) 15 / 255;
            blue = (float) 90 / 255;
        }
        if (ModFluids.isMoltenStarPlatinum(state)) {
            red = (float) 30 / 255;
            green = (float) 15 / 255;
            blue = (float) 90 / 255;
        }
        if (ModFluids.isMoltenSteel(state)) {
            red = (float) 47 / 255;
            green = (float) 43 / 255;
            blue = (float) 33 / 255;
        }
        if (ModFluids.isMoltenStormyx(state)) {
            red = (float) 30 / 255;
            green = (float) 15 / 255;
            blue = (float) 90 / 255;
        }
        if (ModFluids.isMoltenTin(state)) {
            red = (float) 195 / 255;
            green = (float) 160 / 255;
            blue = (float) 163 / 255;
        }

// Industrial Revolution

        if (ModFluids.isMoltenElectrum(state)) {
            red = (float) 191 / 255;
            green = (float) 141 / 255;
            blue = (float) 34 / 255;
        }
        if (ModFluids.isMoltenEnrichedNikolite(state)) {
            red = (float) 47 / 255;
            green = (float) 11 / 255;
            blue = (float) 127 / 255;
        }
        if (ModFluids.isMoltenNikolite(state)) {
            red = (float) 60 / 255;
            green = (float) 91 / 255;
            blue = (float) 74 / 255;
        }
        if (ModFluids.isMoltenTungsten(state)) {
            red = (float) 81 / 255;
            green = (float) 86 / 255;
            blue = (float) 71 / 255;
        }
    }

    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void $applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());

// Vanilla Materials

        if (ModFluids.isMoltenAndesite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenCopper(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenGold(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenIron(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenNetherite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }

// Create

        if (ModFluids.isMoltenAndesiteAlloy(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenBrass(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenZinc(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }

// Ad Astra

        if (ModFluids.isMoltenCalorite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenDesh(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenOstrum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }

// Mythic Metals

        if (ModFluids.isMoltenAdamantite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenAquarium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenBanglum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenBronze(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenCarmot(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenCelestium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenDurasteel(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenKyber(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenKyrmot(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenManganese(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenMetallurgium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenMidasGold(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenMorkite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenMythantite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenMythril(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenOrichadium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenOrichalcum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenOsmium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenPalladium(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenPlatinum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenPrometheum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenQuadrillum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenRunite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenSilver(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenStarrite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenStarPlatinum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenSteel(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenStormyx(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenTin(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }

// Industrial Revolution

        if (ModFluids.isMoltenEnrichedNikolite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenElectrum(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenNikolite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMoltenTungsten(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
    }
}