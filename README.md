# NULLVEIL

A Minecraft Bedrock Edition psychological-horror add-on.

> "You are not afraid of what is there. You are afraid that what you know is wrong."

## Status

**V0.1 -- Foundation.** BP/RP manifests linked, CI validates JSON and packages a `.mcaddon` on every push. No entities yet.

## Target

- Minecraft: Bedrock 1.26.45+
- Format: manifest format_version 2 (stable)

## Structure

- `BP/` -- Behavior Pack
- `RP/` -- Resource Pack

## Build

CI validates all JSON and packages `NULLVEIL.mcaddon` as a downloadable artifact on every push (`.github/workflows/validate.yml`). No local build step is required -- install the packaged `.mcaddon` directly on Android.
