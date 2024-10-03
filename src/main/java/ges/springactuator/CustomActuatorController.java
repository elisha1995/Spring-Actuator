package ges.springactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomActuatorController {

    @GetMapping("/actuator/customInfo")
    public Map<String, String> getCustomInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("app", "My Spring Boot App");
        info.put("version", "1.0.0");
        return info;
    }
}

