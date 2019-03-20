package shape;

public class Circle extends Shape{
	int radius;
	public Circle(int i) {
		radius = i;
	}

	public double getLength(int i){
		return 2*Math.PI*radius;
	}

}
