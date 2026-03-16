/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.gzlf.client.renderer.ChameleonRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(GzlfModEntities.GZLFHEAD, ThrownItemRenderer::new);
		EntityRendererRegistry.register(GzlfModEntities.CHAMELEON, ChameleonRenderer::new);
	}
}