package test.study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import study.dp.proxy.jdk.ProxyFactory;
import study.dp.proxy.jdk.hello.HelloInvocationHandler;
import study.dp.proxy.jdk.hello.HelloService;
import study.dp.proxy.jdk.hello.HelloServiceImpl;

@Slf4j
public class HelloTest {

    @Test
    public void test() {
        HelloService target = new HelloServiceImpl();
        HelloService proxy = ProxyFactory.create(target, new HelloInvocationHandler(target));
        String str = proxy.sayHi("wangzhj1111111");
        log.info(str);
    }
}
