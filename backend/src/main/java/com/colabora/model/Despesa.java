package com.colabora.model;

import java.util.Date;
import java.math.BigDecimal;

public class Despesa {
    
    private int nroDespesa;
    private String nomeDespesa;
    private BigDecimal valorDespesa;
    private Date dataDespesa;
    private String categoria;
    private String tag;
    private String formaPagamento;
    private int contaBancaria;
    private String tipoDespesa;
    private String observacao;
    private Conta contaDespesa;

    public Despesa(int nroDespesa, String nomeDespesa, BigDecimal valorDespesa, Date dataDespesa, String categoria, String tag, String formaPagamento, int contaBancaria, String tipoDespesa, String observacao, Conta contaDespesa){
        this.nroDespesa = nroDespesa;
        this.nomeDespesa = nomeDespesa;
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
        this.categoria = categoria;
        this.tag = tag;
        this.formaPagamento = formaPagamento;
        this.tipoDespesa = tipoDespesa;
        this.observacao = observacao; 
        this.contaDespesa = contaDespesa;
    }

    public int getNroDespesa(){
        return nroDespesa;
    }

    public void setNroDespesa(int nroDespesa){
        this.nroDespesa = nroDespesa;
    }

    public String getNomeDespesa(){
        return nomeDespesa;
    }

    public void setNomeDespesa(String nomeDespesa){
        this.nomeDespesa = nomeDespesa;
    }

    public BigDecimal getValorDespesa(){
        return valorDespesa;
    }

    public void setValorDespesa(BigDecimal valorDespesa){
        this.valorDespesa = valorDespesa;
    }

    public Date getDataDespesa(){
        return dataDespesa;
    }

    public void setDataDespesa(Date dataDespesa){
        this.dataDespesa = dataDespesa;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public String getFormaPagamento(){
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    public int getContaBancaria(){
        return contaBancaria;
    }

    public void setContaBancaria(int contaBancaria){
        this.contaBancaria = contaBancaria;
    }

    public String getTipoDespesa(){
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa){
        this.tipoDespesa = tipoDespesa;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public Conta getContaDespesa(){
        return contaDespesa;
    }

    public void setContaDespesa(Conta contaDespesa){
        this.contaDespesa = contaDespesa;
    }

}
