package tugas_luas_keliling_bangun_datar.model;

import tugas_luas_keliling_bangun_datar.model.wrapper.Shape;

public class Square extends Shape {
	private int sides;
	
	public Square (int sides) {
		super("Persegi", "cm");
		this.sides = sides;
		
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	@Override
	public void calculateArea () {
		double area = this.sides * this.sides;
		this.setArea(area);
	}

	@Override
	public void calculatePerimeter () {
		double perimeter = this.sides * 4;
		this.setPerimeter(perimeter);
	}
}
