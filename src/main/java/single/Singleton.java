package single;

/**
 * ����ģʽ
 * @author szf
 *
 */
public class Singleton {
	/**
	 * 1������������ʱ������������죬�̰߳�ȫ���ÿռ任ʱ��
	 * 2������������ʱ�죬�������������̲߳���ȫ����ʱ�任�ռ�
	 */
	
	//����ģʽ ��һ�����ͼ���
	/*private Singleton(){};	
	
	private static Singleton single=new Singleton(); 
	
	public static Singleton getInstance(){
		return single;
	}*/
	
	
	//����ģʽ
	private Singleton(){};
	
	private static Singleton instance;
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
		
}
