package mhp3.goldfinger.stone;

import mhp3.goldfinger.stone.converter.RawGFCodeConverter;

/**
 */
public class RawGFCodeFactory implements CodeFactory {

    private RawGFCodeConverter converter = new RawGFCodeConverter();

    @Override
    public GFCode getGFCode(Stone stone) {
        return converter.convert(stone);
    }
}
