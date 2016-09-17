package shapes;

public class Triangle extends Shape {
	//Area = (b*h)/2
	
	private double base;
	private double height;
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}

	@Override
	public double getArea() {
		return 0;
	}
}
