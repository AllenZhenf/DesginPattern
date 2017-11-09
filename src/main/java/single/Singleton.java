package single;

/**
 * 单例模式
 * @author szf
 *
 */
public class Singleton {
	/**
	 * 1、饿汉创建类时慢，创建对象快，线程安全，用空间换时间
	 * 2、懒汉创建类时快，创建对象慢，线程不安全，用时间换空间
	 */
	
	//饿汉模式 类一启动就加载
	/*private Singleton(){};	
	
	private static Singleton single=new Singleton(); 
	
	public static Singleton getInstance(){
		return single;
	}*/
	
	
	//懒汉模式
	private Singleton(){};
	
	private static Singleton instance;
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
		
}
