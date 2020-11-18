package study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Slf4j
public class ProxyFactory {

    public static <T> T create(Object target, InvocationHandler handler) {
        Class clazz = target.getClass();
        //（▲）类加载器
        ClassLoader loader = clazz.getClassLoader();
        //（▲）接口
        Class<?>[] interfaces = clazz.getInterfaces();
        //（▲）
        InvocationHandler h = handler;
        //创建代理
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

    public static <T> T create(Class<T> target, InvocationHandler handler) {
        ClassLoader loader = target.getClassLoader();
        Class<?>[] interfaces = new Class[]{target};
        InvocationHandler h = handler;
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
