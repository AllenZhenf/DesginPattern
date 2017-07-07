package observer.relationClass;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeathData weathData=new WeathData();
		Aobserver a=new Aobserver(weathData);
		Bobserver b=new Bobserver(weathData);
		weathData.setMeasurement(35,87);
		weathData.setMeasurement(33,88);
	}

}
