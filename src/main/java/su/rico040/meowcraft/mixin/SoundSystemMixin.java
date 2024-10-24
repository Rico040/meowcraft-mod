package su.rico040.meowcraft.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import net.minecraft.client.sound.SoundSystem;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;

@Mixin(SoundSystem.class)
public abstract class SoundSystemMixin {
    @ModifyVariable(method = "play", at = @At("HEAD"), argsOnly = true)
    private SoundInstance modifySound(SoundInstance sound) {
        return PositionedSoundInstance.master(SoundEvents.ENTITY_CAT_AMBIENT, 1.0f, 1.0f);
    }
}

