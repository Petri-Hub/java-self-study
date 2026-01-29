class TestingIntOverflowDeclaration {
	public static void main(String args[]){		
		/*
		 * This value compiles without any problems.
		 */
		long valueA = 3333333333333L;
		
		/*
		 * The value below doesn't compile, as the '333...' value
		 * exceeds the maximum value a 'int' type allows.
		 *
		 * Even though the left side of the assignment is an 'long'
		 * Java doesn't assume the right side is an integer, so this
		 * must be manually specified by you.
		 */
		long valueB = 33333333333333;
	}
}
