package com.natamus.zombieproofdoors.forge.events;

import com.natamus.zombieproofdoors.events.ZombieJoinEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeZombieJoinEvent {
	@SubscribeEvent
	public void onEntityJoin(EntityJoinWorldEvent e) {
		ZombieJoinEvent.onEntityJoin(e.getWorld(), e.getEntity());
	}
}
