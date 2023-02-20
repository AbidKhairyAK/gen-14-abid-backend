package tugas_luas_keliling_bangun_datar.model;

import tugas_luas_keliling_bangun_datar.model.wrapper.Shape;

public class Triangle extends Shape {
	private int sides;
	private int height;
	
	public Triangle (int sides, int height) {
		super("Segitiga", "cm");
		this.sides = sides;
		this.height = height;
		
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	@Override
	public void calculateArea () {
		double area = this.sides * this.height / 2;
		this.setArea(area);
	}

	@Override
	public void calculatePerimeter () {
		double perimeter = this.sides * 3;
		this.setPerimeter(perimeter);
	}
}
