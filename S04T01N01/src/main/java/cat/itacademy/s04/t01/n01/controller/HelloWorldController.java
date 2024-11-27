package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String sayHello(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hi, " + name + ". You are running a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String sayHello2(@PathVariable(required = false) String name) {
        name = (name == null) ? "UNKNOWN" : name;
        return "Hi, " + name + ". You are running a Maven project.";
    }
}
