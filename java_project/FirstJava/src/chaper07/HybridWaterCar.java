package chaper07;

public class HybridWaterCar extends HybridCar{

	int waterGuage;
	
	HybridWaterCar(int gasolinegauge,int electrongcGauge,int waterGuage){
		super(gasolinegauge,electrongcGauge); // 2.상위 클래스의 생성자 호출
		this.waterGuage=waterGuage;
	}

	public static void main(String[] args) {
		HybridWaterCar hdCar = new HybridWaterCar(10,20,30);// 1.생성자 호출
	}
	
	}
	class HybridCar extends Car {
		
		int electrongcGauge;
		
		// 상속관계에서 상위 클래스에 생성자가 존재하면 생성자 호출 해주어야 한다.
		// 상위 클래스의 변수를 초기화 해야하기 때문에 초기화할 값을 받아서 상위 클래스의 생성자를 호출 
		HybridCar(int gasolinegauge,int glectronicGauge){
			super(gasolinegauge);
			this.electrongcGauge = electrongcGauge;
			
		}
		
	}
	
	class Car {
		int gasolinegauge;
		
		// Car 클래스의 변수를 초기화 하는 생성자
		Car(int gasolinegauge){
			this.gasolinegauge = gasolinegauge;
		}
	}

