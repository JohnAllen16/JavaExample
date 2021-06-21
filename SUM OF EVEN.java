import java.util.Scanner;

public class ACTIVITY {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, Sum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter The  Maximum : ");
		number = sc.nextInt();	
		
		for(i = 2; i <= number; i = i + 2)
		{
			Sum = Sum + i; 
			System.out.print(i  +" ");  
		}
		System.out.println("\n The Sum of Even Numbers up to " + number + "  =  " + Sum);
	}
}