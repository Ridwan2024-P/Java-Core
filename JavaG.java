import java.lang.reflect.Array;
import java.net.SocketOption;
import java.util.ArrayList;

public class JavaG {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("apple");
        fruit.add("apple");
        fruit.add("apple");
        fruit.add("apple");
        for(String f : fruit){
            System.out.println(f);
        }
        Box <String> box = new Box<>();
       box.show ("Rid");
       box.setA("Rimi");
       System.out.println(box.getA());

    }
}

class Box <T>{
     T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void show ( T a){
        System.out.println(a);
    }

}



