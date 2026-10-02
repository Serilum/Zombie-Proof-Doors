package com.serilum.zombieproofdoors.forge.events;

import com.serilum.zombieproofdoors.events.ZombieJoinEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeZombieJoinEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		ZombieJoinEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
