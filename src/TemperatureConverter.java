import java.util.Arrays;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how you want to convert your temperature (Example: Kelvin to Celsius = k2c): ");
        String[] convertOrder = scanner.next().toLowerCase().split("2");
        System.out.print("Enter value to convert: ");
        float input = scanner.nextFloat();
        float result = 0f;
        if (Arrays.toString(convertOrder).charAt(1) == 'c') {
            if (Arrays.toString(convertOrder).charAt(4) == 'f') {
                result = (input * 9/5) + 32;
            }
            if (Arrays.toString(convertOrder).charAt(4) == 'k') {
                result = input + 273.15f;
            }
        }
        if (Arrays.toString(convertOrder).charAt(1) == 'f') {
            if (Arrays.toString(convertOrder).charAt(4) == 'c') {
                result = (input - 32) * 5/9;
            }
            if (Arrays.toString(convertOrder).charAt(4) == 'k') {
                result = (input - 32) * 5/9 + 273.15f;
            }
        }
        if (Arrays.toString(convertOrder).charAt(1) == 'k') {
            if (Arrays.toString(convertOrder).charAt(4) == 'f') {
                result = (input - 273.15f) * 9/5 + 32;
            }
            if (Arrays.toString(convertOrder).charAt(4) == 'c') {
                result = input - 273.15f;
            }
        }

        System.out.println("The result is: " + result);
    }
}
