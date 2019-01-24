import java.util.InputMismatchException;
import java.util.Scanner;

public class Labs8 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String[] names = { "Lauren", "Kim", "Jim", "Jeff", "Sully", "Ziggy", "Jake" };

		String[] hometown = { "Grosse Pointe, MI", "Rochester, MI", "Grosse Pointe, MI", "Grosse Pointe, MI",
				"Detroit, MI", "Kalamazoo, MI", "Rochester, MI" };
		String[] favoriteFood = { "Mashed Potatoes", "Pizza", "Steak", "Chicken", "Turkey", "Pot Roast", "Pizza" };
		String cont = "yes";

		System.out.println("Welcome to our Java class!");

		while (cont.equalsIgnoreCase("yes")) {

			try {
				System.out.println("Which student would you like to learn more about? (enter a number 1-7)");
				int userNum = scnr.nextInt();
				int index = userNum - 1;

				if (userNum >= 1 && userNum <= 7) { // validating num1 is between 1 and 7

					System.out.println(
							"Student " + userNum + " is " + names[index] + ". What would you like to know about "
									+ names[index] + "? (Enter \"hometown\" or \"favorite food\"):");
					scnr.nextLine();
					String userInput = scnr.nextLine();

					if (userInput.equalsIgnoreCase("hometown")) {

						System.out.println(names[index] + " is from " + hometown[index]
								+ ". Would you like to know more? (enter yes or no)");

						cont = scnr.next();

					}

					else if (userInput.equalsIgnoreCase("favorite food")) {

						System.out.println(names[index] + "'s favorite food is " + favoriteFood[index]
								+ ". Would you like to know more? (enter yes or no)");

						cont = scnr.next();

					} else {
						System.out.println(
								"That data does not exist. Please try again. (Enter \"hometown\" or \"favorite food\"):");
					}

				} else {
					System.out.println("That student does not exist. Please try again.");

				}

			} catch (IndexOutOfBoundsException e) {
				scnr.nextLine();
				System.out.println("An error has occured");
				e.printStackTrace();
			} catch (IllegalArgumentException l) {
				scnr.nextLine();
				System.out.println("An error has occured");
				l.printStackTrace();
			} catch (InputMismatchException m) {
				System.out.println("An error has occured....");
				m.printStackTrace();
			}
		}
		System.out.println("Goodbye!");

	}

}
