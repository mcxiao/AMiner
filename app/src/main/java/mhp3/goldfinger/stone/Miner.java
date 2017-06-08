package mhp3.goldfinger.stone;

import mhp3.goldfinger.stone.Stone.Hole;
import mhp3.goldfinger.utils.GFCodeUtils;

import static mhp3.goldfinger.stone.Stone.*;

/**
 */
public class Miner {

    private Configuration configuration;

    public Miner(Configuration configuration) {
        this.configuration = configuration;
    }

    public String[] getRawStoneCode(int skill1Id, int skill1Value, int skill2Id, int skill2Value, Hole hole, Rare rare) {
        Skill skill1 = SkillMap.getSkill(skill1Id, skill1Value);
        if (skill1 == null) {
            return null;
        }

        Stone stone = configuration.getStoneFactory().generateStone(skill1, hole, rare);
        Skill skill2 = SkillMap.getSkill(skill2Id, skill2Value);
        stone.setSkill2(skill2);

        GFCode code = configuration.getCodeFactory().getGFCode(stone);
        if (code != null) {
            return code.getCodes();
        }
        return null;
    }

    public String[] getFormattedRawStoneCode(int skill1Id, int skill1Value, int skill2Id, int skill2Value, Hole hole, Rare rare) {
        String[] code = getRawStoneCode(skill1Id, skill1Value, skill2Id, skill2Value, hole, rare);
        if (code != null && code.length != 0) {
            String[] result = new String[code.length];
            for (int i = 0; i < result.length; i++) {
                String s = code[i];
                if ((s.length() % 2) > 0) {
                    String formatRawCode = GFCodeUtils.formatRawCode(s);
                    result[i] = formatRawCode;
                }
            }

            return result;
        }

        return null;
    }

    public static final class Configuration {

        private CodeFactory codeFactory;
        private StoneFactory stoneFactory;

        private Configuration() {}

        public CodeFactory getCodeFactory() {
            return codeFactory;
        }

        public StoneFactory getStoneFactory() {
            return stoneFactory;
        }


        public static final class Builder {
            private CodeFactory codeFactory;
            private StoneFactory stoneFactory;

            public Builder setCodeFactory(CodeFactory codeFactory) {
                this.codeFactory = codeFactory;
                return Builder.this;
            }

            public Builder setStoneFactory(StoneFactory stoneFactory) {
                this.stoneFactory = stoneFactory;
                return Builder.this;
            }

            public Configuration build() {
                init();

                Configuration configuration = new Configuration();
                configuration.codeFactory = this.codeFactory;
                configuration.stoneFactory = this.stoneFactory;
                return configuration;
            }

            private void init() {
                codeFactory = codeFactory == null ? new RawGFCodeFactory() : codeFactory;
                stoneFactory = stoneFactory == null ? new DefaultStoneFactory() : stoneFactory;
            }

        }
    }

}
