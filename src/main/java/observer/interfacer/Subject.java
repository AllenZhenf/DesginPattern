package observer.interfacer;

/**
 * 主题接口，添加删除通知观察者
 * @author szf
 *
 */
public interface Subject {
	 void addSubject(Observer o);
	 void removeSubject(Observer o);
	 void notifySubject();
}
