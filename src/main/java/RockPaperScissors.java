import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int replay;
        boolean loop;

        do{

            int player, computer, gameNo = 10, pWins = 0, cWins = 0, draws = 0;
            System.out.println("How many games do you want to play : ");
            gameNo = in.nextInt();

            System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");

            for(int i = 0; i < gameNo; i++){

                System.out.println("Choose Rock, Paper or Scissors : ");

                player = in.nextInt();
                if(player > 3 || player == 0){
                    System.out.println("Invalid selection, skipping round");
                    continue;
                }

                computer = rand.nextInt(3) + 1;
                System.out.println("Computer chose : " + computer);

                if(player == computer){
                    System.out.println("Draw");
                    draws += 1;
                } else if ((player == 1 && computer == 3) || (player > computer)) {
                    System.out.println("Win");
                    pWins += 1;
                }else {
                    System.out.println("Lose");
                    cWins += 1;
                }
            }
            System.out.println("Wins : " + pWins + " Draws : " + draws + " Loses : " + cWins);

            if (pWins > cWins){
                System.out.println("You win!");
            }
            if(pWins == cWins){
                System.out.println("Draw!");
            }
            if(pWins < cWins){
                System.out.println("You lose!");
            }
            System.out.println("Do you want to play again? Enter 1 for yes or anything else for no : ");
            replay = in.nextInt();

            if(replay == 1){
                loop = true;
            }else {
                loop = false;
                System.out.println("Thanks for playing!");
            }

        }while(loop);

    }


}
