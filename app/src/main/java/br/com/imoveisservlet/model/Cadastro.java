package br.com.imoveisservlet.model;

public class Cadastro {

    private String nomeCompleto;
    private String cpf;

    private String telefone;

    private String email;

    private String senha;

    private String repeteSenha;


    public Cadastro(String nomeCompleto, String cpf, String telefone, String email, String senha, String repeteSenha) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.repeteSenha = repeteSenha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getRepeteSenha() {
        return repeteSenha;
    }
}
