package com.natamus.zombieproofdoors;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.check.ShouldLoadCheck;
import com.natamus.zombieproofdoors.events.ZombieJoinEvent;
import com.natamus.zombieproofdoors.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		ServerEntityEvents.ENTITY_LOAD.register((Entity entity, ServerLevel world) -> {
			ZombieJoinEvent.onEntityJoin(world, entity);
		});
	}

	private static void setGlobalConstants() {

	}
}
