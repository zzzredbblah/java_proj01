package stacticex;

public class Student2 {
	private static int serialNum = 1000;
		//�ܺ� Ŭ�������� ���� ����, setter���� ���� �� �Ҵ�, getter���� ���� �� ���
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;	 //���� ������ ����. �޼ҵ尡 ������ ������ �Ҹ�
					//static Ű���尡 �� �޼ҵ�� �������(�ν��Ͻ� ����)�� ����� ���� ����(�޸𸮸� ����ϴ°� �޶�)
			//studentName = "aaa";   > ������ ����.
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
