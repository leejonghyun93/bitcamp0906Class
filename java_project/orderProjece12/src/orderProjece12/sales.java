package orderProjece12;

public class sales {

	 private String  productName; //  판매 상품명
	 private int quantity; // 판매 상품  갯수
	 private int price;  // 판매 상품 가격
	 private int calorie;    // 칼로리
	 private String type;   // 상품타입
	 
	public sales() {
		
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public sales(String productName, int quantity, int price, int calorie, String type) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.calorie = calorie;
		this.type = type;
	}

	@Override
	public String toString() {
		return "sales [productName=" + productName + ", quantity=" + quantity + ", price=" + price + ", calorie="
				+ calorie + ", type=" + type + "]";
	}

	public boolean equals(Object o) {
	        if (o instanceof sales) {
	        	sales b = (sales) o;
	            if (productName == b.productName) {
	                return true;
	            }
	        }
	        return false;
	    }

	}
	 


