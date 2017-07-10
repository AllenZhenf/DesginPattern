package observer.interfacer;

/**
 * 观察者接口，不过一旦需要修改参数会引起一系列变动
 * @author szf
 *
 */
public interface Observer {
	public void update(float tempture,float humidity);
}
