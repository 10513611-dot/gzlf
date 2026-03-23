/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gzlf.init;

import net.mcreator.gzlf.network.SpitMessage;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class GzlfModKeyMappingsServer {
	public static void serverLoad() {
		PayloadTypeRegistry.playC2S().register(SpitMessage.TYPE, SpitMessage.STREAM_CODEC);
		ServerPlayNetworking.registerGlobalReceiver(SpitMessage.TYPE, SpitMessage::handleData);
	}
}