package chaper05;

public class Exam02 {

	
//	1.Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, 
//	main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요. 
//	단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.
		

//	①아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
     
		String name; // 이름
		String phoneNumber; // 전화번호
		String major; // 전공
		int year;// 학년
		String email; // 이메일
		String birthday; // 생일
		String address;  // 주소
		
//		③모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	     public Exam02 (String name,
	    		        String phoneNumber,
	    		        String major,
	    		        int year,
	    		        String email, 
	    		        String birthday,
	    		        String address) {
	    	 this.name = name;
	    	 this.phoneNumber = phoneNumber;
	    	 this.major = major;
	    	 this.year = year;
	    	 this.email = email;
	    	 this.birthday = birthday;
	    	 this.address = address;
	    	 
	    	 
	     }
         public Exam02(String name,
 		               String phoneNumber,
 		               String major,
 		               int year,
 		               String email) {
 		   this(name,phoneNumber,major,year,email,"생일 정보 없음","주소 정보 없음");
         
	    	 	
         } 
         public Exam02(){
        	 
         }

	    	
	     
//	②위에서 정의한 정보를 출력하는 메소드 정의
    public void dateAll() {
	System.out.println("이름 :" + name);
	System.out.println("전화번호:"+ phoneNumber);
	System.out.println("전공:"+major);
	System.out.println("학년"+year);
	System.out.println("이메일:"+email);
	System.out.println("생일:"+birthday);
	System.out.println("주소:"+address);
}

    	 
     
//	④main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
    public static void main(String[] args) {
       Exam02 e1 = new Exam02("이종현","010-0000-0000","프로그래머",3,"aaa@naver.com","2000","서울");
	e1.dateAll();
	System.out.println("===========================");
    Exam02 e2 = new Exam02("이종현","010-0000-0000","프로그래머",3,"aaa@naver.com");
    e2.dateAll();
    }
}
