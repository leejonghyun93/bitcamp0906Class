package chapter11;

public class SimpleNumber {

	int num;
	
	SimpleNumber(int num){
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		// obj -> 형변한
		SimpleNumber sNum = (SimpleNumber)obj;
		if(sNum.num == this.num) {
			result = true;
		}
		return result;
	}
	@Override
	public int hashCode() {
	
		return super.hashCode();
	}
}
