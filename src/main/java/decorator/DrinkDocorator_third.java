package decorator;

public class DrinkDocorator_third extends DrinkDocorator_first{
	Drink drink;
	
	public DrinkDocorator_third(Drink drink) {
		this.drink=drink;
	}

	@Override
	public double cost() {
		return drink.cost()+0.99;
	}

}
