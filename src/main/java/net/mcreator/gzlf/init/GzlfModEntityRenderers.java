/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.gzlf.client.renderer.*;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(GzlfModEntities.GZLFHEAD, ThrownItemRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.CHAMELEON, ChameleonRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.SHUIJIAO, ShuijiaoRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.QINGLONG, QinglongRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.GOOSE, GooseRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.CAMBRIANFISH, CambrianfishRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.BAIGUJING, BaigujingRenderer::new);
	}
}