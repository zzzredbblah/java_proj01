package reference;

public class Student4 {
	int studentID;			//�⺻ �ڷ���
	String studentName;		//���� �ڷ���(��ü �ڷ���), �ڹٿ��� �⺻ �����Ǵ� ��ü�� Ÿ���� ����Ÿ����
	
	Subject korean;		//���� �ڷ���(����ڰ� ������ ��ü�� �ڷ���)
	Subject math;		//���� �ڷ��� (����� ���� ��ü�� �ڷ���)

	public Student4(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score)
	{
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score)
	{
		math.subjectName = name;
		math.scorePoint = score;
	}
	public void showStudentInfo() 
	{
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�.");
	}
}
