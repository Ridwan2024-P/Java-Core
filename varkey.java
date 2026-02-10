public class varkey {
    public static void main(String[] args){
        var a=10;
        var b ="Hello, World!";
        var c=45.67;
        var d=true;
        var e='a';
        System.out.println("Integer value: " + a);
        System.out.println("String value: " + b);
        System.out.println("Double value: " + c);
        System.out.println("Boolean value: " + d);
        System.out.println("Character value: " + e);
    }
    // you can not use var for class level variables, method parameters, or return types.
 /*   public class Innervarkey {
        var rid=10; // This will cause a compilation error because 'var' cannot be used for class-level variables.
    
        for(var i=0; i<5; i++) { // This will also cause a compilation error because 'var' cannot be used in a for loop initializer.
            System.out.println(i);
        }  
        void display(var message) { // This will cause a compilation error because 'var' cannot be used for method parameters.
            System.out.println(message);
        } 
        var x; // This will cause a compilation error because 'var' cannot be used without an initializer.
    }
    */
}
