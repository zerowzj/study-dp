package test.study.dp.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import study.dp.proxy.jdk.bye.ByeByeInvocationHandler;
import study.dp.proxy.jdk.bye.ByeByeService;
import study.dp.proxy.jdk.ProxyFactory;

@Slf4j
public class ByeTest {

    @Test
    public void test() {
        ByeByeService service = ProxyFactory.create(ByeByeService.class, new ByeByeInvocationHandler());
        String str = service.sayBye("wangzhj");
        log.info(str);
    }
}
