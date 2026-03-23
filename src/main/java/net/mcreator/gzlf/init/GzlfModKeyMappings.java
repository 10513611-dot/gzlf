/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.gzlf.init;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.gzlf.network.SpitMessage;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GzlfModKeyMappings {
	public static final KeyMapping SPIT = new KeyMapping("key.gzlf.spit", GLFW.GLFW_KEY_P, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPlayNetworking.send(new SpitMessage(0, 0));
				SpitMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	public static void clientLoad() {
		KeyBindingHelper.registerKeyBinding(SPIT);
		ClientTickEvents.END_CLIENT_TICK.register((client) -> {
			if (client.screen == null) {
				SPIT.consumeClick();
			}
		});
	}
}