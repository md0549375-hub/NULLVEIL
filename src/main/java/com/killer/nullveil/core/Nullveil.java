package com.killer.nullveil.core;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here must match the modId declared in META-INF/neoforge.mods.toml
@Mod(Nullveil.MODID)
public class Nullveil {
    public static final String MODID = "nullveil";
    public static final Logger LOGGER = LogUtils.getLogger();

    // FML recognizes IEventBus/ModContainer parameter types and injects them automatically.
    public Nullveil(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.COMMON, NullveilConfig.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("NULLVEIL core initialized -- V0.1 Foundation online.");
    }
}
