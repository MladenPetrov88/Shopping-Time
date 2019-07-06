import java.util.Scanner;

public class ShoppingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restTime = Integer.parseInt(scanner.nextLine());
        double partPrice = Double.parseDouble(scanner.nextLine());
        double programPrice = Double.parseDouble(scanner.nextLine());
        double frappePrice = Double.parseDouble(scanner.nextLine());

        double restTimeLeft = (restTime - 5) - 3 * 2 - 2 * 2;

        double partCost = partPrice * 3;
        double programCost = programPrice * 2;

        double totalMoneySpend = partCost + programCost + frappePrice;

        System.out.printf("%.2f%n%.0f", totalMoneySpend, restTimeLeft);
    }
}
