import java.util.Scanner;

public class UserInoutTask1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		double input =  scanner.nextDouble();
		if (input < 0) {
			System.out.println(input + " is negative");
		} else {
			System.out.println(input + " is positive");
		}

	}

}
