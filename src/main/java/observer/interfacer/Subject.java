package observer.interfacer;

/**
 * ����ӿڣ����ɾ��֪ͨ�۲���
 * @author szf
 *
 */
public interface Subject {
	 void addSubject(Observer o);
	 void removeSubject(Observer o);
	 void notifySubject();
}
