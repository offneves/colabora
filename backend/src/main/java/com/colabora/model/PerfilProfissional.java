package com.colabora.model;

public class PerfilProfissional {
    
    private String formacao;
    private String profissao;
    private double salario;

    public PerfilProfissional(String formacao, String profissao, double salario){
        this.formacao = formacao;
        this.profissao = profissao;
        this.salario = salario;
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
