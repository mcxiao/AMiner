package mhp3.goldfinger.stone;

import mhp3.goldfinger.stone.Stone.Rare;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 */
public class SkillTable {

    private final Rare rare;
    private final Map<Integer, Skill> table;

    public SkillTable(Rare rare, Skill... skills) {
        this.rare = rare;

        Map<Integer, Skill> temp = new HashMap<>();
        if (skills != null) {
            for (Skill skill : skills) {
                if (skill != null) {
                    temp.put(skill.getId(), skill);
                }
            }
        }

        table = Collections.unmodifiableMap(temp);
    }

    public Rare getRare() {
        return rare;
    }

    public boolean hasSkill(Integer id) {
        return table.get(id) != null;
    }

    public Skill getSkill(Integer id) {
        return table.get(id);
    }

}
