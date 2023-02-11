import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to calculator! type (Exit) anywhere to stop the program.");
        asking();
        System.out.println("See ya");
    }
    static void asking (){
        while (true) {
            Scanner sam = new Scanner(System.in);
            System.out.print("Enter first number: ");
            // We do String here to be able to write "Exit"
            String input1 = sam.next().toLowerCase();
            if (input1.equals("exit")){
                break;
            }
            System.out.print("Enter + ,- ,* ,/ :  ");
            // We do String here to be able to write "Exit"
            String input = sam.next().toLowerCase();
            if (input.equals("exit")){
                break;
            }
            System.out.print("Enter second number: ");
            // We do String here to be able to write "Exit"
            String input2 = sam.next().toLowerCase();
            if (input2.equals("exit")){
                break;
            }
            try {
                // if you TRY to write other tings than number this code will CATCH you :)
                calculations(input,input1,input2);
            } catch (NumberFormatException nfe) {
                System.out.println("Yo! you can't do that!");
            }
        }
    }
    static void calculations (String input, String input1, String input2) {

        // We change to double here to be able to do calculation which is not possible when using String
        double firstNumber = Double.parseDouble(input1);
        double secondNumber = Double.parseDouble(input2);

        switch (input) {
            // I didn't know we can write switch like this! IntelliJ recommend it for me
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "*" -> System.out.println(firstNumber * secondNumber);
            case "/" -> System.out.println(firstNumber / secondNumber);
            default -> System.out.println("Really!!!");
        }
    }
}
