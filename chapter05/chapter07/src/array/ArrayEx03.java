package array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		long total = 1;
		
		for (int i = 0, num = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
				total *= arr[i][j];
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println(total);	//1~20�� ���� ��
		System.out.println();
		System.out.println("���� ���̴� : " + arr.length);
		System.out.println("���� ���̴� : " + arr[3].length);	
	}
}