package pl.bykowski.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @GetMapping
    public String hello() {
        return "hello from UserApi";
    }
}
