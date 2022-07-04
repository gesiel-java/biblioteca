package br.com.bb.biblioteca.principal;

import br.com.bb.biblioteca.enums.TipoLivro;
import br.com.bb.biblioteca.models.Autor;
import br.com.bb.biblioteca.models.Cliente;
import br.com.bb.biblioteca.models.Emprestimo;
import br.com.bb.biblioteca.models.Livro;

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Gesiel dos Santos Freitas");
        Livro livro1 = new Livro();
        livro1.setAutor(autor);
        livro1.setTipoLivro(TipoLivro.ACAO);
        livro1.setISBN("7456982");
        livro1.setTitulo("As loucuras de didi");
        livro1.setNumeroDePaginas(450);

        Cliente cliente = new Cliente("Cintia Almeida", "cintia@gmail.com", "61981235040");
        Emprestimo emp = new Emprestimo(cliente);
        emp.setLivros(livro1);
        emp.emprestar();
        System.out.println(emp.toString());

    }
}
