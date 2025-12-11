package nested_classes;

public class TestLocalClasses {
  
  public static void main(String[] args){
    new TestLocalClasses().sum(1, 2);
  }

  public void sum(int numberA, int numberB){
    class SampleClassThatSums{
      public int sum(){
        return numberA + numberB;
      }
    }

    int sum = new SampleClassThatSums().sum();

    IO.println("The sum result is: " + sum);
  }
}
