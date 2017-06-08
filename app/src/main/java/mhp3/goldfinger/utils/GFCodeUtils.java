package mhp3.goldfinger.utils;

/**
 */
public final class GFCodeUtils {

    public static final int PSP_STONE_PREFIX_1 = 0x01349364;
    public static final int PSP_STONE_PREFIX_2 = 0x01349368;
    public static final int PSP_STONE_PREFIX_3 = 0x0134936C;

    public static final long PSP_STONE_RAW_VALUE = 0x0165L;
    /**
     * Example value: 0xZZYY6501.
     */
    public static final int PSP_STONE_RAW_VALUE_1 = 0x00006501;
    /**
     * Example value: 0x0000LLKK.
     */
    public static final int PSP_STONE_RAW_VALUE_2 = 0x00000000;
    /**
     * Default value.Don't modify this.
     */
    public static final int PSP_STONE_RAW_VALUE_3 = 0x00000000;

    public static String formatRawCode(String rawCode) {
        if (rawCode == null || rawCode.length() == 0) {
            return rawCode;
        }

        int offset = 0;
        int length = rawCode.length();
        StringBuilder builder = new StringBuilder();
        if ((rawCode.length() % 2) > 0) {
            builder.append("0");
            builder.append(rawCode.substring(0, 1));
            offset = 1;
        }

        while (offset + 2 <= length) {
            builder.append(" ");
            String substring = rawCode.substring(offset, offset + 2);
            builder.append(substring);
            offset += 2;
        }

        return builder.toString();
    }

}
