package simpleFactory;

public class BMWFactory {
	public BMW createBMW(String type){
		BMW bmw=null;
		switch(type){
		case "520":bmw=new BMW520();
		break;
		case "530":bmw=new BMW530();
		break;
		}
		return bmw;
	} 
}
