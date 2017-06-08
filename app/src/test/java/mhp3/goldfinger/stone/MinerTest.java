package mhp3.goldfinger.stone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class MinerTest {

    Miner miner;

    @Before
    public void init() {
        Miner.Configuration configuration = new Miner.Configuration.Builder().build();
        miner = new Miner(configuration);
    }

    @Test
    public void testRawStoneCode() {
        String[] code = miner.getRawStoneCode(36, 5, 13, 10, Stone.Hole.Null, Stone.Rare.Seven);
        assertArrayEquals(new String[]{"16536A2A406"}, code);
        String[] code1 = miner.getRawStoneCode(56, 6, 33, 9, Stone.Hole.Null, Stone.Rare.Seven);
        assertArrayEquals(new String[]{"165469EB810"}, code1);
    }


    @Test
    public void testFormattedRawStoneCode() {
        String[] ff = miner.getFormattedRawStoneCode(47, 5, 13, 10, Stone.Hole.Null, Stone.Rare.Seven);

        String[] code = miner.getFormattedRawStoneCode(36, 5, 13, 10, Stone.Hole.Null, Stone.Rare.Seven);
        assertArrayEquals(new String[]{"01 65 36 A2 A4 06"}, code);
        String[] code1 = miner.getFormattedRawStoneCode(56, 6, 33, 9, Stone.Hole.Null, Stone.Rare.Seven);
        assertArrayEquals(new String[]{"01 65 46 9E B8 10"}, code1);
    }




}