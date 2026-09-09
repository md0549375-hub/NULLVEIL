package com.killer.nullveil.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import com.killer.nullveil.core.Nullveil;

// This class will not load on dedicated servers. Client-only setup goes here.
@Mod(value = Nullveil.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Nullveil.MODID, value = Dist.CLIENT)
public class NullveilClient {
    public NullveilClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        Nullveil.LOGGER.info("NULLVEIL client setup complete.");
    }
}
