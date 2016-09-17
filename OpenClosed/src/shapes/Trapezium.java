package shapes;

public class Trapezium extends Shape {
	//Area = ((b+t)/2) * h
	
	private double base;
	private double top;
	private double height;
	
	public Trapezium(double base, double top, double height){
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getTop(){
		return top;
	}
	
	public double getHeight(){
		return height;
	}

	@Override
	public double getArea() {
		return 0;
	}
}
