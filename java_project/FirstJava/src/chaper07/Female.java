package chaper07;

public class Female extends Person {

	String woman;

	public Female(String name, String number, String woman) {
		super(name, number);
		this.woman = woman;

	}

	public Female() {
	}

	@Override
	public void print(String name, String number) {
	
		super.print(name, number);
	}

	public void print1(String woman) {
		System.out.println("저는" + woman + "입니다.");
	}
}
