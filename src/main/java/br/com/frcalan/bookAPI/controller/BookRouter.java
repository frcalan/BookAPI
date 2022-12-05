package br.com.frcalan.bookAPI.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class BookRouter {

    @Bean
    public RouterFunction<ServerResponse> route(BookHandler handler) {
        return RouterFunctions
                .route(GET("/books").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/book/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
                .andRoute(POST("/book").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(PUT("/book/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::update)
                .andRoute(DELETE("/book/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}
