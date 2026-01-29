public class WrapperPrimitiveClassesTest {

    /*
     * Integer wrapper class tests from 'valueOf()'.
     */
    static int valueA = Integer.valueOf(201);
    static int valueB = Integer.valueOf("123");
    static int valueC = Integer.valueOf("FF", 16);
    static int valueD = Integer.valueOf("BB", 12);
    static int valueO = Integer.valueOf("ZZ", 36);
    // static int valueR = Integer.valueOf("1_1");
    // static int valueP = Integer.valueOf("ZZ", 37); // Fails because of Character.MAX_RADIX
    // static int valueQ = Integer.valueOf("0", 1); // Fails because of Character.MIN_RADIX

    /*
     * Boolean wrapper class tests from 'valueOf()'.
     */
    static boolean valueE = Boolean.valueOf("123");
    static boolean valueF = Boolean.valueOf("TRUE");
    static boolean valueG = Boolean.valueOf("fals");
    static boolean valueS = Boolean.valueOf("");

    /*
     * Float wrapper class tests from 'valueOf()'.
     */
    static float valueH = Float.valueOf("10.3");
    static float valueI = Float.valueOf("10.4F");
    static float valueT = Float.valueOf("0");
    // static float valueM = Float.valueOf("10L");
    // static float valueN = Float.valueOf("string");

    /*
     * Long classes test from 'valueOf()'.
     */
    static long valueJ = Long.valueOf("10");
    // static long valueU = Long.valueOf("1_000_000");
    // static long valueM = Long.valueOf("10L");
    // static long valueK = Long.valueOf("10.5");
    // static long valueL = Long.valueOf("10.5F");
}
