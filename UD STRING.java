import java.util.Scanner;
 
public class one {
 
 public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
   
  System.out.print("Enter Your Name: ");
  String name = sc.nextLine();
   
  System.out.print("Enter Your Age: ");
  String age = sc.nextLine();
  
  System.out.print("Enter Your Course: ");
  String course = sc.nextLine();
   

System.out.println("Hello My Name is " +name + " , " +age+ " Years Old , I am taking " + course + " at Earist - Manila");
 
 }
 
}
