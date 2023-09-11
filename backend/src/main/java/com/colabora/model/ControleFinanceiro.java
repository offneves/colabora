package com.colabora.model;

import java.math.BigDecimal;

public class ControleFinanceiro {
    
    private Receita receitaControle;
    private Despesa despesaControle;
    private BigDecimal saldoControle;
    private BigDecimal orcamento;
    private BigDecimal faturaPendente;
    private Meta metaControle;
    private String transacoes;
    private Reserva reserva;

    public ControleFinanceiro(Receita receita, Despesa despesa, BigDecimal saldoGeral, BigDecimal orcamento, BigDecimal faturaPendente, Meta metaControle, String transacoes, Reserva reserva){
        this.receitaControle = receita;
        this.despesaControle = despesa;
        this.saldoControle = saldoGeral;
        this.orcamento = orcamento;
        this.faturaPendente = faturaPendente;
        this.metaControle = metaControle;
        this.transacoes = transacoes;
    }

    public Receita getReceitaControle(){
        return receitaControle;
    }

    public void setReceitaControle(Receita receitaControle){
        this.receitaControle = receitaControle;
    }

    public Despesa getDespesaControle(){
        return despesaControle;
    }

    public void setDespesaControle(Despesa despesaControle){
        this.despesaControle = despesaControle;
    }

    public BigDecimal getSaldoControle(){
        return saldoControle;
    }

    public void setSaldoControle(BigDecimal saldoControle){
        this.saldoControle =saldoControle;
    }

    public BigDecimal getOrcamento(){
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento){
        this.orcamento = orcamento;
    }

    public BigDecimal getFaturaPendente(){
        return faturaPendente;
    }

    public void setFaturaPendente(BigDecimal faturaPendente){
        this.faturaPendente = faturaPendente;
    }

    public Meta getMetaControle(){
        return metaControle;
    }

    public void setMetaControle(Meta metaControle){
        this.metaControle = metaControle;
    }

    public String getTransacoes(){
        return transacoes;
    }

    public void setTransacoes(String transacoes){
        this.transacoes = transacoes;
    }

    public Reserva getReserva(){
        return reserva;
    }

    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }

}
