package cat.itacademy.s04.t01.n02.S04T01N02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String sayHello(@RequestParam(defaultValue ="UNKNONW") String name){
        return "Hola, "+ name + ". You are running a Gradle project";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String sayHello2(@PathVariable(required = false) String name){
        if (name == null){
            name = "UNKNONW";
        }
        return "Hola, "+ name + ". You are running a Gradle project";
    }
}
