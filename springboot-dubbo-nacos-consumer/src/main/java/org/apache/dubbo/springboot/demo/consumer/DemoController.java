package org.apache.dubbo.springboot.demo.consumer;


import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
