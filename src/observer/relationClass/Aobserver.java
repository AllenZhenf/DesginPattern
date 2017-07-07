package observer.relationClass;

import observer.interfacer.DisplayElement;
import observer.interfacer.Observer;
import observer.interfacer.Subject;

public class Aobserver implements Observer, DisplayElement {
	private float tempture;
	private float humidity; 
	private Subject weathData;
	
	public Aobserver(WeathData weathData){
		this.weathData=weathData;
		weathData.addSubject(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ÎÂ¶È£º"+tempture+"\n"+"Êª¶È:"+humidity);
	}
	
	@Override
	public void update(float tempture,float humidity) {
		// TODO Auto-generated method stub
		this.tempture=tempture;
		this.humidity=humidity;
		display();
	}


}
