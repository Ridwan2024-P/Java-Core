 class Hello{
   void show(){
    System.out.println("Hello");
   }
    
}

  class rid extends Hello{
    
    void show(){
        System.out.println("Hi");
    }
}
public class DynamicMethodMismatch  {
  public static void main(String[] args) {
    Hello h = new rid();
    h.show();
  }

    
}