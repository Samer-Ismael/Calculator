import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("This program will help you take a percentage out of a number for the number of times you want.");
        System.out.print("Enter a number:  ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        System.out.print("What percentage would you like to remove?: ");
        double input2 = scan.nextDouble();
        System.out.print("How many times would you like it to repeat? ");
        double input3 = scan.nextDouble();

        double base = input;
        int number = 1;

        for (int i = 0; i < input3; i++) {

            System.out.print(number + " - ");
            number++;
            double calculation = base * (input2 / 100);
            double result = base - calculation;
            System.out.println((int) result);
            base = result;
        }
    }
}