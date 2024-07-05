/**
* <h1 > Application .java </h1 >
* <p>
* This class is designed for processing XXX in Java .
* It is part of Lab 1 Exercise C.
* </p>
*
* <p> <b> Submission Date : </b> July 3, 2024 </p>
*
* @author Arsalan Baig
* @version 1.0
*/


		import java.util.Scanner;
		
		public class Application {
		
		    public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Welcome to my Calculator! \n");
		        
		        while (true) {
		            System.out.println("Please enter an operation to begin (add, subtract, multiply, divide, power, sqrt, log, log10, sin, cos, tan, factorial, permutation) or 'exit' to quit:");
		            String operation = scanner.nextLine();  
		            
		            if (operation.equalsIgnoreCase("exit")) {
		                System.out.println("Exiting calculator...");
		                break;
		            }

            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Enter the first operand:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result of " + num1 + " + " + num2 + " is: " + add(num1, num2));
                    break;
                    
                case "factorial":
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    System.out.println("Result of " + number + "! is: " + factorial(number));
                    break;
                
                case "subtract":
                    System.out.println("Enter the first operand:");
                    double n1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double n2 = scanner.nextDouble();
                    System.out.println("Result of " + n1 + " - " + n2 + " is: " + subtract(n1, n2));
                    break;
                
                case "multiply":
                    System.out.println("Enter the first operand:");
                    double number1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double number2 = scanner.nextDouble();
                    System.out.println("Result of " + number1 + " * " + number2 + " is: " + multiply(number1, number2));
                    break;
                    
                case "divide":
                    System.out.println("Enter the first operand:");
                    double quotient = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double dividend = scanner.nextDouble();
                    if (dividend == 0) {
                        System.out.println("Can't divide by 0!");
                    } else {
                        System.out.println("Result of " + quotient + " / " + dividend + " is: " + divide(quotient, dividend));
                    }
                    break;
                
                case "power":
                    System.out.println("Enter the base:");
                    double base = scanner.nextDouble();  
                    System.out.println("Enter the exponent:");
                    double exponent = scanner.nextDouble();  
                    System.out.println("Result of " + base + " to the power of " + exponent + " is: " + power(base, exponent));  
                    break;
                    
                case "tan":
                    System.out.println("Enter the angle in radians:");
                    double tanOf = scanner.nextDouble();
                    System.out.println("Result of tan of " + tanOf + " is: " + tan(tanOf));
                    break;
                    
                case "sin":
                    System.out.println("Enter the angle in radians:");
                    double sinOf = scanner.nextDouble();
                    System.out.println("Result of sin of " + sinOf + " is: " + sin(sinOf));
                    break;
                    
                case "cos":
                    System.out.println("Enter the angle in radians:");
                    double cosOf = scanner.nextDouble();
                    System.out.println("Result of cos of " + cosOf + " is: " + cos(cosOf));
                    break;
                    
                case "log":
                    System.out.println("Enter the number:");
                    double logNumber = scanner.nextDouble();
                    System.out.println("Result of log of " + logNumber + " is: " + log(logNumber));
                    break;
                    
                case "log10":
                    System.out.println("Enter the number:");
                    double log10Number = scanner.nextDouble();
                    System.out.println("Result of log10 of " + log10Number + " is: " + log10(log10Number));
                    break;
                    
                case "sqrt":
                    System.out.println("Enter the number:");
                    double sqrtNumber = scanner.nextDouble();
                    System.out.println("Result of sqrt of " + sqrtNumber + " is: " + sqrt(sqrtNumber));
                    break;
                
                case "permutation":
                    System.out.println("Enter number of items:");
                    int items  = scanner.nextInt();
                    while(items > 100 || items <= 0) {
                    	System.out.println("Please choose a number between 0 and 100: ");
                        items  = scanner.nextInt();
                    }
                    System.out.println("Enter number of items to choose from: ");
                    int choose  = scanner.nextInt();
                    while(choose > items) {
                    	System.out.println("Please choose a number less than or equal to the # of items: ");
                        choose  = scanner.nextInt();
                    }
                    
                    System.out.println("Result of "+items+"P"+choose+" is: "+permutation(items,choose));
                    break;
                    
                default:
                    System.out.println("Please use one of the operations provided.");
                    break;
            }
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    private static long factorialHelper(int originalNum, int num) {
        if (num <= 1) {
            System.out.print("Calculating factorial: 100% \n");
            return 1;
        }
        // Calculate progress and update progress bar
        int progress = (int) (((originalNum - num) / (double) originalNum) * 100);
        System.out.print("Calculating factorial: " + progress + "% \n");
        return num * factorialHelper(originalNum, num - 1);
    }

    // Exponentiation
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Natural logarithm
    public static double log(double number) {
        return Math.log(number);
    }

    // Base-10 logarithm
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Sine function
    public static double sin(double angleRadians) {
        return Math.sin(angleRadians);
    }

    // Cosine function
    public static double cos(double angleRadians) {
        return Math.cos(angleRadians);
    }

    // Tangent function
    public static double tan(double angleRadians) {
        return Math.tan(angleRadians);
    }
    
    public static double permutation(double x, double r) {
		
    	if(r == 0) return 1;
    	
    	return x * permutation(x-1, r - 1);
    	
    }
}

