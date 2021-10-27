package Project1;

import java.util.Scanner;

public class Contact {
///
//	변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다. 
//	변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
//	변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String groub;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroub() {
		return groub;
	}

	public void setGroub(String groub) {
		this.groub = groub;
	}

	public Contact() {
	}

	public Contact(String name, String phoneNumber, String email, String address, String birthday, String groub) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.groub = groub;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Contact co = new Contact();
		 
		System.out.println("이름 : " +co.getName());
		System.out.println("전화번호 : " +co.getPhoneNumber());
		System.out.println("이메일: " +co.getEmail());
		System.out.println("주소 : " +co.getAddress());
		System.out.println("생일: " +co.getBirthday());
		System.out.println("그룹 : " +co.getGroub());
		
		
		// 정보 수정 메소드 출력
		
		System.out.println("===================");
		System.out.println("수정할 이름을 입력해주세요");
		System.out.print(">");
		co.setName(scanner.nextLine());
		
		System.out.println("수정할 전화번호를 입력해주세요");
		System.out.print(">");
		co.setPhone(scanner.nextLine());
		    
		System.out.println("수정할 이메일를 입력해주세요");
		System.out.print(">");
		co.setEmail(scanner.nextLine());
		
		System.out.println("수정할 주소를 입력해주세요");
		System.out.print(">");
		co.setAddress(scanner.nextLine());
		
		System.out.println("수정할 생일을 입력해주세요");
		System.out.print(">");
		co.setBirthday(scanner.nextLine());
		
		System.out.println("수정할 그룹을 입력해주세요");
		System.out.print(">");
		co.setGroub(scanner.nextLine());
		
		System.out.println("이름 : " +co.getName());
		System.out.println("전화번호 : " +co.getPhoneNumber());
		System.out.println("이메일: " +co.getEmail());
		System.out.println("주소 : " +co.getAddress());
		System.out.println("생일: " +co.getBirthday());
		System.out.println("그룹 : " +co.getGroub());
	}
}
