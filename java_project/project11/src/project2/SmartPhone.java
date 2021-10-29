package project2;

import java.util.Scanner;

import project1.Contact;

public class SmartPhone {
	private Contact[] contacts;
	private int cnt;

	public static Scanner sc = new Scanner(System.in);

	public SmartPhone(int size) {
		contacts = new Contact[size]; //
		cnt = 0;
	}

	public void addContact(Contact contact) {
		contacts[cnt++] = contact;
	}

	public void insertContact() {
		System.out.println("연락처 등록을 시작합니다.....");
		System.out.println("이름 >>");
		String name = sc.nextLine();

		System.out.println("전화번호 >>");
		String phoneNumber = sc.nextLine();

		System.out.println("이메일 >>");
		String email = sc.nextLine();

		System.out.println("주소 >>");
		String address = sc.nextLine();

		System.out.println("생일 >>");
		String birthday = sc.nextLine();

		System.out.println("그룹 >>");
		String group = sc.nextLine();

		addContact(new Contact(name, phoneNumber, email, address, birthday, group));
	}

}
