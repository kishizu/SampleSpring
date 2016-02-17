package sbgs;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SbgsApplication {

    AtomicLong counter = new AtomicLong();

    public static void main(String[] args) {
        SpringApplication.run(SbgsApplication.class, args);
    }

    @RequestMapping("/greeting")
         public Greeting
         greeting(@RequestParam(defaultValue = "World") String name) {
        Greeting g = new Greeting();
        g.setCount(counter.incrementAndGet());
        g.setMessage("Hello " + name);
        return g;
    }
}