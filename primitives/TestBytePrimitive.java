package primitives;

public class TestBytePrimitive {
  static byte nonInitializedByte;

  public static void main(String[] args){
    byte normalByte = 64;
    byte maxValueByte = 127;
    byte minValueByte = -128;

    /**
     * Both of the lines above cannot be compiled, as
     * they result in the following compilation problem:
     * 
     * "error: incompatible types: 
     * possible lossy conversion from int to byte"
     * 
     * byte minOverflownByte = -129;
     * byte maxOverflownByte = 128;
     */

    IO.println("A non initialized byte value: " + nonInitializedByte);
    IO.println("A normal byte value: " + normalByte);
    IO.println("A max value byte value: " + maxValueByte);
    IO.println("A min value byte value: " + minValueByte);
  }
}
