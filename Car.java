
public class Car {

	private String name;
	private String color;
	private int year;
	private Boolean SUV;
	private String model;
		

public Car() {}
	
public Car(String name, String color) {
	this.name = name;
	this.color = color;
	}

	public Car(String name, String color, int year) {
	this.name = name;
	this.color = color;
	this.year = year;
	}

	public String getName() {
		return this.name;
	}
		public String getColor() {
			return this.color;
		}
		public int getYear() {
			return this.year;
		}
			public void setName() {
				this.name = name;
			}
				public void setColor() {
				this.color = color;
				}
				
	public Boolean SUV() {
		return this.SUV; 
	}
						
	public String model() {
		return this.model; 
	}
			
	}