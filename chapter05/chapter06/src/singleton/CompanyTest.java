package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//Company instance2 = new Company(); > �ܺο��� ���� �����Ͽ� ������
		Company myCompany1 = Company.getInstance();	
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
