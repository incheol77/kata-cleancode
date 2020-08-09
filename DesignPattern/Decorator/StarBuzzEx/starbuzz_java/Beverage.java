package starbuzz_java;

public abstract class Beverage {
	String description = "No title";

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}
