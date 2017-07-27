package decorator;

/**
 * 定义被装饰者
 * @author szf
 *
 */
public class DrinkDocorator extends Drink{
	
	public Drink drink;
	
	public DrinkDocorator(Drink drink){
		this.drink=drink;
	}

	@Override
	public double cost() {
		return 1.99;
	}
	
}
