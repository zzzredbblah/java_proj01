package reference;

public class Student3 {
	int studentID;			//�й�
	String studentName;		//�̸�
	
	Subject korean;		//������ �ڷ��� (subject Ŭ����) ���� ���� / ����
	Subject math;		//������ �ڷ��� (subject Ŭ����) ���� ���� / ����
	
	public Student3() {
		korean = new Subject();
		math = new Subject();
		}
	public void setKorea(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
		}
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
}