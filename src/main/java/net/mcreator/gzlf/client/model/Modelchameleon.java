package net.mcreator.gzlf.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelchameleon extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("gzlf", "modelchameleon"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart tongue;
	public final ModelPart body;
	public final ModelPart tail;
	public final ModelPart lf;
	public final ModelPart rf;
	public final ModelPart lb;
	public final ModelPart rb;

	public Modelchameleon(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.tongue = this.head.getChild("tongue");
		this.body = this.bone.getChild("body");
		this.tail = this.bone.getChild("tail");
		this.lf = this.bone.getChild("lf");
		this.rf = this.bone.getChild("rf");
		this.lb = this.bone.getChild("lb");
		this.rb = this.bone.getChild("rb");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.4286F, 22.6684F, -1.7161F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 13).addBox(-1.5F, -1.5625F, -3.625F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-1.5F, -2.0625F, 0.375F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
						.addBox(-2.5F, -2.0625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 33).addBox(1.5F, -2.0625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.5F, 2.9375F, -3.625F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 23).addBox(1.5F, -3.0625F, 0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 27)
						.addBox(-2.5F, -3.0625F, 0.375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0714F, -2.6059F, -6.6589F));
		PartDefinition tongue = head.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(16, 35).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.4375F, -0.625F));
		PartDefinition body = bone.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-2.0F, -5.0F, -2.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 35)
						.addBox(-1.0F, -5.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 37).addBox(-1.0F, -5.75F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 37)
						.addBox(-1.0F, -5.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 37).addBox(-1.0F, -5.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.4286F, 0.3316F, -2.2839F));
		PartDefinition tail = bone.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(28, 6).addBox(-1.5F, -2.25F, -4.375F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 28).addBox(-1.5F, -1.25F, -2.375F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
						.addBox(-1.5F, -0.25F, -0.375F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-0.5F, 0.75F, 1.625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 21)
						.addBox(0.0F, -4.25F, 2.625F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0714F, -0.4184F, 9.0911F));
		PartDefinition lf = bone.addOrReplaceChild("lf",
				CubeListBuilder.create().texOffs(22, 35).addBox(-0.6667F, -1.4651F, 0.014F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 31).addBox(-1.6667F, 1.0349F, -1.486F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.9048F, 0.7967F, -3.2979F));
		PartDefinition cube_r1 = lf.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 36).addBox(-1.0F, -2.375F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 2.0349F, 2.514F, -0.2618F, 0.0F, 0.0F));
		PartDefinition rf = bone.addOrReplaceChild("rf",
				CubeListBuilder.create().texOffs(0, 36).addBox(-1.3333F, -1.4651F, 0.014F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 21).addBox(-1.3333F, 1.0349F, -1.486F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.7619F, 0.7967F, -3.2979F));
		PartDefinition cube_r2 = rf.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 12).addBox(-1.0F, -2.375F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6667F, 2.0349F, 2.514F, -0.2618F, 0.0F, 0.0F));
		PartDefinition lb = bone.addOrReplaceChild("lb",
				CubeListBuilder.create().texOffs(10, 33).addBox(-2.5F, -2.3387F, -0.6419F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 23).addBox(3.5F, 1.1613F, -1.6419F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0714F, 0.6703F, 3.358F));
		PartDefinition cube_r3 = lb.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 15).addBox(-1.0F, -2.25F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 2.1613F, 2.8581F, -0.2618F, 0.0F, 0.0F));
		PartDefinition rb = bone.addOrReplaceChild("rb",
				CubeListBuilder.create().texOffs(30, 33).addBox(1.5F, -2.3387F, -0.6419F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 25).addBox(-6.5F, 1.1613F, -1.6419F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9286F, 0.6703F, 3.358F));
		PartDefinition cube_r4 = rb.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 18).addBox(-1.0F, -2.25F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 2.1613F, 2.8581F, -0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}