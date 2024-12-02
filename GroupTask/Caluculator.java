package JavaGrpTask;

public class Caluculator {

//        public double calculate(double a, double b)
//        {
//            return 0;
//        }

        public double Addition(double a, double b)
        {
            return a + b;
        }

        public double Subtraction(double a, double b)
        {
            return a - b;
        }

        public double Multiplication(double a, double b)
        {
            return a * b;
        }

        public double division(double a, double b)
        {
            return a / b;
        }

    }
     class Advcalculator extends Caluculator
    {
        public double squareroot(double a)
        {
            return Math.sqrt(a);
        }
    }
     class Cal
    {
        public static void main(String[] args)
        {
            Advcalculator ca1 = new Advcalculator();

            System.out.println("Addition is: " + ca1.Addition(2, 7));
            System.out.println("Subtraction is: " + ca1.Subtraction(9, 3));
            System.out.println("Multiplication is: " +ca1.Multiplication(6,   2));
            System.out.println("Division is: " + ca1.division(9, 3));
            System.out.println("Squareroot is:"+ ca1.squareroot (25));
        }
    }

