# Super Kaizo IronMON Ruleset by [iateyourpie](https://www.twitch.tv/iateyourpie)

Link to [IronMON Discord](https://discord.com/invite/jFPYsZAhjX)

## Contents
- [VERY LARGE DISCLAIMER](#very-large-disclaimer-from-iateyourpie)
- [General Rules for All Games](#general-rules-for-all-games)
- [Game Specific Rules](#game-specific-rules)
- [Smart AI ROM Patches](#smart-ai-rom-patches)
- [Randomizer Settings Strings](#randomizer-settings-strings)
- [Other Resources](#other-resources)

## VERY LARGE DISCLAIMER from iateyourpie

> **"This is not meant for everyone. This is as of now, not an "official" ironmon ruleset. I tried way too hard to make a ruleset that the community wanted with Survival, and that entire process was stressful. I am going about this the same way I went with the original Kaizo. I'm making something I want to make and if others enjoy it so be it.**
> 
> **I'm not really looking for feedback, I'm not really looking to make this more accessible. I'm looking to make an even more challenging version of Kaizo. If you read the rules and say "that sounds like fun" cool! If you read it and say "wow this is awful" cool! I'm just out here trying to find new ways to play my favorite pokemon game!"**

## General Rules for All Games

0. ALL PREVIOUS [Standard, Ultimate, and Kaizo rules](https://gist.github.com/valiant-code/adb18d248fa0fae7da6b639e2ee8f9c1) apply (unless overridden by a Super Kaizo rule below)!
1. Every Trainer has SMART AI, this requires a [ROM patch](#smart-ai-rom-patches)
2. Every Trainer has sensible held items (+ Consumable option for Gen 3 games)
3. Every Gym Leader now has 6 Pokemon
4. You must pivot to a NEW Pokémon about midway through the game, before beating the game:
   - See [Game Specific Rules](#game-specific-rules) for when this must be done, usually after the 4th Gym and/or in the Safari Zone
   - For this pivot, you may catch 3 Pokémon, compare them, then choose 1 to keep
   - This pivot must be your last pivot and it can't be what you were primarily using in the first half of the game
   - If your last pivot evolves into the Pokémon you were running before, that's fine and legal
   - After this pivot, you may reenter each Dungeon 1 additional time
5. All Hidden Items are banned except:
   - Those found in Dungeons/Caves are allowed
   - Those found in the early game, [handled differently per game](#game-specific-rules)
   - ALL Step Items (Mt. Moon, etc) are banned no matter where they are
6. Additional Banned Abilities:
   - Battle Armor / Shell Armor
   - Pickup (can't take/use items)
   - Magic Guard
   - No Guard + using any OHKO move or Sleep move
   - Poison Heal + getting poisoned from wild Pokémon
7. Additional Banned Items when fighting Gym Leaders, Elite 4 or final Trainer battle:
   - X Speed
   - X Attack
   - X Special Attack
8. Additional Banned Moves when fighting Gym Leaders, Elite 4 or final Trainer battle:
   - Any pure setup move, that isn't temporary and doesn't deal damage, such as Swords Dance, Defense Curl, etc.
   - Moves like Rage, Charge Beam, Light Screen, etc. are legal and okay to use
9. Unbanned Moves:
   - Attacking moves with HP draining effects such as Giga Drain are legal
   - Non-attacking moves such as Pain Split, Leech Seed, etc. are still banned
10. Only one HM Friend allowed prior to Mid-game pivot, to prevent unnecessarily scouting moves on all Pokémon
11. No [Legendary](https://www.serebii.net/pokemon/legendary.shtml) favorites

## Game Specific Rules

### Fire Red / Leaf Green

1. Misty's Gym must be completed IMMEDIATELY after getting the Nugget from Nugget Bridge
2. Erika's Gym must be completed before entering Rocket Hideout
3. No fighting trainers in S.S. Anne, except for the Rival to get Cut
4. The first 5 hidden items prior to Mt. Moon are allowed to be picked up
5. **Mid-game Pivot Rules**:
   - The pivot must be done in one of the Safari Zone areas
   - You can leave and come back if you need to check Pokémon moves outside

### Emerald

1. Must beat Mauville Gym before leaving
2. Must beat Fortree Gym as soon as you can when you visit; avoid trainers while getting Devon Scope
3. [work in progress] The 3 hidden items on the beach (Route 104 - South) are allowed to be picked up
4. **Mid-game Pivot Rules**:
   - After Norman, you must do a surf pivot
   - Can't pass water on Route 118 until you do

### Heart Gold / Soul Silver
1. Whitney's Gym must be completed before heading north of Goldenrod City (Route 35+)
2. Morty's Gym must be completed before leaving Ecruteak City
3. The hidden items prior to entering Gym 1 are allowed to be picked up
4. **Mid-game Pivot Rules**:
   - You must pivot after defeating Morty and before fighting Chuck
   - You final pivot must end up LOWER LEVEL than your first/original main Pokémon
   - If you find a favorite while searching for the mid-game pivot, you may catch it without it counting towards your 3 pivot checks
5. Kanto Rules:
   1. Lt. Surge's Gym must be completed before leaving Vermillion City
   2. Must repair Power Plant and upgrade PokéGear ASAP
      - Head directly north towards Cerulean and use Rock Tunnel to complete the quest
      - You may fight trainers only on paths along the way
   3. After that, you cannot leave cities/caves with a Gym until you defeat its Gym (Cerulean City includes routes north of it)
   4. Can't surf on Routes 19-21 until you have 6 Kanto badges
   5. Must defeat Blaine first before exploring the rest of Seafoam Islands

## Smart AI ROM Patches

Apply patches using this website: [RomPatcher JS](https://www.marcrobledo.com/RomPatcher.js/)

- FireRed / Leaf Green: [Download](https://github.com/tom-overton/pokefirered/releases/tag/smart-ai-v2)
- Emerald: [Download](https://github.com/CyanSMP64/Emerald_Smart_AI/releases/tag/smart-ai)
- Heart Gold:
   - Limiter + BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1Limiter.xdelta)
   - Limiter + No BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1LimiterNoBGM.xdelta)
   - No Limiter + BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1NoLimiter.xdelta)
   - No Limiter + No BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1NoLimiterNoBGM.xdelta)

**Limiter**: The game plays at the original framerate; **No Limiter**: Game plays more smoothly and feels faster; **BGM**: No changes to music from original game; **NO BGM**: Changes the behavior of the GB Sounds item to remove the background music

### Smart AI Randomizer

There is a dedicated randomizer for adding smart AI to trainers without a patch. It works for any generation 3-5 game, however if you would like to use the old randomizer version (4.4.1) for playing generation 4 without extra berries you will need to use that with a patch.

[Download here](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/tag/smart-ai-v1)

## Randomizer Settings Strings

- Look for "Super Kaizo" for your game in [Official IronMON Settings Strings](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621)

## Other Resources

### Ironmon Trackers

- GBA Tracker (Gen 3: FRLG / Emerald): [Download](https://github.com/besteon/Ironmon-Tracker/releases/latest)
- NDS Tracker (Gen 4-5: HGSS): [Download](https://github.com/Brian0255/NDS-Ironmon-Tracker)

### Original Rules Links

- Fire Red / Leaf Green rules [Pastebin](https://pastebin.com/nWAXrPEE)
- Heart Gold rules [Gist](https://gist.github.com/piebandit/b58c02bad84f4ba9ac81c229f8f712bc) with pivoting info

### Tracking Spreadsheets

- FRLG: [Safari Zone Tracking Sheet Template: MAKE A COPY](https://docs.google.com/spreadsheets/d/1EB4Y5xmKmbUu9lzz9BTR0sJpp0wfUtNM4rF60aOtHtU)
