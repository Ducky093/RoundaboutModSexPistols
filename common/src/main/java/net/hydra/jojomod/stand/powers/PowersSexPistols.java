package net.hydra.jojomod.stand.powers;

import net.hydra.jojomod.access.IPlayerEntity;
import net.hydra.jojomod.client.ClientUtil;
import net.hydra.jojomod.client.StandIcons;
import net.hydra.jojomod.event.index.PowerIndex;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.item.*;
import net.hydra.jojomod.sound.ModSounds;
import net.hydra.jojomod.stand.powers.elements.PowerContext;
import net.hydra.jojomod.stand.powers.presets.NewDashPreset;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static net.hydra.jojomod.event.index.PowerIndex.*;

public class PowersSexPistols extends NewDashPreset {

    public boolean isProjectileBlockingActive = false;
    public PowersSexPistols(LivingEntity self) {
        super(self);
    }

    @Override
    public StandPowers generateStandPowers(LivingEntity entity) {
        return new PowersSexPistols(entity);
    }

    @Override
    public boolean isWip(){return true;}
    public Component ifWipListDevStatus(){
        return Component.translatable(  "roundabout.dev_status.active").withStyle(ChatFormatting.WHITE);
    }
    @Override
    public Component ifWipListDev(){
        return Component.literal(  "a duck").withStyle(ChatFormatting.WHITE);
    }
 //   @Override
   // public StandEntity getNewStandEntity() {
    //    return ModEntities.SEXPISTOL.create(this.getSelf().level());
   // }
    public boolean isHoldingGun(ItemStack itemStack){
        if (itemStack.is(ModItems.JACKAL_RIFLE)
                    || itemStack.is(ModItems.TOMMY_GUN)
                    || itemStack.is(ModItems.SNUBNOSE_REVOLVER)
                    || itemStack.is(ModItems.COLT_REVOLVER));{return true;}

    }




    @Override
    public void powerActivate(PowerContext context) {
        switch (context)
        {
            case SKILL_1_NORMAL -> {
                if (this.getSelf() instanceof Player P) {
                    IPlayerEntity IPE = (IPlayerEntity) P;
                    if ((isHoldingGun(IPE.roundabout$getForRealMainHand())))
                    allSexpistolsonebulletClient();
              }
               itemSendClient();
            }
            case SKILL_1_CROUCH -> {
         //       itemKickClient();
            }
            case SKILL_2_NORMAL-> {
                targetSelect();
            }
            case SKILL_2_CROUCH-> {
          //      sexPistolItemGrabClient();
            }
            case SKILL_3_NORMAL -> {
                dash();
            }
            case SKILL_3_CROUCH -> {
                projectileBlockingToggle();
            }
            case SKILL_4_NORMAL -> {
         //   feedSexPistolsClient();
            }
            case SKILL_4_CROUCH -> {
               reconClient();
            }
           }
        }


    private void targetSelect() {

    }
    private void projectileBlockingToggle(){
        isProjectileBlockingActive = !isProjectileBlockingActive;
    }

    @Override
    public boolean setPowerOther(int move, int lastMove) {
        switch (move) {
          /*  case PowerIndex.POWER_1 -> {
                return itemSend();
            }
            case PowerIndex.POWER_1_CROUCH -> {
                return itemKick();
            }
            case PowerIndex.POWER_4 -> {
                return feedSexPistols();
            }  */
            case POWER_4_SNEAK -> {
             //  return recon();
            }
        }
        return super.setPowerOther(move,lastMove);
 }
   public void reconClient() {
        if (!onCooldown(PowerIndex.SKILL_4_SNEAK)) {
            this.setCooldown(PowerIndex.SKILL_4_SNEAK, 20);

            tryPower(POWER_4_SNEAK);
            tryPowerPacket(POWER_4_SNEAK);
        }
    }
    public void itemSendClient(){

    }
    public void allSexpistolsonebulletClient(){

    }
   /* public boolean recon() {
        public void toggleControlModeClient() {
            if (isPiloting()) {
                if (this.self instanceof Player PE) {
                    IPlayerEntity ipe = ((IPlayerEntity) PE);
                    ipe.roundabout$setIsControlling(0);
                }
                this.setSomeTicks(5);
                tryIntToServerPacket(PacketDataIndex.INT_UPDATE_PILOT, 0);
            } else {
                StandEntity entity = this.getStandEntity(this.self);
                int L = 0;
                if (entity != null) {
                    L = entity.getId();
                }
                tryIntToServerPacket(PacketDataIndex.INT_UPDATE_PILOT, L);
            }
            this.setCooldown(PowerIndex.SKILL_4, 20);
        }
    }*/


@Override
    public boolean isSecondaryStand(){
        return true;
    }
    public void renderIcons(GuiGraphics context, int x, int y) {
        // code for advanced icons
        if (this.getSelf() instanceof Player P) {
            IPlayerEntity IPE = (IPlayerEntity) P;
      if ( (isHoldingGun(IPE.roundabout$getForRealMainHand())))
         setSkillIcon(context, x, y, 1, StandIcons.SEX_PISTOLS_BULLET_RIDE, PowerIndex.SKILL_1);
         if (isHoldingSneak())
            setSkillIcon(context, x, y, 1, StandIcons.SEX_PISTOLS_ITEM_KICK, PowerIndex.SKILL_1);
        else
            setSkillIcon(context, x, y, 1, StandIcons.SEX_PISTOLS_ITEM_SEND, PowerIndex.SKILL_1);
            setSkillIcon(context, x, y, 2, StandIcons.SEX_PISTOLS_TARGET, PowerIndex.SKILL_2);
            setSkillIcon(context, x, y, 3, StandIcons.DODGE, PowerIndex.GLOBAL_DASH);
       /* if (isHoldingSneak())
            setSkillIcon(context, x, y, 4, StandIcons.RECON, PowerIndex.SKILL_4);
        else
            setSkillIcon(context, x, y, 4, StandIcons.FEED_SEX_PISTOLS, PowerIndex.SKILL_4); */
        super.renderIcons(context, x, y);
    }
}
}
