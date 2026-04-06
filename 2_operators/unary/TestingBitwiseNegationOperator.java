class TestingBitwiseNegationOperator {
    public static void main(String[] args) {
        int valueA = +0b00000011; // 3
        int valueB = +0b00000111; // 7
        int valueC = -0b00000101; // -5

        System.out.println("Original values:");
        System.out.println(valueA);
        System.out.println(valueB);
        System.out.println(valueC);

        /*
         * The bitwise negation operator turns all zeros to
         * one and vice versa.
         *
         * You can find the number by negating its original value and
         * subtracting one, for positive and negative numbers.
         *
         * Example 1: ~5 = -5 - 1 = -6
         * Example 2 ~-5 = 5 - 1 = 4
         */
        System.out.println("Bitwise negated values:");
        System.out.println(~valueA); // 00000011 -> 11111100 -> -4
        System.out.println(~valueB); // 00000111 -> 11111000 -> -8
        System.out.println(~valueC); // 11111010 -> 00000101 -> +4

        System.out.println("Other examples");
        System.out.println(~5);
        System.out.println(~-5);
    }
}