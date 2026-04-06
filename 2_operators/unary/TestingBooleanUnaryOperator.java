class TestingBooleanUnaryOperator {
    public static void main(String[] args) {
        int isValidInt = 1;
        boolean isValidBoolean = true;

        var invertedIsValidBoolean = !isValidBoolean;

        /*
         * This doesn't work as the only possible type that can be negated
         * is the primitive 'boolean' type.
         *
         * Every other type causes compilation failures.
         */
        var invertedIsValidInt = !isValidInt;
    }

}