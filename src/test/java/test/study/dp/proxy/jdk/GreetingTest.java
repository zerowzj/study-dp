package test.study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import study.dp.proxy.jdk.greeting.GreetingInvocationHandler;
import study.dp.proxy.jdk.greeting.GreetingService;
import study.dp.proxy.jdk.ProxyFactory;

@Slf4j
public class GreetingTest {

    @Test
    public void test() {
        GreetingService service = ProxyFactory.create(GreetingService.class, new GreetingInvocationHandler());
        String str = service.sayBye("wangzhj");
        log.info(str);
    }
}
