package orderProjece12;

public class SQLQuery {
	
	// DAO 에 쓰이는 SQL 문을 모아놓은 메모장

	public static final String showHambuerger = "select s_name, s_price, s_Cal from VW_ALL where s_type = 'Hamberger'";
	public static final String showBeverage = "select s_name, s_price, s_Cal from VW_ALL where s_type = 'Beverage'";
	
	
    public static final String showBeverageForTheOld = "select s_name, s_Price from Sales where (s_name = 'Americano' or s_name = 'Coke' or s_name = 'OrangeJuice')";
    public static final String showSideForTheOld = "select s_name, s_Price from Sales where (s_name = 'snackWrap' or s_name = 'CheeseStick' or s_name = 'ChickenNugget')";
    public static final String showSignatureBurger = "select s_name, s_price, s_Cal from VW_ALL where s_type = 'Signature'";
    public static final String CreateTicket = "select Ticket_sequence.nextVal from dual";
   
    
    public static final String showHamburgerForTheOld = "select * from Sales where (s_name = 'BulgogiBurger' or s_name = 'ChickenBurger'  or s_name = 'ShrimpBurger' or s_name ='CheeseBurger')"; 
    public static final String INSERT_ORDER_INFO = "insert into HamOrder values (?,?,?,?,?,?)"; // 번호표, 판매일자, 연령대 , 매장식사, 테이블서비스, 상품번호
    public static final String SHOW_SIDE = "select * from sales where s_type = 'Side' ";
    public static final String SHOWRECOMMENDED ="select * from sales where s_type = 'Signature'"; // 추천메뉴는 시그니처 버거로 합니다.
}