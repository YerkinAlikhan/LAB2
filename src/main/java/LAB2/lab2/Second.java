package LAB2.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Second {

    public static void main(String[] args) {
        SpringApplication.run(Second.class, args);
    }

    @RestController
    static
    class NumberController {

        @GetMapping("/api")
        public List<Integer> getNumbers(@RequestParam(value = "q", defaultValue = "8888") int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Value of 'n' should be a positive integer.");
            }

            return IntStream.rangeClosed(1, n)
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}
