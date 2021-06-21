import java.util.Scanner;
public class Main {
	static void Arithmetic(int num1 , int num2)
	{
			char ch;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the operator you want(+, -, *, /) :");
		ch= sc.next().charAt(0);
		
		if (ch == '+') {
		System.out.println("Addition of " + num1 + "+" + num2 + " = " + (num1 + num2));
		}


	else if (ch == '-') {
		System.out.println("Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));

	}

	else if (ch == '*') {
		System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));

	} else if (ch == '/') {
		System.out.print(" Division of " + num1 + "/" + num2 + " = " + (num1 / num2));

	}

	else {
		System.out.print("Operator is not available");
	}
	
	
	}
	
	
	public static void main(String[] args) {
		
		int num1 , num2;
		char choice;
Scanner sc=new Scanner(System.in);
do{

System.out.print("Enter the first number: ");

num1=sc.nextInt();


System.out.print("Enter the second number: ");

 num2=sc.nextInt();

Arithmetic(num1 ,num2);
 
	   System.out.println("\nDo You Want To Continue(Y/N) ");
    choice= sc.next().charAt(0);
    
   } while(choice == 'Y'|| choice == 'y');
	}
}