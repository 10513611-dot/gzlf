package net.mcreator.gzlf.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.SalmonRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SalmonModel;

import net.mcreator.gzlf.entity.ShuijiaoEntity;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.mojang.blaze3d.vertex.PoseStack;

@Environment(EnvType.CLIENT)
public class ShuijiaoRenderer extends MobRenderer<ShuijiaoEntity, SalmonRenderState, SalmonModel> {
	private ShuijiaoEntity entity = null;

	public ShuijiaoRenderer(EntityRendererProvider.Context context) {
		super(context, new SalmonModel(context.bakeLayer(ModelLayers.SALMON)), 0.5f);
	}

	@Override
	public SalmonRenderState createRenderState() {
		return new SalmonRenderState();
	}

	@Override
	public void extractRenderState(ShuijiaoEntity entity, SalmonRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(SalmonRenderState state) {
		return ResourceLocation.parse("gzlf:textures/entities/salmon.png");
	}
}