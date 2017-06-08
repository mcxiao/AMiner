package mhp3.goldfinger.stone.converter;

import mhp3.goldfinger.stone.GFCode;
import mhp3.goldfinger.stone.RawGFCode;
import mhp3.goldfinger.stone.Skill;
import mhp3.goldfinger.stone.Stone;

/**
 */
public class RawGFCodeConverter implements CodeConverter {

    @Override
    public GFCode convert(Stone stone) {
        if (stone == null) {
            return null;
        }

        boolean hasSkill2 = stone.getSkill2() != null;

        // YYZZ = 0xaabbccddeeffgghh
        int yyzz = 0x0;
        Skill skill1 = stone.getSkill1();
        // Skill 1 value = 0xhhaabb
        int skill1Value = skill1.getValue() + 30;
        yyzz |= ((skill1Value & 0x30) >> 4);        // hh
        yyzz |= ((skill1Value & 0xC) << 12);        // aa
        yyzz |= ((skill1Value & 0x3) << 12);        // bb

        if (hasSkill2) {
            // Skill 2 value = 0xeeffgg
            Skill skill2 = stone.getSkill2();
            int skill2Value = skill2.getValue() + 30;
            yyzz |= ((skill2Value & 0x30) << 2);    // ee
            yyzz |= ((skill2Value & 0xC) << 2);     // ff
            yyzz |= ((skill2Value & 0x3) << 2);     // gg
        }

        // Rare value = 0xccdd
        int rare = stone.getRare().getValue();
        yyzz |= ((rare & 0xC) << 8);                // cc
        yyzz |= ((rare & 0x3) << 8);                // dd

        // KKLL = 0xaabbccddefgghhii
        int llkk = 0x0;
        int hole = stone.getHole().getValue();
        llkk |= ((hole & 0x3) << 14);
        int skill1Id = skill1.getId();
        llkk |= ((skill1Id & 0x7F));

        if (hasSkill2) {
            Skill skill2 = stone.getSkill2();
            int skill2Id = skill2.getId();
            llkk |= ((skill2Id & 0x7F) << 7);
        }

        return new RawGFCode(yyzz, llkk);
    }
}
