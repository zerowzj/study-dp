package study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Slf4j
public class ProxyFactory {

    public static <T> T create(Class<T> target) {
        //（▲）类加载器
        ClassLoader loader = target.getClassLoader();
        //（▲）接口
        Class<?>[] interfaces = new Class[]{target};
        //（▲）
        InvocationHandler handler = new CustomInvocationHandler();

        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }

    public static void main(String[] args) {
        GreetingService service = ProxyFactory.create(GreetingService.class);
        String str = service.sayHi("wangzhj");
        log.info(str);
        str = service.sayBye("zero");
        log.info(str);
    }
}
