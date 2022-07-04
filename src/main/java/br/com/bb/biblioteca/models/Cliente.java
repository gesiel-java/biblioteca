package br.com.bb.biblioteca.models;

public class Cliente extends Pessoa{
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone){
        super(nome);
        this.email = email;
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
