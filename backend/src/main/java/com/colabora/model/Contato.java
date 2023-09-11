package com.colabora.model;

public class Contato {
   
    private String email;
    private String numero;
    private String categoria;

    public Contato(String email, String numero, String categoria){
        this.email = email;
        this.numero = numero;
        this.categoria = categoria;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

}
