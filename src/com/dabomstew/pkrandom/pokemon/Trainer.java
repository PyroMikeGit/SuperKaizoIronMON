package com.dabomstew.pkrandom.pokemon;

/*----------------------------------------------------------------------------*/
/*--  Trainer.java - represents a Trainer's pokemon set/other details.      --*/
/*--                                                                        --*/
/*--  Part of "Universal Pokemon Randomizer ZX" by the UPR-ZX team          --*/
/*--  Originally part of "Universal Pokemon Randomizer" by Dabomstew        --*/
/*--  Pokemon and any associated names and the like are                     --*/
/*--  trademark and (C) Nintendo 1996-2020.                                 --*/
/*--                                                                        --*/
/*--  The custom code written here is licensed under the terms of the GPL:  --*/
/*--                                                                        --*/
/*--  This program is free software: you can redistribute it and/or modify  --*/
/*--  it under the terms of the GNU General Public License as published by  --*/
/*--  the Free Software Foundation, either version 3 of the License, or     --*/
/*--  (at your option) any later version.                                   --*/
/*--                                                                        --*/
/*--  This program is distributed in the hope that it will be useful,       --*/
/*--  but WITHOUT ANY WARRANTY; without even the implied warranty of        --*/
/*--  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the          --*/
/*--  GNU General Public License for more details.                          --*/
/*--                                                                        --*/
/*--  You should have received a copy of the GNU General Public License     --*/
/*--  along with this program. If not, see <http://www.gnu.org/licenses/>.  --*/
/*----------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Comparable<Trainer> {
    public int offset;
    public List<TrainerPokemon> pokemon = new ArrayList<>();
    public String tag;
    public boolean importantTrainer;
    // This value has some flags about the trainer's pokemon (e.g. if they have items or custom moves)
    public int poketype;
    public String name;
    public int trainerclass;
    public String fullDisplayName;
    public MultiBattleStatus multiBattleStatus = MultiBattleStatus.NEVER;
    public int forceStarterPosition = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (fullDisplayName != null) {
            sb.append(fullDisplayName).append(" ");
        } else if (name != null) {
            sb.append(name).append(" ");
        }
        if (trainerclass != 0) {
            sb.append("(").append(trainerclass).append(") - ");
        }
        sb.append(String.format("%x", offset));
        sb.append(" => ");
        boolean first = true;
        for (TrainerPokemon p : pokemon) {
            if (!first) {
                sb.append(',');
            }
            sb.append(p.pokemon.name).append(" Lv").append(p.level);
            first = false;
        }
        sb.append(']');
        if (tag != null) {
            sb.append(" (").append(tag).append(")");
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + offset;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trainer other = (Trainer) obj;
        return offset == other.offset;
    }

    @Override
    public int compareTo(Trainer o) {
        return offset - o.offset;
    }

    public boolean isBoss() {
        return tag != null && (tag.startsWith("ELITE") || tag.startsWith("CHAMPION")
                || tag.startsWith("UBER") || tag.endsWith("LEADER"));
    }

    public boolean isImportant() {
        return tag != null && (tag.startsWith("RIVAL") || tag.startsWith("FRIEND") || tag.endsWith("STRONG"));
    }

    public boolean skipImportant() {
        return ((tag != null) && (tag.startsWith("RIVAL1-") || tag.startsWith("FRIEND1-") || tag.endsWith("NOTSTRONG")));
    }

    public void setPokemonHaveItems(boolean haveItems) {
        if (haveItems) {
            this.poketype |= 2;
        } else {
            // https://stackoverflow.com/a/1073328
            this.poketype = poketype & ~2;
        }
    }

    public boolean pokemonHaveItems() {
        // This flag seems consistent for all gens
        return (this.poketype & 2) == 2;
    }

    public boolean pokemonHaveCustomMoves() {
        // This flag seems consistent for all gens
        return (this.poketype & 1) == 1;
    }

    public enum MultiBattleStatus {
        NEVER, POTENTIAL, ALWAYS
    }
}
