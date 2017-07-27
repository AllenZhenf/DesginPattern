package decorator;

public class DrinkDocorator_second extends DrinkDocorator_first{
	Drink drink;
	
	public DrinkDocorator_second(Drink drink) {
		this.drink=drink;
	}

	@Override
	public double cost() {
		return drink.cost()+0.99;
	}

	
}
