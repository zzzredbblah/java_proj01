package reference;

public class Subject {
	
	String subjectName;		//���� (����, ����, ����, etc)
	int scorePoint;			//���� (���� ����, ���� ����, ���� ����, etc)

	public void setKorea (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}

}
