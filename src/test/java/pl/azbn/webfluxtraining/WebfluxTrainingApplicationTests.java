package pl.azbn.webfluxtraining;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class WebfluxTrainingApplicationTests {

    @Test
    void contextLoads() {

        Flux.just("Przemek", "Anna", "Karol")
                .map(String::toUpperCase)
                .subscribe(System.out::println);

        Mono.just("Przemek")
                .map(String::toUpperCase)
                .subscribe(System.out::println);


    }

}
