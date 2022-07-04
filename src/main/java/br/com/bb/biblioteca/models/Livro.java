package br.com.bb.biblioteca.models;

import br.com.bb.biblioteca.enums.TipoLivro;

public class Livro {
    private Autor autor;
    private String titulo;
    private String ISBN;
    private TipoLivro tipoLivro;
    private Integer numeroDePaginas;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public TipoLivro getTipoLivro() {
        return tipoLivro;
    }

    public void setTipoLivro(TipoLivro tipoLivro) {
        this.tipoLivro = tipoLivro;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor=" + autor +
                ", titulo='" + titulo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", tipoLivro=" + tipoLivro +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}
