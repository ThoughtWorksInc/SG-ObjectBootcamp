package shapes;

public class Rectangle extends Shape {
	//Area = w*h
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}

	@Override
	public double getArea() {
		return 0;
	}
}
