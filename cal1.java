//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class call1 {
    public static void main(String[] args) {
    cal<Integer,Double,Float> c = new cal<>(10,10.2,5.56f);
    System.out.println("Sum : "+(c.getA()+c.getB()+c.getC()));
    System.out.println("Mul : "+(c.getA()*c.getB()*c.getC()));
    System.out.println("cal : "+(c.getA()*c.getB()/c.getC()));


    }
}

public class cal<T,V,N>{
    T a;
    V b;
    N c;
    cal(T a,V b, N c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public N getC() {
        return c;
    }

}