
public class Main {
    public static void main(String[] args) {

        cal<Integer, Float> c= new cal<Integer,Float>(20,30,20f,30f);

        c.Sum();
        c.Same();
    }
}


class cal<T extends Number ,V extends Number>{
    T a;
    T b;
    V c;
    V d;
    public cal(T a, T b,V c,V d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public V getC() {
        return c;
    }

    public V getD() {
        return d;
    }

    public void setC(V c) {
        this.c = c;
    }

    public void setD(V d) {
        this.d = d;
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
       if(a.equals(b) == c.equals(d)){
           System.out.println("Same");
       }
       else {
           System.out.printf("Not Same");
       }
    }
}
