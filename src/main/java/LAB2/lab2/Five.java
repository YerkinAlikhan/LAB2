package LAB2.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Five {

    public static void main(String[] args) {
        SpringApplication.run(Five.class, args);
    }

    @RestController
    static
    class StringReversalController {

        @GetMapping("/{inputString}")
        public String reverseString(@PathVariable("inputString") String inputString) {
            return new StringBuilder(inputString).reverse().toString();
        }
    }
}

// Прочекать http://localhost:8080/AlIkHaN