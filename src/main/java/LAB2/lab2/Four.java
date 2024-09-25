package LAB2.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Four {

    public static void main(String[] args) {
        SpringApplication.run(Four.class, args);
    }

    @RestController
    static
    class FibonacciController {

        @GetMapping("/fib")
        public long getFibonacci(@RequestParam(value = "number") int n) {
            if (n < 0) {
                throw new IllegalArgumentException("The number must be non-negative.");
            }
            return fibonacci(n);
        }

        private long fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
            long a = 0, b = 1, fib = 1;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }
}

// можно прочекать через http://localhost:8080/fib?number=1111
