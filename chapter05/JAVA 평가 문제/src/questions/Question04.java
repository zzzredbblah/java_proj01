package questions;

public class Question04 {

	public static void main(String[] args) {
		int line = 4;
		int stars = 1;
		
		for(int i = 0; i < line; i++) {
			for (int j = 0; j < stars; j++) {		
				System.out.print('*');
		}
			stars += 1;
			System.out.println();
	}

}
}
