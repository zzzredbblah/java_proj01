package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double[] data = new double[5];		//�迭�� ���� 5�� ����
		//double data[] = new double[5]
	
	data[0] = 10.0;
	data[1] = 20.0;
	data[2] = 30.0;
	
	double total = 1;
	
	for(int i = 0; i < data.length; i++) {
		System.out.println(data[i]);
		total *= data[i] ;								// total = total * data[i]
	}
		System.out.println("total : " + total);			// �迭�� ����� ���� ���ϴ� ��� ������ �߻�
	
	}

}
