/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.mcreator.gzlf.client.model.Modelchameleon;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModModels {
	public static void clientLoad() {
		EntityModelLayerRegistry.registerModelLayer(Modelchameleon.LAYER_LOCATION, Modelchameleon::createBodyLayer);
	}
}