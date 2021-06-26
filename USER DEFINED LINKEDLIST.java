import java.util.Scanner; 
import java.util.*;
public class one { 

 public  static void main(String []args)

    { 
    
 LinkedList<Integer>num= new LinkedList<Integer>(); 

            num.add(54); 

            num.add(86); 

            num.add(30); 
             
             num.add(45); 

            num.add(92); 

            num.add(15); 

  
 

            System.out.println("LinkedList : " + num); 

   
 Scanner nums = new Scanner(System.in);
   
System.out.println("Enter a number to add in first");
int num1 = nums.nextInt();

num.addFirst( num1);
System.out.println("The Value is" +num);

   
System.out.println("\nEnter a number to add in Middle");
int num2 = nums.nextInt();

num.add(4, num2);
System.out.println("The Value is" +num);

System.out.println("\nEnter a number to add in Last");
int num3= nums.nextInt();

num.addLast( num3);
System.out.println("The Value is" +num);


              }
   
}  