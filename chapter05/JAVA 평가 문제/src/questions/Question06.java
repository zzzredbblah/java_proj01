package questions;

public class Question06 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {4,5,1,2,3};
		
		for(int i = 0; i <= 5; i++) {
			if(i > max)
				max = i;
		}
		
		
		System.out.println("max: " + max);
	}

}
