public class Varargs {

    static void  displat(int ...a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
  
    static void show(int a) {
        System.out.println("Single int");
    }

    static void show(int... a) {
        System.out.println("Varargs");
    }


       
    



    public static void main(String[] args) {
        displat(1,2,3,4,5);
        System.out.println();
        displat(10,20,30);
         show(10);       // Output: Single int
        show(1, 2, 3);  // Output: Varargs
    }   

    
}