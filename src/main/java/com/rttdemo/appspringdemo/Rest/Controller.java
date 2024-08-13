package com.rttdemo.appspringdemo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    private String dragon;
    
@GetMapping("/")
private String hello(){
    return "Hello World !";

}

@GetMapping("/dragon")
private String dragon() {
        return this.dragon;
    }

    @GetMapping("/eat")
    private void eat () {
        System.out.println(" I am Hungry it is almost lunch time");
    }
}










