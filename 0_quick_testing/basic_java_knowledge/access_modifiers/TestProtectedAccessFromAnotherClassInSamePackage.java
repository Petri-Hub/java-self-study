package access_modifiers;

class TestProtectedAccessFromAnotherClassInSamePackage {
  TestProtectedAccessModifier sampleClass = new TestProtectedAccessModifier("123");

  public void sampleMethod(){
    /**
     * For some weird design decision, 'protected' fields of another class
     * in the same package can be referenced.
     */
    // Assuming IO.println exists and is accessible.
    // IO.println(sampleClass.field);
    System.out.println(sampleClass.field);
  }
}
