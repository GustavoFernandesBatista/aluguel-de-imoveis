package br.com.imoveisservlet.model;

public class Login {
    String email;
    String senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }



    public String getEmail() {
        return email;
    }


}
