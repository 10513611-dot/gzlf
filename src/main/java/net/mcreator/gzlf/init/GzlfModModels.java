/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.mcreator.gzlf.client.model.*;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModModels {
	public static void clientLoad() {
		EntityModelLayerRegistry.registerModelLayer(Modelqinglong.LAYER_LOCATION, Modelqinglong::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelbaigujing1.LAYER_LOCATION, Modelbaigujing1::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelbaigujing.LAYER_LOCATION, Modelbaigujing::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelchameleon.LAYER_LOCATION, Modelchameleon::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelbaigujing2.LAYER_LOCATION, Modelbaigujing2::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelgoose.LAYER_LOCATION, Modelgoose::createBodyLayer);
	}
}