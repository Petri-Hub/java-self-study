package primitives;

public class TestIntegerLiterals {
  public static void main(String[] args){
    /**
     * A normal number in decimal format.
     */
    int decimalLiteral = 232;

    /**
     * A number defined in the hexadecimal format. Declared
     * using the '0x' prefix before its value.
     */
    int hexadecimalLiteral = 0xff;
    
    /**
     * A number defined in binary 2 base. Defined using
     * the '0b' prefix before its value.
     */
    int binaryLiteral = 0b11;

    IO.println("Decimal literal value: " + decimalLiteral);
    IO.println("Hexadecimal literal value: " + hexadecimalLiteral);
    IO.println("Binary literal value: " + binaryLiteral);
  }
}
