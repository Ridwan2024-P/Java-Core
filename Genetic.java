
public class Main {
    public static void main(String[] args) {

        cal<Integer> c= new cal<Integer>(10,10);

        c.Sum();
        c.Same();
    }
}


class cal<T extends Number>{
    T a;
    T b;
    public cal(T a, T b){
        this.a=a;
        this.b=b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }
    public void  Sum(){
        System.out.println("Sum : " + (a.doubleValue()+b.doubleValue()));

    }
    public void Same(){
       if(a.equals(b)){
           System.out.println("Same");
       }
       else {
           System.out.printf("Not Same");
       }
    }
}
