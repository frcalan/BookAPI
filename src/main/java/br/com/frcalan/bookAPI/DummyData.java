package br.com.frcalan.bookAPI;

import br.com.frcalan.bookAPI.document.Book;
import br.com.frcalan.bookAPI.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
// INICIO Classe que popula os dados base no DB
/*
@Component
public class DummyData implements CommandLineRunner {
    private final BookRepository bookRepository;

    DummyData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void run(String... args) throws Exception {
        bookRepository.deleteAll();
        Flux<Book> bookFlux = Flux.just(
                new Book(null, "Para você que teve um dia ruim", "Victor Fernandes", "https://m.media-amazon.com/images/I/81qyydZ7nXL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 34.41, "2022-11-27T21:17:49.862Z", null, false, false),
                new Book(null, "O sucesso treinável", "JOEL JOTA, ALYSSON COSTA, e outros", "https://m.media-amazon.com/images/I/815ZbUfZ9RL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 24.99, "2022-11-27T21:22:49.862Z", null, false, false),
                new Book(null, "Primavera dos sonhos", "Nicholas Sparks e Alessandra Esteche", "https://m.media-amazon.com/images/I/91jHgd5LqXL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 52.16, "2022-11-27T21:20:49.862Z", null, false, false),
                new Book(null, "Eu e esse meu coração", "C. C. Hunter e Denise de Carvalho Rocha", "https://m.media-amazon.com/images/I/81w-GCfqtjL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 29.90, "2022-11-27T21:16:49.862Z", null, false, false),
                new Book(null, "A vida invisível de Addie LaRue", "V.E. Schwab e Flávia de Lavor", "https://m.media-amazon.com/images/I/71X245OYRBL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 28.50, "2022-11-21T21:22:49.862Z", "2022-11-21T25:22:49.862Z", true, false),
                new Book(null, "Tróia - O Romance de uma Guerra", "Cláudio Moreno", "https://m.media-amazon.com/images/I/91LpLm-ETBL._AC_UY327_FMwebp_QL65_.jpg",
                        "Amazon", 23.92, "2022-11-22T21:20:49.862Z", "2022-11-25T21:20:49.862Z", true, true),
                new Book(null, "Sem Fôlego - Col. Romance e Saga", "Cláudio Figueiredo", "https://lojasaraivanew.vtexassets.com/arquivos/ids/192590-800-auto?v=638043906352600000&width=800&height=auto&aspect=true",
                        "Saraiva", 57.90, "2022-11-27T21:20:49.862Z", null, false, false)
        ).flatMap(bookRepository::save);
        bookFlux
                .thenMany(bookRepository.findAll())
                .subscribe(System.out::println);

    }


}
*/
// FIM Classe que popula os dados base no DB
/*
    @Bean
    CommandLineRunner init (ReactiveMongoOperations operations,
                            BookRepository repository) {
        return args -> {
            Flux<Book> bookFlux = Flux.just(
                    new Book(null, "Para você que teve um dia ruim", "Victor Fernandes", "https://m.media-amazon.com/images/I/81qyydZ7nXL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 34.41, "2022-11-27T21:17:49.862Z", null, false, false),
                    new Book(null, "O sucesso treinável", "JOEL JOTA, ALYSSON COSTA, e outros", "https://m.media-amazon.com/images/I/815ZbUfZ9RL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 24.99, "2022-11-27T21:22:49.862Z", null, false, false),
                    new Book(null, "Primavera dos sonhos", "Nicholas Sparks e Alessandra Esteche", "https://m.media-amazon.com/images/I/91jHgd5LqXL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 52.16, "2022-11-27T21:20:49.862Z", null, false, false),
                    new Book(null, "Eu e esse meu coração", "C. C. Hunter e Denise de Carvalho Rocha", "https://m.media-amazon.com/images/I/81w-GCfqtjL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 29.90, "2022-11-27T21:16:49.862Z", null, false, false),
                    new Book(null, "A vida invisível de Addie LaRue", "V.E. Schwab e Flávia de Lavor", "https://m.media-amazon.com/images/I/71X245OYRBL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 28.50, "2022-11-21T21:22:49.862Z", "2022-11-21T25:22:49.862Z", true, false),
                    new Book(null, "Tróia - O Romance de uma Guerra", "Cláudio Moreno", "https://m.media-amazon.com/images/I/91LpLm-ETBL._AC_UY327_FMwebp_QL65_.jpg",
                            "Amazon", 23.92, "2022-11-22T21:20:49.862Z", "2022-11-25T21:20:49.862Z", true, true),
                    new Book(null, "Sem Fôlego - Col. Romance e Saga", "Cláudio Figueiredo", "https://lojasaraivanew.vtexassets.com/arquivos/ids/192590-800-auto?v=638043906352600000&width=800&height=auto&aspect=true",
                            "Saraiva", 57.90, "2022-11-27T21:20:49.862Z", null, false, false)
            ).flatMap(repository::save);
            bookFlux
                    .thenMany(repository.findAll())
                    .subscribe(System.out::println);
        };
    }*/