package net.mcreator.gzlf.network;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.gzlf.procedures.SpittingProcedure;
import net.mcreator.gzlf.GzlfMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public record SpitMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<SpitMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(GzlfMod.MODID, "key_spit"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SpitMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SpitMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new SpitMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SpitMessage> type() {
		return TYPE;
	}

	public static void handleData(final SpitMessage message, final ServerPlayNetworking.Context context) {
		context.server().execute(() -> {
			pressAction(context.player(), message.eventType, message.pressedms);
		});
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			SpittingProcedure.execute(world, x, y, z, entity);
		}
	}
}