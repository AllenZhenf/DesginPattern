package simpleFactory;



public class Test {

	@org.junit.Test
	public void test() {
		BMWFactory bmw=new BMWFactory();
		BMW b1= bmw.createBMW("520");
		BMW b2=bmw.createBMW("530");
	}

}
