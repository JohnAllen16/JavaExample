import java.util.*;

public class two { 

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   char choice;
   do {
	
	int num;

      System.out.println("\nEnter Number : ");
        num = sc.nextInt();
    
    
    if (num % 2 == 0)
    {
    	System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
     
    System.out.println("\nDo You Want To Continue(Y/N) ");
    choice = sc.next().charAt(0);
    
   } while(choice == 'Y'|| choice == 'y');
 }
}