enum TrafficLight {
    RED,

    GREEN,

    YELLOW;

    public TrafficLight next()
     {
        if (this == RED){
            return GREEN;
        }
        

        else if (this == GREEN)
        { return YELLOW;
            
        }
            

        else{
             return RED;
        }
           
    }


}

public class Main {
    
        public static void main(String[] args) { 
        TrafficLight l=TrafficLight.RED;

        for (int i=1;i<=10;i++) 
            {

            System.out.println("Cycle"+i+":"+l);
            l=l.next();
        }
    }
}
