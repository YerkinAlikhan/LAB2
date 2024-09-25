package LAB2.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class First {
    @GetMapping("/currentTime")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
