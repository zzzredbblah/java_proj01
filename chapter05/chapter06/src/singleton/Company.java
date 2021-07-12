package singleton;

public class Company {
	
	private static Company instance = new Company();
	private Company() {}	//company ��ü�� New Ű���带 ���ؼ� �������� ���ϵ��� ����, ���� Ŭ���� �������� ����

	public static Company getInstance() {
		
		if(instance == null) {			//null : ����ִ�. ���� ������ ���� �ʴ� ����
			instance = new Company();
			
		}
		return instance;
	}
	
}
