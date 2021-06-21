import java.util.Scanner;

public class Multiplayer{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    while(true){
    int Bet1;
    int Bet2;
    char choice;
    String Player1 ="" ;
    String Player2 = "";
    
    System.out.println("ROCK , SCISSOR, PAPER GAME\n");

    
    System.out.println("\nPlayer1  CHOOSE YOUR BET \n'(0)' for Rock, '(1)' for Paper, and '(2)' for Scissors: ");
    Bet1 = sc.nextInt();
    if(Bet1 == 0){
        Player1 = "Rock";
      }else if(Bet1 == 1){
        Player1 = "Paper";
      }else if(Bet1 ==2){
        Player1 = "Scissors";
      }
    System.out.println("\nPlayer 2 CHOOSE YOUR BET\n'(0)' for Rock, '(1)' for Paper, and '(2)' for Scissors: ");
   Bet2 = sc.nextInt();
    if(Bet2 == 0){
        Player2 = "Rock";
      }else if(Bet2 == 1){
        Player2 = "Paper";
      }else if(Bet2 ==2){
        Player2 = "Scissors";
      }
    if(Bet1 == Bet2){
      System.out.println("\nIt's a Tie " + Bet1 + "and" + Player1 +".\n"); 
    }else if((Bet1 == 2 &&  Bet2 == 1  && Bet1 < 3) || (Bet1 == 0 && Bet2 == 2 && Bet1 <3) || (Bet1 == 1 && Bet2 == 0 && Bet1 <3) ){
      System.out.println("\n Player1 wins The " + Player1 + " beats Player 2's Pick " + Player2 + "\n");
    }else if((Bet1 == 1 && Bet2 == 2 && Bet1 < 3) || (Bet1 == 0 && Bet2 == 1 && Bet1 <3) || (Bet1 == 2 && Bet2 == 0 && Bet1 <3)){
      System.out.println("\n Player 2 wins The" + Player1 + " beats Player 1's Pick " + Player2 + "\n");
    }else{
      System.out.println("WRONGG INPUT TRY AGAIN\n");
    } 
       System.out.println("Enter (N) to quit or (Y) to play again");
    choice = sc.next().charAt(0);
    if(choice == 'N' || choice == 'n'){
    System.out.println("Thank You for Playing");
        break;
    }
    else if(choice == 'Y' || choice == 'y')
    {
    }
    else{
    	System.out.println("Wrong Input");
    	}
    }
    
  }//end of main method
}//end of Multiplayer class