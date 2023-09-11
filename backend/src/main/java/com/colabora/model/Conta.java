package com.colabora.model;

import java.math.BigDecimal;

public class Conta {
    
    private int nroConta;
    private String nomeConta;
    private BigDecimal valorConta;
    private String categoriaConta;
    private String tag;
    private String observacao;
    private String tipoConta;

    public Conta(){}

    public Conta(int nroConta, String nomeConta, BigDecimal valorConta, String categoriaConta, String tag, String observacao, String tipoConta){
        this.nroConta = nroConta;
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
        this.categoriaConta= categoriaConta;
        this.tag = tag;
        this.observacao = observacao;
        this.tipoConta = tipoConta;
    }

    public int getNroConta(){
        return nroConta;
    }

    public void setNroConta(int nroConta){
        this.nroConta = nroConta;
    }

    public String getNomeConta(){
        return nomeConta;
    }

    public void setNomeConta(String nomeConta){
        this.nomeConta = nomeConta;
    }

    public BigDecimal getValorConta(){
        return valorConta;
    }

    public void setValorConta(BigDecimal valorConta){
        this.valorConta = valorConta;
    }

    public String getCategoriaConta(){
        return categoriaConta;
    }

    public void setCategoriaConta(String categoriaConta){
        this.categoriaConta = categoriaConta;
    }

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setTipoContta(String tipoConta){
        this.tipoConta = tipoConta;
    }

}
