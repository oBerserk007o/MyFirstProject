import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Number:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());
        String result = "";

        if (input % 5 == 0)
            result = "Fizz";
        if (input % 3 == 0)
            result += "Buzz";
        else
            result = String.valueOf(input);

        System.out.println(result);
    }
}
