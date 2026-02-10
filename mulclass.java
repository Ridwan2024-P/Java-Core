public class mulclass {
    void show()
    {
        System.out.println("This is a method of the class");
    }   

    public class Innermulclass {
        void display()
        {
            System.out.println("This is a method of the inner class");
        }
    
        
    }
    public static void main(String[] args) {
        mulclass obj = new mulclass();
        obj.show();

        Innermulclass innerobj = obj.new Innermulclass();
        innerobj.display();
    }   
}
