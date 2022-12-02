package br.com.frcalan.bookAPI.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
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

    public Book(String id, String titulo, String autor, String imgUrl, String loja, Double valor, String data, String dataCompra, boolean status, boolean situacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.imgUrl = imgUrl;
        this.loja = loja;
        this.valor = valor;
        this.data = data;
        this.dataCompra = dataCompra;
        this.status = status;
        this.situacao = situacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
