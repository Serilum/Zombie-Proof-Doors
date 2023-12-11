package com.natamus.zombieproofdoors.neoforge.events;

import com.natamus.zombieproofdoors.events.ZombieJoinEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeZombieJoinEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		ZombieJoinEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
