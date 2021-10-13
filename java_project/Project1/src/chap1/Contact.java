package chap1;

public class Contact {
///
//	변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다. 
//	변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
//	변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
	private String name;
	private int phone;
	private String email;
	private String address;
	private int birthday;
	private String groub;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getGroub() {
		return groub;
	}

	public void setGroub(String groub) {
		this.groub = groub;
	}

// main()메소드를 정의합니다
	public static void main(String[] args) {

		// 연락처 데이터를 저장하는 인스턴스를 생성합니다
		Contact c = new Contact();
		c.name = "이종현";
		c.phone = 000 - 0000 - 0000;
		c.email = "aaaa@aaaa.com";
		c.address = "서울시";
		c.birthday = 12345678;
		c.groub = "회사";

// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.

//	인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다.
		System.out.println(c.getName());
		System.out.println(c.getPhone());
		System.out.println(c.getEmail());
		System.out.println(c.getAddress());
		System.out.println(c.getBirthday());
		System.out.println(c.getGroub());

//	 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다
		System.out.println("============	============");
		System.out.println("이름:" + c.getName());
		System.out.println("전화번호:" + c.getPhone());
		System.out.println("이메일:" + c.getEmail());
		System.out.println("주소:" + c.getAddress());
		System.out.println("생일:" + c.getBirthday());
		System.out.println("그룹:" + c.getGroub());
		System.out.println("========================");

// 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
		
// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다
		
// 인스턴스의 출력메소드를 다시 실행합니다
	}
	
}
