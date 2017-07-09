package io.tbt.springboot.samples.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sathish.santhanam on 7/4/17.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Welcome!";
    }
}
