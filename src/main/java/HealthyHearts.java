import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        double max;
        double low;
        double high;

        // question isnt clear on what datatype to use so I used doubles for math convenience
        System.out.println("Enter your age : ");
        age = in.nextInt();

        max = 220 - age;

        high = max * 0.85;
        low = max *0.5;

        System.out.println("Your max heart rate is " + max);
        System.out.println("Your target heart rate should be between " + low + " - " + high);
    }
}
