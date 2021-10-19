package chaper08;

 class Calulator11 implements Calulator {
//1.Calulator 인터페이스를 상속하는 추상 클래스를 정의해봅시다.

//	2.Calulator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의해봅시다.

//	3.다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 
//	인스턴스를 참조하는 코드를 작성해 봅시다.
	
	long n1;
	long n2;

	public Calulator11() {

	}
	

	@Override
	public long add(long n1, long n2) {

		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {

		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {

		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {

		return n1 / n2;
	}

	public static void main(String[] args) {

		
		Calulator11 cq = new Calulator11();
		
		System.out.println(cq.add(5,3));
		System.out.println(cq.substract(5,3));
		System.out.println(cq.multiply(5,3));
		System.out.println(cq.divide(5,3));
		
	}

}
