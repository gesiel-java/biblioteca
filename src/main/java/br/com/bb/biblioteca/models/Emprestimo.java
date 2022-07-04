package br.com.bb.biblioteca.models;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashSet;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private HashSet<Livro> livros;

    public Emprestimo(Cliente cliente){
        livros = new HashSet<Livro>(2);
        this.cliente = cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
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

    public void emprestar(){
        if (livros.size() == 0 || !validaEmprestimo()){
            System.out.println("Por favor adicione pelo menos um livro ou registre todos os dados para o cliente");
            return;
        }

        setDataEmprestimo(LocalDate.now());
        setDataDevolucao(dataEmprestimo.plusDays(20));
    }

    public void devolverLivros(){
        livros.removeAll(getLivros());
    }

    public boolean validaEmprestimo(){
        if(cliente.getEmail().isEmpty() || cliente.getNome().isEmpty() || cliente.getTelefone().isEmpty()){
            return false;
        }

        return true;
    }

    public double getValorEmpestimo(){
        double valor = 0;
        for (Livro livro : livros){
            valor += diasEmprestimo() * livro.getTipoLivro().getValorDiarioEmprestimo();
        }
      return valor;
    }

    public double getValorMulta(){
        double valor = 0;
        if(diasEmprestimo() > 20){
            valor +=  (diasEmprestimo() - 20) * (0.5 / 100);
        }

        if(valor > 0 && valor > (getValorEmpestimo()/5)){
            valor = getValorEmpestimo() / 5;
        }

        return valor;
    }

    public Long diasEmprestimo(){
        return ChronoUnit.DAYS.between(dataEmprestimo, LocalDate.now());
    }
    public double getValorTotalEmpestimo(){
        return getValorEmpestimo() + getValorMulta();
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolução=" + dataDevolucao +
                ", cliente=" + cliente +
                ", livros=" + livros +
                ", Dias emprestado: " + diasEmprestimo() +
                ", Valor Emprestimo: " + getValorEmpestimo() +
                ", Valor Multa: " + getValorMulta() +
                ", Valor Total Emprestimo: " + getValorTotalEmpestimo() +
                '}';
    }
}
