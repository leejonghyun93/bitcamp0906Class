package chaper06.score;

public class Student {

	private String name;

	private int korScore;
	private int engScore;
	private int mathScore;

	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public Student() {
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	// 총점을 구하는 메소드
	public int getSum() {
		return this.korScore + this.engScore + this.mathScore;
	}

	// 평균을 구하는 메소드
	public float getAvg() {
		return getSum() / 3.0f;
	}

	@Override
	public String toString() {
		return name + "\t" + korScore + "\t" + engScore + "\t" + mathScore + "\t" + getSum() + "\t" + getAvg();
	}

}
