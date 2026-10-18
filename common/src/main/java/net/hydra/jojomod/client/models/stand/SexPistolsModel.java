package net.hydra.jojomod.client.models.stand;// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SexPistolsModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sexpistolsmodel"), "main");
	private final ModelPart Stand;
	private final ModelPart Stand2;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart no1;
	private final ModelPart no2;
	private final ModelPart no3;
	private final ModelPart no5;
	private final ModelPart no6;
	private final ModelPart no7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest_only;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart legs;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public SexPistolsModel(ModelPart root) {
		this.Stand = root.getChild("Stand");
		this.Stand2 = this.Stand.getChild("Stand2");
		this.head = this.Stand2.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.no1 = this.head2.getChild("no1");
		this.no2 = this.head2.getChild("no2");
		this.no3 = this.head2.getChild("no3");
		this.no5 = this.head2.getChild("no5");
		this.no6 = this.head2.getChild("no6");
		this.no7 = this.head2.getChild("no7");
		this.body = this.Stand2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest_only = this.chest.getChild("chest_only");
		this.right_arm = this.chest.getChild("right_arm");
		this.left_arm = this.chest.getChild("left_arm");
		this.legs = this.body.getChild("legs");
		this.left_leg = this.legs.getChild("left_leg");
		this.right_leg = this.legs.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Stand = partdefinition.addOrReplaceChild("Stand", CubeListBuilder.create(), PartPose.offset(0.0F, 14.5F, 0.0F));

		PartDefinition Stand2 = Stand.addOrReplaceChild("Stand2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = Stand2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pointy_r1 = head2.addOrReplaceChild("pointy_r1", CubeListBuilder.create().texOffs(20, 2).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no1 = head2.addOrReplaceChild("no1", CubeListBuilder.create().texOffs(12, 19).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(0, 18).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r1 = no1.addOrReplaceChild("number_r1", CubeListBuilder.create().texOffs(20, 21).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no2 = head2.addOrReplaceChild("no2", CubeListBuilder.create().texOffs(12, 25).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(0, 24).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r2 = no2.addOrReplaceChild("number_r2", CubeListBuilder.create().texOffs(20, 27).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no3 = head2.addOrReplaceChild("no3", CubeListBuilder.create().texOffs(12, 31).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(0, 30).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r3 = no3.addOrReplaceChild("number_r3", CubeListBuilder.create().texOffs(20, 33).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no5 = head2.addOrReplaceChild("no5", CubeListBuilder.create().texOffs(12, 37).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(0, 36).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F))
		.texOffs(26, 40).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r4 = no5.addOrReplaceChild("number_r4", CubeListBuilder.create().texOffs(20, 39).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no6 = head2.addOrReplaceChild("no6", CubeListBuilder.create().texOffs(12, 43).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(0, 42).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r5 = no6.addOrReplaceChild("number_r5", CubeListBuilder.create().texOffs(20, 45).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition no7 = head2.addOrReplaceChild("no7", CubeListBuilder.create().texOffs(40, 40).addBox(-2.0F, -3.5F, 0.225F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 34).mirror().addBox(0.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)).mirror(false)
		.texOffs(36, 34).addBox(-3.25F, -2.25F, -0.475F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, -1.0F, -2.75F));

		PartDefinition number_r6 = no7.addOrReplaceChild("number_r6", CubeListBuilder.create().texOffs(42, 45).addBox(-1.5F, -2.5F, -0.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = Stand2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_only = chest.addOrReplaceChild("chest_only", CubeListBuilder.create().texOffs(0, 11).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.25F))
		.texOffs(14, 11).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 11).addBox(-2.0F, 3.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition left_shoulder_r1 = chest_only.addOrReplaceChild("left_shoulder_r1", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-2.0F, -0.5F, -1.25F, 3.0F, 1.0F, 2.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4F, -1.9F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition right_shoulder_r1 = chest_only.addOrReplaceChild("right_shoulder_r1", CubeListBuilder.create().texOffs(38, 16).addBox(-1.0F, -0.5F, -1.25F, 3.0F, 1.0F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, -1.9F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition right_arm = chest.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(39, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 26).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(-3.0F, -1.0F, 0.0F));

		PartDefinition left_arm = chest.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(39, 26).mirror().addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(3.0F, -1.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(29, 14).mirror().addBox(-1.0F, 0.75F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(29, 22).mirror().addBox(-1.0F, 2.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offset(1.0F, 0.5F, 0.0F));

		PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(29, 14).addBox(-1.0F, 0.75F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.25F))
		.texOffs(29, 22).addBox(-1.0F, 2.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offset(-1.0F, 0.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Stand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}