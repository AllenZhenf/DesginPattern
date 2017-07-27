package decorator;

import static org.junit.Assert.*;

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
