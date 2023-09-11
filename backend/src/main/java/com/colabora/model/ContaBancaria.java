package com.colabora.model;

import java.math.BigDecimal;

public class ContaBancaria {
    
    private String banco;
    private int nroConta;
    private int nroCartao;
    private String tipoConta;
    private String statusConta;
    private BigDecimal saldoConta;
    private BigDecimal despesaConta;
    private BigDecimal investimentoConta;
    private String tag;

    public ContaBancaria(String banco, int nroConta, int nroCartao, String tipoConta, String statusConta, BigDecimal saldoConta, BigDecimal despesaConta, BigDecimal investimentoConta, String tag){
        this.banco = banco;
        this.nroConta = nroConta;
        this.nroCartao = nroCartao;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.saldoConta = saldoConta;
        this.despesaConta = despesaConta;
        this.investimentoConta = investimentoConta;
    }

    public String getBanco(){
        return banco;
    }

    public void setBanco(String banco){
        this.banco = banco;
    }

    public int getNroConta(){
        return nroConta;
    }

    public void setNroConta(int nroConta){
        this.nroConta = nroConta;
    }

    public int getNroCartao(){
        return nroCartao;
    }

    public void setNroCartao(int nroCartao){
        this.nroCartao = nroCartao;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public String getStatusConta(){
        return statusConta;
    }

    public void setStatusConta(String statusConta){
        this.statusConta = statusConta;
    }

    public BigDecimal getSaldoConta(){
        return saldoConta;
    }

    public void setSaldoConta(BigDecimal saldoConta){
        this.saldoConta = saldoConta;
    }

    public BigDecimal getDespesaConta(){
        return despesaConta;
    }

    public void setDespesaConta(BigDecimal despesaConta){
        this.despesaConta = despesaConta;
    }

    public BigDecimal getInvestimentoConta(){
        return investimentoConta;
    }

    public void setInvestimentoConta(BigDecimal investimentoConta){
        this.investimentoConta = investimentoConta;
    }

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

}
