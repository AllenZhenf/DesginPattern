package state;

public class StopState implements State {
	
	@Override
	public void action(Context context) {
		System.out.println("state is stop");
		context.setState(this);
	}
	
	public String toString(){
		return "stop state";
	}
	
}
