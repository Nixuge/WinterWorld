package me.nixuge.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.WorldView;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Biome.class)
public class BiomeMixin {
	@Redirect(method = "canSetSnow", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldView;getLightLevel(Lnet/minecraft/world/LightType;Lnet/minecraft/util/math/BlockPos;)I"))
	private int canSetSnowoLightLevel(WorldView instance, LightType lightType, BlockPos blockPos) {
		return 0;
	}
}