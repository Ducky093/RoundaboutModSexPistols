package net.hydra.jojomod.client.models.stand.renderers;

import net.hydra.jojomod.Roundabout;
import net.hydra.jojomod.client.models.layers.ModEntityRendererClient;

import net.hydra.jojomod.client.models.stand.SexPistolsModel;
import net.hydra.jojomod.client.models.stand.TuskAct4Model;
import net.hydra.jojomod.entity.stand.SexPistolsEntity;
import net.hydra.jojomod.stand.powers.PowersSexPistols;
import net.hydra.jojomod.stand.powers.PowersTusk;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class SexPistolsRenderer extends StandRenderer<SexPistolsEntity> {
    public SexPistolsRenderer(EntityRendererProvider.Context context) {
        super(context, new net.hydra.jojomod.client.models.stand.StandModel<>(context.bakeLayer(ModEntityRendererClient.SEX_PISTOLS_LAYER)), 0f);
    }
    @Override
    public ResourceLocation getTextureLocation(SexPistolsEntity entity) {return PowersSexPistols.getSkin(entity.getSkin());}
}
