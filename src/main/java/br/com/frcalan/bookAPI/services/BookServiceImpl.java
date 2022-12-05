package br.com.frcalan.bookAPI.services;

import br.com.frcalan.bookAPI.document.Book;
import br.com.frcalan.bookAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> findById(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public Mono<Book> update(Book book){
        return findById(book.getId())
                .map(bookFound -> book.withId(bookFound.getId()))
                .flatMap(bookRepository::save);
    }
    @Override
    public Mono<Book> save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Mono<Void> delete(String id) { return bookRepository.deleteById(id); }
}
