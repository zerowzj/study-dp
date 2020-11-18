package study.dp.proxy.jdk.hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHi(String name) {
        log.info("hi hi hi");
        String msg = String.format("hi, %s", name);
        return msg;
    }
}
