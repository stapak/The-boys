import java.util.Scanner;
import java.util.Random;
public class Guesser{

public static void main(String args[]){
int umpire,player1,player2,player3;
Random random=new Random();
umpire=random.nextInt(6)+1;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the Guessing Game!");
System.out.println("Player 1, please enter your guess:");
 player1=sc.nextInt();
 System.out.println("Player 2, please enter your guess:");
 player2=sc.nextInt();
 System.out.println("Player 3, please enter your guess:");
 player3=sc.nextInt();
if(umpire==player1&&umpire==player2&&umpire==player3){
    System.out.println("All the players guessed correctly! It's a tie!");
}else if(umpire==player1&&umpire==player2){
    System.out.println("Player 1 and Player 2 guessed correctly! It's a tie!");
}
else if(umpire==player1&&umpire==player3){
    System.out.println("Player 1 and Player 3 guessed correctly! It's a tie!");
}else if(umpire==player2&&umpire==player3){
    System.out.println("Player 2 and Player 3 guessed correctly! It's a tie!");
}
else if(umpire==player1){
    System.out.println("player 1 won the match");
    }
    else if(umpire==player2){
        System.out.println("player 2 won the match");
    }
else if(umpire==player3){
    System.out.println("player 3 won the match");
}
else{
    System.out.println("No one guessed it correctly");
}



}


}