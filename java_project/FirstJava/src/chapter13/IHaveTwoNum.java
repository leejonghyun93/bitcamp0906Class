package chapter13;

public class IHaveTwoNum {

	int num1;
	int num2;

	public void addOneNum1() {
		// ....
		// ....
		synchronized (this) {
			num1 += 1;
		}
		System.out.println("num1 + 1");
	}

	public void addTwoNum1() {
		synchronized(this) {
		num1 += 2;
		}
	}
	public void addOneNum2() {
		synchronized (key) {
			num2 += 1;
		}
	}
	public void addTwoNum2() {
		synchronized (key) {
			num2 += 2;
			
		}
	}
	
	
	public void ShowAllNumber() {
		System.out.println("num1 : " + num1);
		System.out.println("num1 : " + num2);
	}
	Object key = new Object();
}
