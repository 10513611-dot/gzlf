package net.mcreator.gzlf.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gzlf.entity.ChameleonEntity;
import net.mcreator.gzlf.client.model.Modelchameleon;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ChameleonRenderer extends MobRenderer<ChameleonEntity, LivingEntityRenderState, Modelchameleon> {
	private ChameleonEntity entity = null;

	public ChameleonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchameleon(context.bakeLayer(Modelchameleon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChameleonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("gzlf:textures/entities/chameleon.png");
	}
}