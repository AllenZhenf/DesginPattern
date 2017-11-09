package single;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1=Singleton.single;
//		Singleton s2=Singleton.single;
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一个实例");
		}else{
			System.out.println("s1和s2不是同一个实例");
		}
	}

}
