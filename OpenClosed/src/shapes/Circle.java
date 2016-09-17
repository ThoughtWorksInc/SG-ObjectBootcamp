package shapes;

public class Circle extends Shape {
	// Area = pi*r^2
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
