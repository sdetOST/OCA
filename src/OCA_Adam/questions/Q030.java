package questions;

public class Q030 {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				continue;
//				break;											// opt 1
//				System.out.println("Work done");			// opt 3
			}
			System.out.println("Work done");
			break;
//			continue;											// opt 2
		}
	}
}
