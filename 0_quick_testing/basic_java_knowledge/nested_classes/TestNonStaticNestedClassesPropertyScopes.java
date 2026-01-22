package nested_classes;

public class TestNonStaticNestedClassesPropertyScopes {
  public int number = 122;
  
  public static void main(String[] args){
    TestNonStaticNestedClassesPropertyScopes sampleClass = new TestNonStaticNestedClassesPropertyScopes();

    TestNonStaticNestedClassesPropertyScopes.InnerClass innerClass = sampleClass.new InnerClass();
    
    innerClass.sampleMethod();
  }

  public class InnerClass {
    public void sampleMethod(){
      IO.println("The outer class value is: " + number);
    }
  }
}
