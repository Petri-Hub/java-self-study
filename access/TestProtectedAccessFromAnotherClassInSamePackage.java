package access;

class TestProtectedAccessFromAnotherClassInSamePackage {
  TestProtectedAccessModifier sampleClass = new TestProtectedAccessModifier("123");

  public void sampleMethod(){
    /**
     * For some weird design decision, 'protected' fields of another class
     * in the same package can be referenced.
     */
    IO.println(sampleClass.field);
  }
}
