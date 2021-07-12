package thisex;

class Person{
	String name;
	int age;
	
	Person(){
		this("�̸� ����", 1);		//this�� �̿��� Person(String,int) ȣ��
								//�����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
	}
	
	Person(String name, int age){		//�޼ҵ��� �����̸��� ��ü ���� �̸��� ������ ���
		this.name = name;				//��ü ���� �̸� �տ� this 
		this.age = age;
	}
	Person returnItSelf() {
		return this;		//this ��ȯ
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
