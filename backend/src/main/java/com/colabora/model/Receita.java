package com.colabora.model;

import java.math.BigDecimal;
import java.util.Date;

public class Receita {
    
    private int nroReceita;
    private BigDecimal valorReceita;
    private Date dataReceita;
    private String categoria;
    private String tag;
    private String formaRecebimento;
    private String tipoReceita;
    private String observacao;

    public Receita(){}
    
    public Receita(int nroReceita, BigDecimal valorReceita, Date dataReceita, String categoria, String tag, String formaRecebimento, String tipoReceita, String observacao){
        this.nroReceita = nroReceita;
        this.valorReceita = valorReceita;
        this.dataReceita = dataReceita;
        this.categoria = categoria;
        this.tag = tag;
        this.formaRecebimento = formaRecebimento;
        this.tipoReceita = tipoReceita;
        this.observacao = observacao;
    }

    public int getNroReceita(){
        return nroReceita;
    }

    public void setNroReceita(int nroReceita){
        this.nroReceita = nroReceita;
    }

    public BigDecimal getValorReceita(){
        return valorReceita;
    }

    public void setValorReceita(BigDecimal valorReceita){
        this.valorReceita = valorReceita;
    }

    public Date getDataReceita(){
        return dataReceita;
    }

    public void setDataReceita(Date dataReceita){
        this.dataReceita = dataReceita;
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

    public String getFormaRecebimento(){
        return formaRecebimento;
    }

    public void setFormaRecebimento(String formaRecebimento){
        this.formaRecebimento = formaRecebimento;
    }

    public String getTipoReceita(){
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita){
        this.tipoReceita = tipoReceita;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

}
