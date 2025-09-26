import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Would you like a 1: Regular: base price $5.45 or 2: Large: base price $8.95");
        String input = myScanner.nextLine();
        double regularBase = 5.45;
        double largeBase = 8.95;
        double basePrice = 0.0;
        if (input.equals("1"))
            basePrice = regularBase;
        else if (input.equals("2"))
            basePrice = largeBase;

        System.out.println("How old are you? Are you a Student (17 or younger) or a Senior (65 or older");
        double student = .10; // 10% discount
        double senior = .20; // 20% discount
        double discount; // final discount if any
        int age = myScanner.nextInt();
        if (age <= 17) {
            discount = basePrice * student;
            System.out.println("You get a %10 discount!");
        }
         else if (age >= 65) {
            discount = basePrice * senior;
            System.out.print("You get a %20 discount!");
        }
        else {
            discount = 0;
            System.out.print("Unfortunately, you get nothing.");
        }
        double totalPrice = basePrice + discount;

        System.out.printf(" Total cost of your sandwich is, $%.2f",  totalPrice);
    }


}
