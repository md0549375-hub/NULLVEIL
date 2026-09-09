package com.killer.nullveil.core;

import net.neoforged.neoforge.common.ModConfigSpec;

/**
 * Central configuration for NULLVEIL's internal systems. New options will be added
 * here as World Stability, the Event Director, and Echo's state machine come online
 * in later development phases.
 */
public class NullveilConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue DEBUG_LOGGING = BUILDER
            .comment("Enables verbose debug logging for NULLVEIL's internal systems as they come online.")
            .define("debugLogging", false);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
