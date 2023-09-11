package com.colabora.model;

import java.math.BigDecimal;

public class Meta {
    
    private int nroMeta;
    private String nomeMeta;
    private BigDecimal valorMeta;    
    private String categoria;
    private String tag;
    private String observacao;
    private int progressoMeta;

    public Meta(){}

    public Meta(int nroMeta, String nomeMeta, BigDecimal valorMeta, String categoria, String tag, String observacao, int progressoMeta){
        this.nroMeta = nroMeta;
        this.nomeMeta = nomeMeta;
        this.valorMeta = valorMeta;
        this.categoria = categoria;
        this.tag = tag;
        this.observacao = observacao;
        this.progressoMeta = progressoMeta;
    }

    public int getNroMeta(){
        return nroMeta;
    }

    public void setNroMeta(int nroMeta){
        this.nroMeta = nroMeta;
    }

    public String getNomeMeta(){
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta){
        this.nomeMeta = nomeMeta;
    }

    public BigDecimal getValorMeta(){
        return valorMeta;
    }

    public void setValorMeta(BigDecimal valorMeta){
        this.valorMeta = valorMeta;
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

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public int getProgressoMeta(){
        return progressoMeta;
    }

    public void setProgressoMeta(int progressoMeta){
        this.progressoMeta = progressoMeta;
    }

}
