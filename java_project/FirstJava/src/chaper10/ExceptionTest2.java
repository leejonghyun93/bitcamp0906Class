package chaper10;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Object o = new String("abc");
		String str = null;

		String number = "one";
		try {
			// 배열 인덱스를 잘못 처리한 경우
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생!!!");
			System.out.println(e.getMessage());
		}
		try {
		Integer i = (Integer) o;
		} catch(ClassCastException e) {
			System.out.println("예외 발생!!!");
			System.out.println(e.getMessage());
		}
		int size = -10;
		try {
		int[] arr1 = new int[-10];
		} catch(NegativeArraySizeException e) {
			System.out.println("예외 발생!!!");
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(str.toUpperCase());
			
		} catch (NullPointerException e) {
			System.out.println("예외 발생!!!");
			System.out.println(e.getMessage());
		}
		
		try {
			// String -> int
			int temp = Integer.parseInt(number);
			
		} catch(NumberFormatException e) {
			System.out.println("예외 발생!!!");
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(num1 / num2);
		}catch(Excetion e) {
			System.out.println("예외!!!");
		}catch(ArithmeticExceptione e) {
			System.out.println("0으로 나눌수 있습니다.");
			System.out.println("0으로 나눌수 있습니다.");
		}

		System.out.println("프로그램을 종료합니다.");
	}
}
