package tugas_luas_keliling_bangun_datar.model;

import tugas_luas_keliling_bangun_datar.model.wrapper.Shape;

public class Circle extends Shape {
	private int radius;
	
	public Circle (int radius) {
		super("Lingkaran", "cm");
		this.radius = radius;
		
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	@Override
	public void calculateArea () {
		double area = Math.PI * Math.pow(this.radius, 2);
		this.setArea(area);
	}

	@Override
	public void calculatePerimeter () {
		double perimeter = 2 * Math.PI * this.radius;
		this.setPerimeter(perimeter);
	}
}
