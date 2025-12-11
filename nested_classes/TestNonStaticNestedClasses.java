package nested_classes;

public class TestNonStaticNestedClasses {
  public static void main(String[] args){
    TestNonStaticNestedClasses sampleClass = new TestNonStaticNestedClasses();

    TestNonStaticNestedClasses.InnerClass innerClass = sampleClass.new InnerClass(12);

    IO.println("Inner class value is: " + innerClass.number);
  }

  public class InnerClass {
    public final int number;

    public InnerClass(int number){
      this.number = number;
    }
  }
}
