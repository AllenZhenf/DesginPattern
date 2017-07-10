package observerByUtil;

import java.util.Observable;
import java.util.Observer;

import observer.interfacer.DisplayElement;
import observer.interfacer.Subject;

public class Cobserver implements Observer,DisplayElement{
	private float tempture;
	private float humidity; 
	private WeathDataByUtil weathData;
	
	public float getTempture() {
		return tempture;
	}

	public void setTempture(float tempture) {
		this.tempture = tempture;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public Cobserver(Observable o){
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		weathData=(WeathDataByUtil) o;
		this.tempture=weathData.getTempture();
		this.humidity=weathData.getHumidity();
		 display();
	}

	@Override
	public void display() {
		System.out.println("ÎÂ¶È£º"+tempture+"\n"+"Êª¶È:"+humidity);
	}
	
}
