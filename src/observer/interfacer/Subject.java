package observer.interfacer;

/**
 * 主题接口，添加删除通知观察者
 * @author szf
 *
 */
public interface Subject {
	public void addSubject(Observer o);
	public void removeSubject(Observer o);
	public void notifySubject();
}
