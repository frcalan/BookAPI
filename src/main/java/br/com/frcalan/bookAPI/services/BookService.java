package br.com.frcalan.bookAPI.services;

import br.com.frcalan.bookAPI.document.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Flux<Book> findAll();
    Mono<Book> findById(String id);
    Mono<Book> update(Book book);
    Mono<Book> save(Book book);
    Mono<Void> delete(String id);
}
