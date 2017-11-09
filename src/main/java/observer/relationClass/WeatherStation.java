package observer.relationClass;


import observerByUtil.Cobserver;
import observerByUtil.WeathDataByUtil;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WeathData weathData=new WeathData();
//		Aobserver a=new Aobserver(weathData);
//		Bobserver b=new Bobserver(weathData);
		WeathDataByUtil weathData=new WeathDataByUtil();
		Cobserver c=new Cobserver(weathData);
		weathData.setMeasurement(35,87);
		weathData.setMeasurement(33,88);
	}

}
