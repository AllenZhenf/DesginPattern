package observer.relationClass;


import observer.interfacer.DisplayElement;
import observer.interfacer.Observer;
import observer.interfacer.Subject;

public class Bobserver implements Observer, DisplayElement {
	private float tempture;
	private float humidity; 
	private Subject weathData;
	
	public Bobserver(WeathData weathData){
		this.weathData=weathData;
		weathData.addSubject(this);
	}
	@Override
	public void display() {
		System.out.println("ÎÂ¶È£º"+tempture+"\n"+"Êª¶È:"+humidity);
	}
	
	@Override
	public void update(float tempture,float humidity) {
		this.tempture=tempture;
		this.humidity=humidity;
		display();
	}
}
