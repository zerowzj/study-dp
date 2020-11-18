package study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

@Slf4j
public class CustomInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //（▲）代理对象
        log.info("target= {}", proxy.getClass().getSimpleName());
        //（▲）方法
        log.info("method= {}", method.getName());
        //（▲）参数
        Arrays.stream(args).forEach(e -> {
            log.info("   arg= {}", e);
        });

        Object retValue;
        if (Objects.equals(method.getName(), "sayHi")) {
            retValue = String.format("hi, %s", args);
        } else {
            retValue = String.format("byebye %s", args);
        }
        return retValue;
    }
}
