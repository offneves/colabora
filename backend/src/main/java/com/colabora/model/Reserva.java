package com.colabora.model;

import java.util.Date;
import java.math.BigDecimal;

public class Reserva {
    
    private int nroReserva;
    private String nomeReserva;
    private Date dataCriacao;
    private String statusReserva;
    private BigDecimal valorReserva;
    private String categoriaReserva;
    private String tag;
    private String observacao;

    public Reserva(int nroReserva, String nomeReserva, Date dataCriacao, String statusReserva, BigDecimal valorReserva, String categoriaReserva, String tag, String observacao){
        this.nroReserva = nroReserva;
        this.nomeReserva = nomeReserva;
        this.dataCriacao = dataCriacao;
        this.statusReserva = statusReserva;
        this.valorReserva = valorReserva;
        this.categoriaReserva = categoriaReserva;
        this.tag = tag;
        this.observacao = observacao;
    }

    public int getNroReserva(){
        return nroReserva;
    }

    public void setNroReserva(int nroReserva){
        this.nroReserva = nroReserva;
    }

    public String getNomeReserva(){
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva){
        this.nomeReserva = nomeReserva;
    }

    public Date getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public String getStatusReserva(){
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva){
        this.statusReserva = statusReserva;
    }

    public BigDecimal getValorReserva(){
        return valorReserva;
    }

    public void setValorReserva(BigDecimal valorReserva){
        this.valorReserva = valorReserva;
    }

    public String getCategoriaReserva(){
        return categoriaReserva;
    }

    public void setCategoriaReserva(String categoriaReserva){
        this.categoriaReserva = categoriaReserva;
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

}
