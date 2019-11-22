package com.example.demo.config;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;

import java.util.Collection;

@Configuration
public class ConfigRouter {
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> findAll(UserRepository userRepository) {
        return RouterFunctions.route(RequestPredicates.GET("/user/find/all"),
                request -> {
                    Collection<User> users = userRepository.findAllUser();
//                    Mono<ServerResponse> response = null;

                    Flux<User> userFlux = Flux.fromIterable(users);
                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }

}
