package hiding;

public class StudentTEst {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��";
			//���۷��� ������ ���� �Ҵ�
		
		studentLee.studentID = 20210728;
		
		studentLee.setStudentName("�̻��");
			//setter�� ���ؼ� �Ҵ�
		
		System.out.println(studentLee.getStudentName());
	}
	}
