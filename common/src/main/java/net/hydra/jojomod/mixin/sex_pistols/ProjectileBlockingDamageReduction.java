package net.hydra.jojomod.mixin.sex_pistols;
import net.hydra.jojomod.event.powers.StandUser;
import net.hydra.jojomod.stand.powers.PowersSexPistols;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.hydra.jojomod.event.powers.ModDamageTypes;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Unique;

@Mixin(LivingEntity.class)
public class ProjectileBlockingDamageReduction {
    @Unique
    private float reduceDamageFromProjectiles(float amount, DamageSource source,Player player) {
        // reduces damage for projectile blocking on sex pistols
        if (player instanceof StandUser user && user.roundabout$getStandPowers() instanceof PowersSexPistols pSP){
            if (pSP.isProjectileBlockingActive = false){
                return amount;
            }
            if (source.is(ModDamageTypes.BULLET)) {
            return amount * 0.5f;
        }
        if (source.is(ModDamageTypes.SNIPER_BULLET)) {
            return amount * 0.5f;
        }
        if (source.is(ModDamageTypes.THROWN_OBJECT)) {
            return amount * 0.5f;
        }
        if (source.is(ModDamageTypes.BLADED_BOWLER_HAT)) {
            return amount * 0.5f;
        }
        if (source.is(DamageTypes.ARROW)) {
            return amount * 0.5f;
        }
        if (source.is(DamageTypes.FIREBALL)) {
            return amount * 0.5f;
        }
        if (source.is(DamageTypes.TRIDENT)) {
            return amount * 0.5f;
        }
        if (source.is(DamageTypes.WITHER_SKULL)) {
            return amount * 0.5f;
        }
        if (source.is(DamageTypes.MOB_PROJECTILE)) {
            return amount * 0.5f;
        }
        }
        return amount;
    }
}