package mhp3.goldfinger.stone;

import mhp3.goldfinger.utils.GFCodeUtils;

/**
 */
public class RawGFCode implements GFCode {

    protected final int yyzz;
    protected final int llkk;

    public RawGFCode(int yyzz, int llkk) {
        this.yyzz = yyzz;
        this.llkk = llkk;
    }

    @Override
    public String[] getCodes() {
        long raw = GFCodeUtils.PSP_STONE_RAW_VALUE;

        int yy = yyzz & 0xff00;
        int zz = yyzz & 0x00ff;

        raw <<= 16;
        raw |= zz;
        raw |= yy;

        int ll = llkk & 0xff00;
        int kk = llkk & 0x00ff;
        raw <<= 8;
        raw |= kk;
        raw <<= 8;
        raw |= (ll >> 8);

        return new String[]{Long.toHexString(raw).toUpperCase()};
    }

    public int getYyzz() {
        return yyzz;
    }

    public int getLlkk() {
        return llkk;
    }
}
