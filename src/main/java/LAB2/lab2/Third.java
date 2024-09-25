package LAB2.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Third {
    private final Random random = new Random();

    @GetMapping("/random_number")
    public int getRandomNumber() {
        return random.nextInt(88888) + 1;
    }
}
