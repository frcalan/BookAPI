package br.com.frcalan.bookAPI.controller;

import br.com.frcalan.bookAPI.document.Book;
import br.com.frcalan.bookAPI.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class BookHandler {

    @Autowired
    BookService service;
    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findAll(), Book.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findById(id), Book.class);
    }
    public Mono<ServerResponse> updateBook(ServerRequest request) {
        String id = request.pathVariable("id");
        final Mono<Book> book = request.bodyToMono(Book.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(book.flatMap((Book bookUpdate) -> service.updateBook(id, bookUpdate)), Book.class));
    }
    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<Book> book = request.bodyToMono(Book.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(book.flatMap(service::save), Book.class));
    }
    public Mono<ServerResponse> delete(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.delete(id), Book.class);
    }

}
