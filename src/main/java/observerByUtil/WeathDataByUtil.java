package observerByUtil;

import java.util.Observable;

public class WeathDataByUtil extends Observable{
	private float tempture;
	private float humidity;
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
	public void setMeasurement(float tempture,float humidity){
		this.tempture=tempture;
		this.humidity=humidity;
		setChanged();
		notifyObservers();
	}
}	
