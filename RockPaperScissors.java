import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = input.nextLine().toLowerCase();

        // Generate computer choice (random)
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * 3);
        String computerChoice = choices[randomIndex];

        // Determine winner
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                   playerChoice.equals("paper") && computerChoice.equals("rock") ||
                   playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win! The computer chose " + computerChoice + ".");
        } else {
            System.out.println("You lose! The computer chose " + computerChoice + ".");
        }
    }
}
