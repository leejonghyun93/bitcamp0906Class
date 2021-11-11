package orderProjece12;

public class orders {

	private int productNumber; // 주문번호
	private int number;      // 번호표
	private int PurchaseDate;   // 구매일자
	private String material;// 재료명
	private int MaterialType;// 재료타입
	private int calorie;    // 칼로리
	
	public orders() {

	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPurchaseDate() {
		return PurchaseDate;
	}

	public void setPurchaseDate(int purchaseDate) {
		PurchaseDate = purchaseDate;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getMaterialType() {
		return MaterialType;
	}

	public void setMaterialType(int materialType) {
		MaterialType = materialType;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public orders(int productNumber, int number, int purchaseDate, String material, int materialType, int calorie) {
		
		this.productNumber = productNumber;
		this.number = number;
		this.PurchaseDate = purchaseDate;
		this.material = material;
		this.MaterialType = materialType;
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "orders [productNumber=" + productNumber + ", number=" + number + ", PurchaseDate=" + PurchaseDate
				+ ", material=" + material + ", MaterialType=" + MaterialType + ", calorie=" + calorie + "]";
	}

	public boolean equals(Object o) {
        if (o instanceof orders) {
        	orders b = (orders) o;
            if (productNumber == b.productNumber) {
                return true;
            }
        }
        return false;
    }

}
 
