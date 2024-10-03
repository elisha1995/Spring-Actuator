package ges.springactuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {

    @ReadOperation
    public Map<String, Object> customEndpoint() {
        Map<String, Object> details = new HashMap<>();
        details.put("currentTime", LocalDateTime.now());
        details.put("activeUsers", getActiveUserCount());
        return details;
    }

    private int getActiveUserCount() {
        // Logic to get active user count
        return 42; // Example value
    }
}

