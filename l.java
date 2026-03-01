class CallMe {
    void call(String msg) {
        System.out.print("[");
        try {
            Thread.sleep(1000);
            System.out.print(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(String msg, CallMe target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

public class l {
    public static void main(String[] args) throws InterruptedException {
        CallMe cm = new CallMe();
        Caller c1 = new Caller("Hello", cm);
        Caller c2 = new Caller("Synchronized", cm);
        Caller c3 = new Caller("World", cm);

        c1.t.start();
        c2.t.start();
        c3.t.start();

      
    }
}