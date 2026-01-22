package nested_classes;

public class TestsAnonymousClasses {
  
  public static void main(String[] args){
    Dog angryDog = new Dog(){
      
      @Override
      public void bark(){
        System.out.println("AAAUAUAUAUAUAUAU");
      }
    };

    
    angryDog.bark();
  }

  public static class Dog {
    public void bark(){
      System.out.println("Au");
    }
  }
}
