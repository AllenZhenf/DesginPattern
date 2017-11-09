package state;

public class StartState implements State {

	@Override
	public void action(Context context) {
		System.out.println("state is start");
		context.setState(this);
	}

	public String toString(){
		return "start state";
	}

}
