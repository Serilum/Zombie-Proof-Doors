package com.natamus.zombieproofdoors;

import com.natamus.collective.check.RegisterMod;
import com.natamus.zombieproofdoors.forge.events.ForgeZombieJoinEvent;
import com.natamus.zombieproofdoors.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class ModForge {
	
	public ModForge() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::loadComplete);

		setGlobalConstants();
		ModCommon.init();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadComplete(final FMLLoadCompleteEvent event) {
   		MinecraftForge.EVENT_BUS.register(new ForgeZombieJoinEvent());
	}

	private static void setGlobalConstants() {

	}
}