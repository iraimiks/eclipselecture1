public class Conditions {

	public static void main(String[] args) {

		// boolean isWithinTown = true;
		// boolean isHighway = true;
		// int maxSpeed;
		//
		// if (isWithinTown){
		// maxSpeed = 50;
		// }else if(isHighway){
		// maxSpeed = 110;
		// }else{
		// maxSpeed = 90;
		// }
		// System.out.println("Max speed="+ maxSpeed);

		int a = 1;
		short b = 1;
		int c = 0;

		boolean b1 = a == b;
		boolean b2 = b != c;
		boolean b3 = a > c;

		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);
		
		if (b1 && b2 && b3) {
			System.out.println("Success!");
		} else {
			System.out.println("Something wrong");
		}

	}
}
