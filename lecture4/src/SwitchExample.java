public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int expression = 2;
		int result = 0;
		switch (expression) {
		case 1:
			result++;
			break;
		case 2:
			result++;
			break;
		case 3:
			result++;
			break;
		default:
			result++;
		}
		System.out.println(result);

		int result12 = 0;
		if (expression == 1) {
			result12++;
		} else if (expression == 2) {
			result12++;
		} else if (expression == 3) {
			result12++;
		} else {
			result12++;
		}

		System.out.println(result12);

	}

}
