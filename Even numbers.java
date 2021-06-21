import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	
	int num;
    do 
    {   System.out.println("Enter even Number :");
        num = myObj.nextInt();
    }while (num % 2 == 0);
	}
}