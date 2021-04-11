package hw12_1;

import java.util.Arrays;

public class Car {
	private int numberOfHorsepower;
	private int yearOfManufacture;
	private Helm helm;
	private Engine engine;

	public Car(int i, int j, Helm helm, Engine engine) {
		super();
		this.numberOfHorsepower = i;
		this.yearOfManufacture = j;
		this.helm = helm;
		this.engine = engine;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public Helm getHelm() {
		return helm;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [numberOfHorsepower=" + numberOfHorsepower + ", yearOfManufacture=" + yearOfManufacture + ", helm="
				+ helm + ", engine=" + engine + "]";
	}

}
