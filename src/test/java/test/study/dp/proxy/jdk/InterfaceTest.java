package test.study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import study.dp.proxy.jdk.GreetingService;
import study.dp.proxy.jdk.ProxyFactory;

@Slf4j
public class InterfaceTest {

    @Test
    public void test() {
        GreetingService service = ProxyFactory.create(GreetingService.class);
        String str = service.sayHi("wangzhj");
        log.info(str);
        str = service.sayBye("zero");
        log.info(str);
    }
}
