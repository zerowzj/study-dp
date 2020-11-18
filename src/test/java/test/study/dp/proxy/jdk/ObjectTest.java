package test.study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import study.dp.proxy.jdk.GreetingService;
import study.dp.proxy.jdk.ProxyFactory;

@Slf4j
public class ObjectTest {

    @Test
    public void test() {
        GreetingService service = new GreetingService() {
            @Override
            public String sayHi(String name) {
                return null;
            }

            @Override
            public String sayBye(String name) {
                return null;
            }
        };

        GreetingService proxy = ProxyFactory.create(service);
        String str = proxy.sayHi("wangzhj1111111");
        log.info(str);
        str = proxy.sayBye("zero11111111");
        log.info(str);
    }
}
