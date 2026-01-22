package nested_classes;

public class TestStaticLocalClasses {
  public static final int NUMBER_C = 10;

  public static void main(String[] args){
    IO.println("The result of a sum is: " + TestStaticLocalClasses.myMethodThatSums(1, 2));
  }

  static int myMethodThatSums(int numberA, int numberB){
    class MyClassThatSums {
      public int sum(){
        return numberA + numberB + NUMBER_C;
      }
    }

    return new MyClassThatSums().sum();
  }
}
