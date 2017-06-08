package mhp3.goldfinger.stone;

import mhp3.goldfinger.stone.Stone.Hole;
import mhp3.goldfinger.stone.Stone.Rare;

/**
 */
public interface StoneFactory {

    Stone generateStone(Skill firstSkill, Hole hole, Rare rare);

}
