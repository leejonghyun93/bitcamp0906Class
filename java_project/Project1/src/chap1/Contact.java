package chap1;

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

	public Contact(String name,String phoneNumber,
			String email,String address,String birthday,String groub) {
	}

	public Contact() {
	}
   
    }
	

