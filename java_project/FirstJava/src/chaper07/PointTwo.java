package chaper07;

import java.io.Serializable;

public class PointTwo implements Serializable {
 
	private int xPos;
	private int yPos;
	
	PointTwo(int x , int y){
		xPos = x;
		yPos = y;
		
	}

	@Override
	public String toString() {
		return "PointTwo [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
}

