package br.com.frcalan.bookAPI.repository;

import br.com.frcalan.bookAPI.document.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
