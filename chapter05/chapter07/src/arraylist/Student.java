package arraylist;

import java.util.ArrayList;

public class Student {

		int studentID;
		String studentName;
		ArrayList<Subject> subjectList;		//ArrayList ��ü�� Ÿ���� ����(�ش� ������ �̸��� ������ ���� ��ü�� �迭)
		
	public Student(int studentID, String studentName) {		//Student ������
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();		//new��� Ű���带 subject Ŭ������ ArrayList�� ����Ʈ 
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� ������ " +s.getName()+ " ���� ������ " +s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�Դϴ�.");
	}
		
	}

