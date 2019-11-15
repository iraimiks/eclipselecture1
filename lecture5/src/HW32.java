import java.util.Scanner;


public class HW32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		
	
		int triangleSize = scanner.nextInt();
		
		for(int rowIndexi=1; rowIndexi<= triangleSize; rowIndexi++){
//			System.out.println("");
			for(int j=1; j<=rowIndexi; j++){
				System.out.print(rowIndexi);
			}
			
		}
		

	}

}
