package br.com.bb.biblioteca.models;

import java.util.Date;
import java.util.HashSet;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolução;
    private Cliente cliente;
    private HashSet<Livro> livros;

    public Emprestimo(Cliente cliente){
        livros = new HashSet<Livro>(2);
        this.cliente = cliente;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(Date dataDevolução) {
        this.dataDevolução = dataDevolução;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HashSet<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Livro livro) {
        if(this.livros.size() < 2 ){
            this.livros.add(livro);
        }else{
            System.out.println("Você só pode pegar emprestado até 2 livros.");
        }
    }
}
