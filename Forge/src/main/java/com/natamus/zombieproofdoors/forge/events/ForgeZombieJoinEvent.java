package com.natamus.zombieproofdoors.forge.events;

import com.natamus.zombieproofdoors.events.ZombieJoinEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeZombieJoinEvent {
	@SubscribeEvent
	public void onEntityJoin(EntityJoinLevelEvent e) {
		ZombieJoinEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
