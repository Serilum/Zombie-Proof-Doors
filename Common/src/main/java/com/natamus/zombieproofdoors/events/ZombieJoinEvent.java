package com.natamus.zombieproofdoors.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;

public class ZombieJoinEvent {
	public static void onEntityJoin(Level level, Entity entity) {
		if (level.isClientSide) {
			return;
		}

		if (!(entity instanceof Zombie)) {
			return;
		}

		((Zombie)entity).setCanBreakDoors(false);
	}
}
