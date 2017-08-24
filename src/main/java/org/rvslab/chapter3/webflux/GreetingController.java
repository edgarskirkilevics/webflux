package org.rvslab.chapter3.webflux;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by edgars.kirkilevics on 23/08/2017.
 */

@RestController
class GreetingController{
    @RequestMapping("/")
    Mono<Greet> greet(){
        return Mono.just(new Greet("Hello World!"));
    }
}