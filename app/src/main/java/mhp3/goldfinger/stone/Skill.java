package mhp3.goldfinger.stone;

/**
 */
public class Skill {

    private final int id;
    private final String name;
    private int value;

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Skill) {
            Skill skill = (Skill) obj;
            return skill.getId() == this.id;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
