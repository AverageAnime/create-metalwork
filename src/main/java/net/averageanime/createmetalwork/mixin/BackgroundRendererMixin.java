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

    }

    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void $applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());

// Vanilla Materials

        if (ModFluids.isMoltenIron(state)) {
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
        if (ModFluids.isMoltenNetherite(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }

    }
}