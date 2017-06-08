package mhp3.goldfinger.stone;

/**
 */
public class Stone {

    public enum Hole {
        Null(0),
        One(1),
        Two(2),
        Three(3);


        private int value;

        Hole(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Rare {
        One(0),
        Two(1),
        Three(2),
        Four(3),
        Five(4),
        Six(5),
        Seven(6);

        private int value;

        Rare(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private final Skill skill1;
    private Skill skill2;
    private final Hole hole;
    private final Rare rare;

    public Stone(Skill skill1, Hole hole, Rare rare) {
        this.skill1 = skill1;
        this.hole = hole;
        this.rare = rare;
    }

    public Skill getSkill1() {
        return skill1;
    }

    public Skill getSkill2() {
        return skill2;
    }

    public void setSkill2(Skill skill2) {
        this.skill2 = skill2;
    }

    public Hole getHole() {
        return hole;
    }

    public Rare getRare() {
        return rare;
    }

}
