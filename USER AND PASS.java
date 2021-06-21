import java.util.Scanner;
public class One
{
    public static void main(String args[])
    {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        username = sc.nextLine();
        
        System.out.print("Enter password:");
        password = sc.nextLine();
        
        if(username.equals("java") && password.equals("54321"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("Access Denied");
        }
    }
}