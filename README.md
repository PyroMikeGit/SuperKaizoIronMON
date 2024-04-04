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
1. Every Trainer has **SMART AI**, this requires a [ROM patch](#smart-ai-rom-patches)
2. Every Trainer has Sensible held items (For Gen 3 games: include Consumable only)
3. Every Gym Leader now has 6 Pokemon
4. You must pivot to a NEW Pokémon about midway through the game, before beating the game:
   - See [Game Specific Rules](#game-specific-rules) for when this must be done, usually after the 4th Gym and/or in the Safari Zone
   - Only Pokémon that have defeated a Gym Leader can enter the Safari Zone, or otherwise be used for Mid-game pivoting
   - For this "pivot", you may catch 3 Pokémon and compare them. You may level, evo, or teach TMs to any of the 3. You must eventually settle on using ONE of them.
   - You may catch an additional 4th Pokémon if it's one of your starter favorites.
   - Once you settle on a pivot:
      - It must be different than any Pokémon you were running before; if it later evolves into one of those Pokémon, that's OK
      - You may reenter each Dungeon one additional time
      - **You must beat the game with this new Pokémon**
5. All Hidden Items are banned except:
   - Those found in Dungeons/Caves are allowed
   - Those found in the early game, [cut-off points vary for each game](#game-specific-rules)
   - ALL Step Items (Mt. Moon, etc) are banned no matter where they are
6. Additional Banned Abilities:
   - **Battle Armor** / **Shell Armor**
   - **Pickup** is okay except you can't use items from it (toss them)
   - **Magic Guard**
   - **No Guard** is okay but you can't use any OHKO move or Sleep move
   - **Poison Heal** is okay but you can't purposefully get poisoned from wild Pokémon
7. Additional Banned Items when fighting Gym Leaders, Elite 4 or final Trainer battle:
   - **X Speed**
   - **X Attack**
   - **X Special Attack**
8. Additional Banned Moves when fighting Gym Leaders, Elite 4 or final Trainer battle:
   - Any pure setup move, that isn't temporary and doesn't deal damage, such as Swords Dance, Defense Curl, etc.
   - Moves like Rage, Charge Beam, Light Screen, etc. are legal and okay to use
9. Unbanned Moves:
   - Attacking moves with HP draining effects such as Giga Drain are legal; you can't exploit healing off of wild Pokémon.
   - Non-attacking moves such as Pain Split, Leech Seed, etc. are still banned
10. Only one HM Friend allowed prior to Mid-game pivot, to prevent unnecessarily scouting moves on all Pokémon
11. No [Legendary](https://www.serebii.net/pokemon/legendary.shtml) favorites

## Game Specific Rules

### Fire Red / Leaf Green

0. All other [FRLG specific Kaizo rules](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621#fire-red--leaf-green) apply, unless changed below
1. The hidden items prior to entering Mt. Moon are allowed to be picked up
2. Misty's Gym must be completed IMMEDIATELY after getting the Nugget from Nugget Bridge
3. Erika's Gym must be completed before entering Rocket Hideout
4. No fighting trainers in S.S. Anne, except for the Rival to get Cut
5. **Mid-game Pivot Rules**:
   - The pivot must be done in one of the Safari Zone areas
   - You can leave and come back if you need to check Pokémon moves outside

### Emerald

**ROM Setup:** Apply the [Smart AI patch](#smart-ai-rom-patches) first, then do the normal 60% level scaling as with regular Kaizo. Read how to do this [here](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621#ruby--sapphire--emerald).

0. All other [Emerald specific Kaizo rules](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621#ruby--sapphire--emerald) apply, unless changed below
1. The hidden items prior to entering Gym 1 are allowed to be picked up
2. Seashore House (soda shack) is banned
3. Trick House is banned until after you mid-game pivot (Safari)
4. **Mid-game Pivot Rules**:
   - **NOTE: These are still a work in progress. An alternative is to force a pivot before surfing east of Route 118.**
   - [Lilycove Safari Zone](https://bulbapedia.bulbagarden.net/wiki/Hoenn_Safari_Zone) is the dedicated pivot area of the game
   - Same rules apply here as in Fire Red / Leaf Green
   - Use of Pokeblocks is banned

### Heart Gold / Soul Silver

> **NOTE: These pivot rules and areas are still being worked on.**
> 
> Expect a ROM patch update in the near future, such that the mid-game pivot will be entirely contained within the Bug Catching Contest and all other areas / surf encounters are ineligble.

0. All other [HGSS specific Kaizo rules](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621#heart-gold--soul-silver) apply, unless changed below
1. The hidden items prior to entering Gym 1 are allowed to be picked up
2. Whitney's Gym must be completed before heading north of Goldenrod City (Route 35+)
3. Morty's Gym must be completed before leaving Ecruteak City
4. You must turn off Rocket Hideout alarms after the first alarm
5. **Mid-game Pivot Rules**:
   - You must pivot after defeating Morty and before fighting Chuck
   - Bug Catching Contest is banned
   - You final pivot must end up LOWER LEVEL than your first/original main Pokémon
   - **Warning**: Save your game frequently while searching for a pivot. The rom patch may soft-lock your game if you encounter a roamer. Load your save or use Tracker's Restore Points.
6. Kanto Rules:
   1. Lt. Surge's Gym must be completed before leaving Vermillion City
   2. Must repair Power Plant and upgrade Poké Gear ASAP
      - Head directly north towards Cerulean and use Rock Tunnel to complete the quest
      - You may fight trainers only on paths along the way
   3. After that, you cannot leave cities/caves with a Gym until you defeat its Gym (Cerulean City includes routes north of it)
   4. Can't surf on Routes 19-21 until you have 6 Kanto badges
   5. Must defeat Blaine first before exploring the rest of Seafoam Islands
   6. Must fight Red with hail weather active
      - Diamond dust, instead of hail, appears on [special days](https://bulbapedia.bulbagarden.net/wiki/Easter_egg#Diamond_dust), such as January 1st 
      - On Bizhawk: This requires [changing the initial time/clock](#change-bizhawks-timeclock) of the emulator

### Platinum

0. All other [Platinum specific Kaizo rules](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621#diamond--pearl--platinum) apply, unless changed below
1. The hidden items prior to entering Gym 1 are allowed to be picked up
2. You must complete Veilstone Gym after arriving for the first time, before heading south of the city
3. **Mid-game Pivot Rules**:
   - You must pivot to a new mon at the Great Marsh when you first get to Pastoria City
   - You can leave and come back if you need to check Pokémon moves outside

## Smart AI ROM Patches

Apply patches using this website: [RomPatcher JS](https://www.marcrobledo.com/RomPatcher.js/)

- FireRed / Leaf Green: [Download](https://github.com/tom-overton/pokefirered/releases/tag/smart-ai-v2)
- Emerald: [Download](https://github.com/CyanSMP64/Emerald_Smart_AI/releases/tag/smart-ai)
- Heart Gold:
   - Limiter + BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1Limiter.xdelta)
   - Limiter + No BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1LimiterNoBGM.xdelta)
   - No Limiter + BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1NoLimiter.xdelta)
   - No Limiter + No BGM: [Download](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/download/v0.0.1/SuperKaizoHGPyroIronMONV0.0.1NoLimiterNoBGM.xdelta)
- Platinum:
   - Use the randomizer below

**Limiter**: The game plays at the original framerate; **No Limiter**: Game plays more smoothly and feels faster; **BGM**: No changes to music from original game; **NO BGM**: Changes the behavior of the GB Sounds item to remove the background music

### Smart AI Randomizer

There is a dedicated randomizer for adding smart AI to trainers without a patch. It works for any generation 3+ game, however if you would like to use the old randomizer version (4.4.0) for playing generation 4 without extra berries you will need to use that with a patch.

[Download here](https://github.com/PyroMikeGit/SuperKaizoIronMON/releases/tag/smart-ai-v2)

## Randomizer Settings Strings

- Look for "Super Kaizo" for your game in [Official IronMON Settings Strings](https://gist.github.com/UTDZac/a147c497424dfbd537d8c4b0c22b5621)

## Other Resources

### Ironmon Trackers

- GBA Tracker (Gen 3: FRLG / Emerald): [Download](https://github.com/besteon/Ironmon-Tracker/releases/latest)
- NDS Tracker (Gen 4-5: HGSS / Platinum): [Download](https://github.com/Brian0255/NDS-Ironmon-Tracker)

### Original Rules Links

- Fire Red / Leaf Green rules [Pastebin](https://pastebin.com/nWAXrPEE)
- Heart Gold rules [Gist](https://gist.github.com/piebandit/b58c02bad84f4ba9ac81c229f8f712bc) with pivoting info

### Tracking Spreadsheets

- FRLG: [Safari Zone Tracking Sheet Template: MAKE A COPY](https://docs.google.com/spreadsheets/d/1EB4Y5xmKmbUu9lzz9BTR0sJpp0wfUtNM4rF60aOtHtU)

### Change Bizhawk's Time/Clock
   1. From the Bizhawk menu, click **NDS** > **Settings** > **Sync Settings**
   2. Double-click the **Initial Time** value on the right and change it to **Tuesday, January 5th**, click OK
   3. Next, save your game using the in-game save feature (you CANNOT use save-states for this next part)
   4. When the save fully completes, flush the save: Bizhawk menu > **File** > **Save RAM** > **Flush Save RAM**
   5. Finally, restart your game using **Emulation** > **Restart**
   6. When the game starts up and you get past the Title Screen, press 'Continue' to load the save
   7. You may have to go to a new area or zone for the time change to occur and the weather to change

![image](https://github.com/PyroMikeGit/SuperKaizoIronMON/assets/4258818/8293d6cd-df4e-4034-867a-3c9d77c5fefe)
