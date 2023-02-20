package tugas_luas_keliling_bangun_datar.model.wrapper;

public abstract class Shape {

	private String name;
	private String unit;
	private double area;
	private double perimeter;
	
	public Shape(String name, String unit) {
		super();
		this.name = name;
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		String areaMessage = "Luas " + this.name + ": " + this.area + " " + this.unit;
		String perimeterMessage = "Keliling " + this.name + ": " + this.perimeter + " " + this.unit;
		String result = areaMessage + "\n" + perimeterMessage + "\n\n";
		return result;
	}

	public void calculateArea () {}
	public void calculatePerimeter () {}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
