package control.structure;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Use print instead of println
            }
            System.out.println(); // Move this line outside the inner loop
        }
    }
}
