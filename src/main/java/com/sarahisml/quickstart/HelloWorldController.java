package com.sarahisml.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation
public class HelloWorldController {

    @GetMapping (path = "/hello") //spring would'nt understand if there is no endpoint
    public String helloWorld()
    {
        return "Hello Sarah !";
    }
}
