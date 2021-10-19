package chaper07;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonMale per = new PersonMale();
		Female fem = new Female();
		
		per.print("이길동","26");
		fem.print("이동순","27");
		
		per.printf("남자");
		fem.print1("여자");
	}
}
