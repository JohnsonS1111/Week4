package ie.atu;
//Johnson's Code
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();
    }

    private static void add() {
        System.out.println("Enter first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The answer is " +total);
    }

}
