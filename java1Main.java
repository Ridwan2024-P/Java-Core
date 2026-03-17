
import java.net.SocketOption;
import java.util.ArrayList;

public class java1Main {
    public static void main(String[] args) {

Box<String ,String> b = new Box<>("10" ,"10");

b.show();
Box <String, Integer> bb =new Box<>("RID",10);
bb.show();
Box <Integer, Double> bbb = new Box<>(10,0.1);
bbb.show();

    }
}

class Box<T ,V>{
    T a;
    V b;

  Box(T a, V b){
      this.a=a;
      this.b=b;

  }

    public V getB() {
        return b;
    }

    public T getA() {
        return a;
    }
    public void show(){
      System.out.println(a);
      System.out.println(b);
    }

}



