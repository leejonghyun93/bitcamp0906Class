package Project6;

public class SmartPhoneMain {

	public static void main(String[] args) {
		// ①SmartPhone 클래스의 인스턴스를 생성합니다.
		SmartPhone phone = new SmartPhone(10);

		while (true) {

			System.out.println("### 전화번호관리 프로그램 ###");
			System.out.println("1. 회사 동료 전화번호 등록");
			System.out.println("2. 고객사 담당자 전화번호 등록");
			System.out.println("3. 전화번호 검색 (이름으로 검색)");
			System.out.println("4. 전화번호 삭제 (이름으로 검색)");
			System.out.println("5. 전화번호 수정 (이름으로 검색)");
			System.out.println("6. 전화번호 전체 출력");
			System.out.println("7. 전화번호 간단 정보 전체 출력"); 
 			System.out.println("8. 프로그램 종료"); 
			System.out.println("메뉴 선택하세요 >>>>>>>>>>>>>>> "); 
						 

			int select = 0;

			// 1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리 합시다.
			try {
				select = Integer.parseInt(SmartPhone.sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("정상적인 메뉴 번호가 입력되지 않았습니다. 확인 후 다시 입력해주세요.");
				continue;
			}
			switch (select) {
			case 1:
			case 2:
				phone.insertContact(select);
				break;
			case 3:
				phone.searchPrint();
				break;
			case 4:
				phone.deleteContact();
				break;
			case 5:
				phone.editContact();
				break;
			case 6:
				phone.printAllData();
				break;
			case 7:
				phone.printAllSimpleData();
				break;
			case 8:
				System.out.println("프로그램을 종료합니다.");
				// return;
				System.exit(0);

			default:
				System.out.println("해당하는 메뉴 번호가 없습니다. 다시 확인후 선택해주세요.");
			}

		}
	}

}
