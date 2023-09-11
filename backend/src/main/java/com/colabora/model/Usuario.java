package com.colabora.model;

public class Usuario {
    //atributos
    private String email;
    private char[] senha;
    private PerfilPessoal perfilPessoal;
    private PerfilProfissional perfilProfissional;
    private PerfilFinanceiro perfilFinanceiro;
    //contrutor
    public Usuario(String email, char[] senha){
        this.email = email;
        this.senha = senha;
    }
    //getter and setters
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char[] getSenha(){
        return senha;
    }

    public void setSenha(char[] senha){
        this.senha = senha;
    }

    public PerfilPessoal getPerfilPessoal(){
        return perfilPessoal;
    }

    public void setPerfilPessoal(PerfilPessoal perfilPessoal){
        this.perfilPessoal = perfilPessoal;
    }

    public PerfilProfissional getPerfilProfissional(){
        return perfilProfissional;
    }

    public void setPerfilProfissional(PerfilProfissional perfilProfissional){
        this.perfilProfissional = perfilProfissional;
    }

    public PerfilFinanceiro getPerfilFinanceiro(){
        return perfilFinanceiro;
    }

    public void setPerfilFinanceiro(PerfilFinanceiro perfilFinanceiro){
        this.perfilFinanceiro = perfilFinanceiro;
    }

}
