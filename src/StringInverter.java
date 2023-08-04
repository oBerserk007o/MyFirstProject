import java.util.ArrayList;
import java.util.Scanner;

public class StringInverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to invert: ");
        String input = scanner.nextLine();
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse.add(String.valueOf(input.charAt(i)));
        }
        System.out.println(String.join("", reverse));
    }
}
