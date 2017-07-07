package observer.relationClass;

import java.util.ArrayList;
import java.util.List;

import observer.interfacer.Observer;
import observer.interfacer.Subject;

public class WeathData implements Subject {
	private float tempture;
	private float humidity; 
	private List<Observer> observerlist=new ArrayList<Observer>();
	
	@Override
	public void addSubject(Observer o) {
		// TODO Auto-generated method stub
		observerlist.add(o);
	}

	@Override
	public void removeSubject(Observer o) {
		// TODO Auto-generated method stub
		int i=observerlist.indexOf(o);
		if(i>0)observerlist.remove(i);
	}

	@Override
	public void notifySubject() {
		// TODO Auto-generated method stub
		for(Observer o:observerlist){
			o.update(tempture, humidity);
		}
	}
	public void measurementChanged(){
		notifySubject();
	}
	
	public void setMeasurement(float tempture,float humidity){
		this.tempture=tempture;
		this.humidity=humidity;
		measurementChanged();
	}
}
