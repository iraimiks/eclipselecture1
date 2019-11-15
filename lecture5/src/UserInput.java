import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		if (age < 18) {
			System.out.println("Please wait few years");
			System.out.println("Please wait few years");
			System.out.println("Please wait few years");
			System.out.println("Please wait few years");
			System.out.println("Please wait few years");
		} else {
			System.out.println("Welcome");
		}

	}

}
