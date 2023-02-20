package tugas_luas_keliling_bangun_datar.model;

import tugas_luas_keliling_bangun_datar.model.wrapper.Shape;

public class Rhombus extends Shape {

	private int sides;
	private int diagonal1;
	private int diagonal2;
	
	public Rhombus (int sides, int diagonal1, int diagonal2) {
		super("Belah Ketupat", "cm");
		this.sides = sides;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	@Override
	public void calculateArea () {
		double area = (this.diagonal1 * this.diagonal2) / 2;
		this.setArea(area);
	}

	@Override
	public void calculatePerimeter () {
		double perimeter = this.sides * 4;
		this.setPerimeter(perimeter);
	}
}
