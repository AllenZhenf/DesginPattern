package observer.interfacer;

/**
 * ����ӿڣ����ɾ��֪ͨ�۲���
 * @author szf
 *
 */
public interface Subject {
	public void addSubject(Observer o);
	public void removeSubject(Observer o);
	public void notifySubject();
}
