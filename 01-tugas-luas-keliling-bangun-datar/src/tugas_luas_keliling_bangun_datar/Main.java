package tugas_luas_keliling_bangun_datar;

import tugas_luas_keliling_bangun_datar.model.*;

public class Main {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(15, 9);
		Square square = new Square(7);
		Circle circle = new Circle(6);
		Rhombus rhombus = new Rhombus(8, 12, 10);
		
		System.out.print(triangle);
		System.out.print(square);
		System.out.print(circle);
		System.out.print(rhombus);
	}

}
