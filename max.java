public class max {
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 20, 25};
        
        
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
        
    }
}