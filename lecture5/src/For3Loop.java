import java.util.Scanner;


public class For3Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times I should repeat?:");
		int iteration = scanner.nextInt();		
		for(int i = 0; i< iteration; i++){
			System.out.println("Repeat" + i);
		}

	}

}
