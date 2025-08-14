import java.util.Scanner;

public class StonePaperScissor {
    // Constants for moves
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                boolean playAgain = true;

                while (playAgain) {
                    System.out.println("\n=== Rock Paper Scissors ===");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");
                    System.out.print("Enter your move (1-3): ");

                    int human = sc.nextInt();

                    // Validate input
                    if (human < ROCK || human > SCISSORS) {
                        System.out.println("Invalid move. Please try again!");
                        continue; // skip to next loop
                    }

                    // Display human choice
                    System.out.println("You chose: " + moveName(human));

                    // Generate computer move
                    int computer = (int) (Math.random() * 3) + 1;
                    System.out.println("Computer chose: " + moveName(computer));

                    // Decide winner
                    if (human == computer) {
                        System.out.println("It's a tie!");
                    } else if (
                            (human == ROCK && computer == SCISSORS) ||
                                    (human == PAPER && computer == ROCK) ||
                                    (human == SCISSORS && computer == PAPER)
                    ) {
                        System.out.println("🎉 You win!");
                    } else {
                        System.out.println("💻 Computer wins!");
                    }

                    // Ask to play again
                    System.out.print("Do you want to play again? (y/n): ");
                    char choice = sc.next().toLowerCase().charAt(0);
                    if (choice != 'y') {
                        playAgain = false;
                    }
                }

                System.out.println("Thanks for playing! 👋");
                sc.close();
            }

            // Helper method to get move name
            private static String moveName(int move) {
                return switch (move) {
                    case ROCK -> "Rock";
                    case PAPER -> "Paper";
                    case SCISSORS -> "Scissors";
                    default -> "Unknown";
                };
            }
    }

