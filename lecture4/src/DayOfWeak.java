import java.util.Scanner;

public class DayOfWeak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert day index:");
		int dayIndex = scanner.nextInt();		

		switch (dayIndex) {
		case 5:
			System.out.println("Friday");
		case 4:
			System.out.println("Thursday");
		case 3:
			System.out.println("Wednsday");
		case 2:
			System.out.println("Tuesday");
		case 1:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Unimplemented part, for dayIndex=" + dayIndex);
		}
	}
}
