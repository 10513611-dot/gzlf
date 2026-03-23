// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelqinglong<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "qinglong"), "main");
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart rearleg;
	private final ModelPart rearlegtip2;
	private final ModelPart rearfoot2;
	private final ModelPart rearleg1;
	private final ModelPart rearlegtip1;
	private final ModelPart rearfoot1;
	private final ModelPart frontleg;
	private final ModelPart frontlegtip2;
	private final ModelPart frontfoot2;
	private final ModelPart frontleg1;
	private final ModelPart frontlegtip1;
	private final ModelPart frontfoot1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;

	public Modelqinglong(ModelPart root) {
		this.neck = root.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.rearleg = root.getChild("rearleg");
		this.rearlegtip2 = this.rearleg.getChild("rearlegtip2");
		this.rearfoot2 = this.rearlegtip2.getChild("rearfoot2");
		this.rearleg1 = root.getChild("rearleg1");
		this.rearlegtip1 = this.rearleg1.getChild("rearlegtip1");
		this.rearfoot1 = this.rearlegtip1.getChild("rearfoot1");
		this.frontleg = root.getChild("frontleg");
		this.frontlegtip2 = this.frontleg.getChild("frontlegtip2");
		this.frontfoot2 = this.frontlegtip2.getChild("frontfoot2");
		this.frontleg1 = root.getChild("frontleg1");
		this.frontlegtip1 = this.frontleg1.getChild("frontlegtip1");
		this.frontfoot1 = this.frontlegtip1.getChild("frontfoot1");
		this.tail = root.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck = partdefinition.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -8.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-6.0F, -1.0F, -30.0F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -8.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -12.0F, -10.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-5.0F, -3.0F, -28.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -10.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(3.0F, -3.0F, -28.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 53).addBox(-6.0F, 0.0F, -17.0F, 12.0F, 4.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, -13.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rearleg = partdefinition.addOrReplaceChild("rearleg",
				CubeListBuilder.create().texOffs(50, 64).addBox(18.0F, -4.0F, -8.0F, 7.0F, 13.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.0F, 16.0F, 42.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition rearlegtip2 = rearleg.addOrReplaceChild("rearlegtip2",
				CubeListBuilder.create().texOffs(0, 95).addBox(-7.0F, -20.0F, 2.0F, 5.0F, 17.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.0F, 28.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rearfoot2 = rearlegtip2.addOrReplaceChild("rearfoot2",
				CubeListBuilder.create().texOffs(17, 79).addBox(-9.0F, -22.0F, 15.0F, 9.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rearleg1 = partdefinition.addOrReplaceChild("rearleg1",
				CubeListBuilder.create().texOffs(50, 64).addBox(-8.0F, -4.0F, -8.0F, 7.0F, 13.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.0F, 42.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition rearlegtip1 = rearleg1
				.addOrReplaceChild("rearlegtip1",
						CubeListBuilder.create().texOffs(0, 95).addBox(-7.0F, -20.0F, 2.0F, 5.0F, 17.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 28.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rearfoot1 = rearlegtip1.addOrReplaceChild("rearfoot1",
				CubeListBuilder.create().texOffs(17, 79).addBox(-9.0F, -22.0F, 15.0F, 9.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition frontleg = partdefinition.addOrReplaceChild("frontleg", CubeListBuilder.create(),
				PartPose.offset(-26.0F, 6.0F, -23.0F));

		PartDefinition frontleg1_r1 = frontleg
				.addOrReplaceChild("frontleg1_r1",
						CubeListBuilder.create().texOffs(0, 73).addBox(8.0F, -8.0F, -2.0F, 8.0F, 13.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 4.0F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition frontlegtip2 = frontleg.addOrReplaceChild("frontlegtip2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 20.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition frontlegtip_r1 = frontlegtip2.addOrReplaceChild("frontlegtip_r1",
				CubeListBuilder.create().texOffs(59, 94).addBox(9.0F, 15.0F, -1.0F, 6.0F, 14.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -27.0F, -9.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition frontfoot2 = frontlegtip2
				.addOrReplaceChild("frontfoot2",
						CubeListBuilder.create().texOffs(48, 16).addBox(16.0F, -17.0F, -3.0F, 8.0F, 4.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition frontleg1 = partdefinition.addOrReplaceChild("frontleg1", CubeListBuilder.create(),
				PartPose.offset(10.0F, 5.0F, -23.0F));

		PartDefinition frontleg1_r2 = frontleg1.addOrReplaceChild("frontleg1_r2",
				CubeListBuilder.create().texOffs(0, 73).addBox(8.0F, -8.0F, -2.0F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 4.0F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition frontlegtip1 = frontleg1.addOrReplaceChild("frontlegtip1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition frontlegtip_r2 = frontlegtip1.addOrReplaceChild("frontlegtip_r2",
				CubeListBuilder.create().texOffs(59, 94).addBox(9.0F, 15.0F, -1.0F, 6.0F, 14.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -27.0F, -9.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition frontfoot1 = frontlegtip1
				.addOrReplaceChild("frontfoot1",
						CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, -17.0F, -3.0F, 8.0F, 4.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -8.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2356F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.2705F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.2531F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11",
				CubeListBuilder.create().texOffs(10, 107)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.2705F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12",
				CubeListBuilder.create().texOffs(46, 43).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1833F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rearleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rearleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}