package starbuzz_java;

public class StarBuzzMain {
	public static final int TOTAL_COFFEE = 6;

	public static void main(String[] args) {
		double orderSum = 0;
		Beverage[] coffee = new Beverage[TOTAL_COFFEE];

		coffee[0] = new Espresso();
		coffee[1] = new Decaf();
		coffee[2] = new HouseBlend();
		coffee[3] = new DarkRoast();
		coffee[4] = new Mocha(new Milk(new DarkRoast()));
		coffee[5] = new Whip(new Soy(new Mocha(new HouseBlend())));

		for (int i = 0; i < TOTAL_COFFEE; i++) {
			double cost = coffee[i].cost();
			orderSum += cost;
			String order = coffee[i].getDescription() + " : $" + cost;
			System.out.println(order);
		}
		System.out.println("-----------------");
		System.out.println("Sum : $" + Math.round(orderSum * 1000)/1000.0);

	}
}
