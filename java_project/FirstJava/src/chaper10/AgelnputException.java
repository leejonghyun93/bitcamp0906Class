package chaper10;

public class AgelnputException extends Exception {

	
	public AgelnputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
	public AgelnputException(int age) {
		super(age + "는 유효한 나이 정보가 아닙니다.");
	}
	public void print() {
		System.out.println("예외 클래스에 정의한 메소드 입니다.");
	}
}
