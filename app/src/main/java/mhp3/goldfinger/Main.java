package mhp3.goldfinger;

import mhp3.goldfinger.stone.Miner;
import mhp3.goldfinger.stone.Stone;

/**
 */
public class Main {

    public static void main(String[] args) {
        Miner.Configuration configuration = new Miner.Configuration.Builder().build();
        Miner miner = new Miner(configuration);

        String[] ff = miner.getFormattedRawStoneCode(43, 6, 6, 8, Stone.Hole.Null, Stone.Rare.Seven);

        System.out.println(ff[0]);
    }

}
