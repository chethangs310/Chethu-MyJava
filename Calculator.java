import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter first Digit Value: ");
        double A = scan.nextDouble();

        System.out.print("Enter second Digit Value: ");
        double B = scan.nextDouble();


        // Performing calculations
        double addition = A + B;
        double subtraction = A - B;
        double multiplication = A * B;
        double division = A / B;
        double modulus = A % B;

        // Displaying results
        System.out.println("All Arithmetic operations Results are shown below:-");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        scan.close();
    }
}
