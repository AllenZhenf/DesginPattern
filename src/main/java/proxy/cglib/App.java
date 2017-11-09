package proxy.cglib;

import org.junit.Test;

public class App {

    @Test
    public void test(){
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getInstanceProxy();

        //执行代理对象的方法
        proxy.save();
    }
}
