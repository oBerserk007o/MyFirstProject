import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        int principal = 0;
        while (!((10_000_000 >= principal) && (principal >= 1_000))) {
            System.out.print("Principal ($1,000 - $10,000,000): ");
            principal = scanner.nextInt();
            if (!((10_000_000 >= principal) && (principal >= 1_000))) {
                System.out.println("Please enter a value within the bounds");
            }
        }

        float interest = 0.0F;
        while (!((30 >= interest) && (interest > 0))) {
            System.out.print("Annual interest rate: ");
            interest = Float.parseFloat(scanner.next());
            if (!((30 >= interest) && (interest > 0))) {
                System.out.println("Please enter a value between 0 and 30");
            }
        }

        short period = 0;
        while (!((50 >= period/12) && (period/12 > 0))) {
            System.out.print("Period (in years): ");
            period = (short) (scanner.nextShort() * 12);
            if (!((50 >= period/12) && (period/12 > 0))) {
                System.out.println("Please enter a value between 0 and 50");
            }
        }

        double mortgage = principal*(interest/1200*(Math.pow((1+interest/1200),(period))))/((Math.pow((1+interest/1200),period))-1);
        System.out.println("Mortgage: " + currency.format(mortgage));
    }
}