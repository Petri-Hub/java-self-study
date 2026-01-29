class TestingOtherTypesOfNumberBases {
	public static void main(String[] args){
		/*
		 * This value is in Octal base, so it uses
		 * values from 0 to 7.
		 *
		 * This is defined in Java by placing a zero before
		 * the actual number.
		 */
		int valueInOctal = 017;

		/*
		 * This value is in HEX value, and uses 0-9 values and then
		 * letters from A-F.
		 *
		 * This can be defined in Java by placing a '0x' before the
		 * hexadecimal number
		 */
		int valueInHex = 0xFF;

		/*
		 * This value is binary and allows 0 and 1 values
		 * to be placed.
		 *
		 * This is defined by placing a '0B' prefix in the
		 * number you're creating.
		 */
		int valueInBinary = 0B1010101;

		System.out.println("Value in octal: " + valueInOctal);
		System.out.println("Value in hex: " + valueInHex);
		System.out.println("Value in binary: " + valueInBinary);
	}
}
