// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbaigujing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baigujing"), "main");
	private final ModelPart waist;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart crown;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart leftItem;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelbaigujing(ModelPart root) {
		this.waist = root.getChild("waist");
		this.Body = this.waist.getChild("Body");
		this.Head = root.getChild("Head");
		this.crown = this.Head.getChild("crown");
		this.bone = this.crown.getChild("bone");
		this.bone2 = this.crown.getChild("bone2");
		this.bone3 = this.crown.getChild("bone3");
		this.bone4 = this.crown.getChild("bone4");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.leftItem = this.LeftArm.getChild("leftItem");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition waist = partdefinition.addOrReplaceChild("waist", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition Body = waist.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F,
				0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition crown = Head.addOrReplaceChild("crown",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-3.0F, -0.0833F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
						.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.9167F, 0.0F));

		PartDefinition cube_r1 = crown.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(59, 19).addBox(1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = crown
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(59, 19).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r3 = crown
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(59, 19).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = crown.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(40, 22).addBox(-4.5F, -7.0F, -1.5F, 7.0F, 7.0F, 2.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = crown.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(2, 1)
						.addBox(-0.5F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-1.0F, -3.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(2.5F, -0.3333F, -2.5F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition bone2 = crown.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(2, 1)
						.addBox(-0.5F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-1.0F, -3.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(2.5F, -0.3333F, 2.5F, -0.1309F, 0.0F, 0.1309F));

		PartDefinition bone3 = crown.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(2, 1)
						.addBox(-0.5F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-1.0F, -3.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-2.5F, -0.3333F, -2.5F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition bone4 = crown.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(2, 1)
						.addBox(-0.5F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-1.0F, -3.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-2.5F, -0.3333F, 2.5F, -0.1309F, 0.0F, -0.1309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 0)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(50, 0).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition leftItem = LeftArm.addOrReplaceChild("leftItem", CubeListBuilder.create(),
				PartPose.offset(1.0F, 7.0F, 1.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}