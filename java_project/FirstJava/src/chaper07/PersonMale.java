package chaper07;

public class PersonMale extends Person{
//	2.Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//	①각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	String man; 		
	
	public PersonMale(String name,String number,String man){
		super(name,number);
		this.man = man;
		
	}
	public PersonMale(){
	}
	
	@Override
	public void print(String name, String number) {

		super.print(name, number);
	}
	public void printf(String man) {
		System.out.println("저는" + man+ "입니다." );
			}
		
				
}
//	②각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	③Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//	④Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.


