enum weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    weekday(){
        System.out.println("Weekday");
    }
}
public class ridd {
    public static void main(String[] args) {
        weekday[] w = weekday.values();
        for (weekday weekday : w) {
            switch (weekday) {
                case SUNDAY:
                    
                    break;
                case MONDAY:
                    System.out.println(weekday.name());
                    break;
                case TUESDAY:
                    System.out.println(weekday.ordinal());
                    break;
                default:
                    System.out.println("Working day");
            }
        }
    }
}