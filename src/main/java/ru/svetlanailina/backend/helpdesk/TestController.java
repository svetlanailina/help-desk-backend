package ru.svetlanailina.backend.helpdesk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test2")
    String test2(){
        return "test2";
    }
}
