package array;

public class ArrayTest4 {

	public static void main(String[] args) {

		double[] data = new double[5];		//�迭�� ���� 5�� ����
		//double data[] = new double[5]
	
	int size = 0;
		
	data[0] = 10.0; size++;
	data[1] = 20.0; size++;
	data[2] = 30.0; size++;
	
	double total = 1;
	
	for(int i = 0; i < size ; i++) {
		System.out.println(data[i]);
		total *= data[i] ;								// total = total * data[i]
	}
		System.out.println("total : " + total);			// �迭�� ����� ���� ���ϴ� ��� ������ �߻�
		
	}

}
