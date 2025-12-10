package primitives;

class TestInitialPrimitiveValues {
  static byte sampleByte;
  static short sampleShort;
  static int sampleInt;
  static long sampleLong;
  static float sampleFloat;
  static double sampleDouble;
  static char sampleChar;
  static boolean sampleBoolean;
  static Object sampleObject;

  public static void main(String[] args){
    IO.println(sampleByte);
    IO.println(sampleShort);
    IO.println(sampleInt);
    IO.println(sampleLong);
    IO.println(sampleFloat);
    IO.println(sampleDouble);
    IO.println(sampleChar);
    IO.println(sampleBoolean);
    IO.println(sampleObject);
  }
}