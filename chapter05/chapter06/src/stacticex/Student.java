package stacticex;

public class Student {

	public static int serialNum = 1000;	//Ŭ���� ����(static����) >  ���α׷��� �ε� �� �� ����Ÿ ������ ���� 
										//(��� �ν��Ͻ����� ������ ����), ���α׷��� ����� �� ���� 
					
	int studentID;		//��� ����(�ν��Ͻ� ����) > �� ������ ����
	String studentName;	//��� ���� > new Ű���带 ���ؼ� �ν��Ͻ� ���� ��, �������� ������
	int grade;			//��� ���� > ������ �÷��Ϳ� ���ؼ� ���Ű� ��
	String address;		//��� ���� >�ٸ� �ν��Ͻ��� ������ �ȵǱ� ������ �� �ν��Ͻ� �������� ���
	/*
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	*/
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
	this.studentName = studentName;
}
/*
	public static int getSerialNum() {	//Ŭ���� �޼ҵ�, static �޼ҵ�
		int i = 10;
		//studentName = "aaa";
		return serialNum;
	}
	
	public static void setserialNum(int serialNum) {
	 this.serialNum = serialNum;
	
	}
	*/
}
