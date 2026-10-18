package net.hydra.jojomod.entity.stand;

import net.hydra.jojomod.access.IPlayerEntity;
import net.hydra.jojomod.item.MaxStandDiscItem;
import net.hydra.jojomod.stand.powers.PowersTusk;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class SexPistolsEntity extends FollowingStandEntity {

    public SexPistolsEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world);
    }
    public boolean canSummonStandAsEntity() {
        return true;
         }
}
