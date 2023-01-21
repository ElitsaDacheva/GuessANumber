import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Random randomNum = new Random();
		int computerNum = randomNum.nextInt(100);
		int countTry = 0;

		while (true) {
			System.out.println("Guess a number (1-100): ");
			String input = scanner.nextLine();
			int playerNum;

			boolean isValid = true;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) < 48 || input.charAt(i) > 57) {
					isValid = false;
					break;
				}
			}
			if (isValid) {
				playerNum = Integer.parseInt(input);
				countTry++;
				if (playerNum == computerNum) {
					System.out.println("Congratulations! You guess the number.");
					System.out.println("Your tries to guess is " + countTry);
					break;
				} else if (playerNum > computerNum) {
					System.out.println("Your turn is higher.");
				} else  {
					System.out.println("Your turn is lower.");
				}
			}
			else {
				System.out.println("Invalid input. Try again with enter the number.");
			}
		}
	}
}
