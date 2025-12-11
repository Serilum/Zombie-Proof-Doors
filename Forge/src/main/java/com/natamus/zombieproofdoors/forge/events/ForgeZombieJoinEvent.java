package com.natamus.zombieproofdoors.forge.events;

import com.natamus.zombieproofdoors.events.ZombieJoinEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

public class ForgeZombieJoinEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeZombieJoinEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeZombieJoinEvent::onEntityJoin);
	}

	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		ZombieJoinEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
