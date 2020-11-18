package study.dp.proxy.jdk.hello;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class HelloInvocationHandler implements InvocationHandler {

    private Object target;

    public HelloInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //（▲）代理对象
        log.info("proxy= {}", proxy.getClass().getName());
        //（▲）方法
        log.info("method= {}", method.getName());
        //（▲）参数
        Arrays.stream(args).forEach(e -> {
            log.info("   arg= {}", e);
        });

        log.info(">>>>>>");
        Object retValue = method.invoke(target, args);
        log.info(">>>>>>");
        return retValue;
    }
}
