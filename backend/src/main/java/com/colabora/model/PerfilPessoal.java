package com.colabora.model;

import java.util.Date;

public class PerfilPessoal {
    
    private String nome;
    private String sobrenome;
    private Date nascimento;
    private String sexo;
    private String objetivo;
    private Contato contato;
    private Endereco endereco;

    public PerfilPessoal(String nome, String sobrenome, Date nascimento, String sexo, String objetivo, Contato contato, Endereco endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.objetivo = objetivo;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
    } 

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public Date getNascimento(){
        return nascimento;
    }

    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getObjetivo(){
        return objetivo;
    }

    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }

    public Contato getContato(){
        return contato;
    }

    public void setContato(Contato contato){
        this.contato = contato;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

}
