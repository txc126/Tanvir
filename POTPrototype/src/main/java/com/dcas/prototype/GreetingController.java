package com.dcas.prototype;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TChoudhury on 12/04/2016.
 */

@RestController
public class GreetingController{

    GreetingController greetingController = new GreetingController();

    @RequestMapping("/greeting")
     public String initialGreeting() {
        return "Welcome to the Greeting app";
    }



}
