package observer.relationClass;


import observer.interfacer.DisplayElement;
import observer.interfacer.Observer;
import observer.interfacer.Subject;

/**
 * 具体观察者
 * @author szf
 *
 */
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
		System.out.println("温度："+tempture+"\n"+"湿度:"+humidity);
	}
	
	@Override
	public void update(float tempture,float humidity) {
		this.tempture=tempture;
		this.humidity=humidity;
		display();
	}


}
