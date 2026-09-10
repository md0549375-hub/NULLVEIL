# NULLVEIL

A Minecraft Bedrock Edition psychological-horror add-on.

> "You are not afraid of what is there. You are afraid that what you know is wrong."

## Status

**V0.2 -- Echo.** Echo entity is in-world: hovers, hidden-when-invisible, gentle idle bob + pulsing core animation, alpha-blended obsidian shell over a cyan core. No Fear/Corrupted states, no player-bonding, no voice yet -- those follow in V0.3.

## Target

- Minecraft: Bedrock 1.26.45+
- Format: manifest format_version 2 (stable)

## Structure

- `BP/` -- Behavior Pack
- `RP/` -- Resource Pack

## Build

CI validates all JSON and packages `NULLVEIL.mcaddon` as a downloadable artifact on every push (`.github/workflows/validate.yml`). No local build step is required -- install the packaged `.mcaddon` directly on Android.

## Testing Echo

`/summon nullveil:echo` in a world with cheats on, or find the Echo spawn egg in the creative inventory.
