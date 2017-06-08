package mhp3.goldfinger.stone;

/**
 */
public class DefaultStoneFactory implements StoneFactory {

    @Override
    public Stone generateStone(Skill firstSkill, Stone.Hole hole, Stone.Rare rare) {
        return new Stone(firstSkill, hole, rare);
    }
}
