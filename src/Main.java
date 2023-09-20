import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cardBalance = 5000;
        double interestRate = 0.17;

        // Variables

        double firstMonth = cardBalance * interestRate;
        double firstMonthTotal = firstMonth + cardBalance;
        double secondMonth = firstMonth * interestRate;
        double secondMonthTotal = secondMonth + firstMonthTotal;

        System.out.println("The first month total is: " + firstMonthTotal);
        System.out.println("The second month total is: " + secondMonthTotal);

    }
}