package chaper07;

public class Person {

//	①이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	 String name;
	 String number;
//	②인사하는 메소드를 정의해봅시다. 
//	“안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.

	public Person(String name, String number) {
		this.name = name;
		this.number = number;

	}
	public Person() {

	}
	public void print(String name,String number) {
		System.out.println("저는" + name + "입니다." + number +"살 입니다.");
	}

	
}
