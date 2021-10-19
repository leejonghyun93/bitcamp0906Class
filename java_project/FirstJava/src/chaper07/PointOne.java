package chaper07;

public class PointOne  implements UpperCasePrintable {

	private int xPos;
	private int yPos;
	
	PointOne(int x,int y){
		xPos = x;
		xPos = y;
	}

	@Override
	public String toString() {
		return "PointOne [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
}
