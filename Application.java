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
		
		System.out.println("Welcome to my Calculator!");
		System.out.println("Please enter an operation to begin (add, subtract, multiply ,divide, or factorial)");
		String  operation = scanner.nextLine();
		

		switch ( operation .toLowerCase() ) {
			
			case "add":
				System .out.println (" Enter the first operand :") ;
				double num1 = scanner . nextDouble () ;
				System .out.println (" Enter the second operand :") ;
				double num2 = scanner . nextDouble () ;
				System .out.println (" Result of "+num1+" + "+num2+" is: " + add ( num1 , num2 ) ) ;
				break ;
				
			case "factorial":
				System.out.println (" Enter a number :") ;
				double number = scanner . nextDouble () ;
				System.out.println (" Result of "+number+ "! is: " + factorial ( number ) ) ;
				break;
			
			case "subtract":
				System . out . println (" Enter the first operand :") ;
				double n1 = scanner . nextDouble () ;
				System .out.println (" Enter the second operand :") ;
				double n2 = scanner . nextDouble () ;
				System .out .println (" Result of "+n1+" - "+n2+ " is: " + subtract ( n1 , n2 ) ) ;
				break ;
			
			case "multiply":
				System . out . println (" Enter the first operand :") ;
				double number1 = scanner . nextDouble () ;
				System .out .println (" Enter the second operand :") ;
				double number2 = scanner . nextDouble () ;
				System .out.println (" Result of "+number1+" * "+number2+ " is: "+ add ( number1 , number2 ) ) ;
				break ;
				
			case "division":
				System . out . println (" Enter the first operand :") ;
				double quotient = scanner . nextDouble () ;
				System .out.println (" Enter the second operand :") ;
				double dividend = scanner . nextDouble () ;
				if(dividend == 0) {
					System.out.println("Can't divide by 0!");
				}
				else {
				System .out.println (" Result of "+quotient+" / "+dividend+" is: " + add ( quotient , dividend ) ) ;
				}
				break ;
			
			default:
				System.out.println("Please use one of the operations provided");
				break;
		}
				
			
	}
		
	public static double add ( double a , double b ) {
		
			return a + b ;
			
	}
	
	public static double subtract ( double a , double b ) {
		
		return a - b ;
		
	}
	
	public static double multiply ( double a , double b ) {
		
		return a * b ;
		
	}
	
	public static double divide ( double a , double b ) {
			
		return a / b ;
		
	}
			
	public static double factorial ( double n ) {
			if ( n <= 1) {
			return 1;} 
			
			else{
			return n * factorial ( n - 1) ;}
			
	}

	

}
