package shape;

public class Square extends Shape{
	int length;
	public Square(int i) {
		length = i;
	}

	public double getLength(int i){
		return 4*length;
	}

}
