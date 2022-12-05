package br.com.frcalan.bookAPI.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@With
public class Book {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private String imgUrl;
    private String loja;
    private Double valor;
    // 2022-11-27T23:44:49.862Z  Classe Java ZonedDateTime
    private String data;
    private String dataCompra;
    private boolean status;
    private boolean situacao;


}
