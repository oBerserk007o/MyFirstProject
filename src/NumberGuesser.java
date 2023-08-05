import java.util.Scanner;

public class NumberGuesser {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum: ");
        int max = scanner.nextInt();
        int number = (int) (Math.random() * max);
        System.out.println(number);
        int answer;
        do {
            System.out.print("Enter your guess (0 - " + max + ") : ");
            answer = scanner.nextInt();
            if (answer > number) {
                System.out.println("Answer is too high!");
            }
            else if (answer < number) {
                System.out.println("Answer is too low!");
            }
            else System.out.println("Correct!");
        } while (answer != number);
    }
}
