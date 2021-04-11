package hw12_1;

public class Engine {

	int numberOfCylinders;

	public Engine(int i) {
		super();
		this.numberOfCylinders = i;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}

}
