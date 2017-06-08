package mhp3.goldfinger.stone;

import mhp3.goldfinger.utils.GFCodeUtils;

/**
 */
public class FormattedGFCode extends RawGFCode {

    public FormattedGFCode(int zzyy, int llkk) {
        super(zzyy, llkk);
    }

    @Override
    public String[] getCodes() {
        String s = String.valueOf(GFCodeUtils.PSP_STONE_RAW_VALUE_1 | yyzz);
        String t = String.valueOf(GFCodeUtils.PSP_STONE_RAW_VALUE_2 | llkk);

        return new String[] {s, t};
    }
}
