package shapes;

public class Square extends Shape {
	// Area = x^2
	
	private double sideLength;
	
	public Square(double sideLength){
		this.sideLength = sideLength;
	}
	
	public double getSideLength(){
		return sideLength;
	}

	@Override
	public double getArea() {
		return Math.pow(sideLength, 2);
	}
}
