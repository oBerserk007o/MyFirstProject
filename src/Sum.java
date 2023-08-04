import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value:");
        float input1 = Float.parseFloat(scanner.next());

        System.out.print("Enter second value:");
        float input2 = Float.parseFloat(scanner.next());

        System.out.println(sum(input1, input2));
    }

    public static float sum(float a, float b) {
        return a+b;
    }
}
