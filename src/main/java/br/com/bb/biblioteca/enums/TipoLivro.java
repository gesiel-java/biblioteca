package br.com.bb.biblioteca.enums;

public enum TipoLivro {
    COMEDIA(0.5, 10), ACAO(0.7, 11), DRAMA(0.9, 9);


    private double valorDiarioEmprestimo;
    private int valorPorcentagemMulta;

    TipoLivro(double valorDiarioEmprestimo, int valor) {
        this.valorDiarioEmprestimo = valorDiarioEmprestimo;
        this.valorPorcentagemMulta = valor;
    }

    public double getValorDiarioEmprestimo(){
       return this.valorDiarioEmprestimo;
    }

    public double getValorPorcentagemMulta(){
        return this.valorPorcentagemMulta / 100.0;
    }
}
