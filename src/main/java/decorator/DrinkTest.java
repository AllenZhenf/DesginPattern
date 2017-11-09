package decorator;


import decorator.Drink;
import decorator.DrinkDocorator_first;
import decorator.DrinkDocorator_second;
import decorator.DrinkDocorator_third;
import org.junit.Test;

public class DrinkTest {

	@Test
	public void test() {
		Drink drink=new DrinkDocorator_first();
		System.out.println(drink.cost());
		Drink drink2=new DrinkDocorator_second(new DrinkDocorator_third(drink));
		System.out.println(drink2.cost());
	}

}
