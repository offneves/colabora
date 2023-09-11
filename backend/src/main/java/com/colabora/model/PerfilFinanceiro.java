package com.colabora.model;

import java.math.BigDecimal;

public class PerfilFinanceiro {
    
    private BigDecimal patrimonio;
    private BigDecimal investimento;
    private double meta;
    private String perfil;
    private ContaBancaria contaBancaria;
    private ControleFinanceiro controleFinanceiro;

    public PerfilFinanceiro(BigDecimal patrimonio, BigDecimal investimento, double meta, String perfil){
        this.patrimonio = patrimonio;
        this.investimento = investimento;
        this.meta = meta;
        this.perfil = perfil;
    }

    public BigDecimal getPatrimonio(){
        return patrimonio;
    }

    public void setPatrimonio(BigDecimal patrimonio){
        this.patrimonio = patrimonio;
    }

    public BigDecimal getInvestimento(){
        return investimento;
    }

    public void setInvestimento(BigDecimal investimento){
        this.investimento = investimento;
    }

    public double getMeta(){
        return meta;
    }

    public void setMeta(double meta){
        this.meta = meta;
    }

    public String getPerfil(){
        return perfil;
    }

    public void setPerfil(String perfil){
        this.perfil = perfil;
    }

    public ContaBancaria getContaBancaria(){
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }

    public ControleFinanceiro getControleFinanceiro(){
        return controleFinanceiro;
    }

    public void setControleFinanceiro(ControleFinanceiro controleFinanceiro){
        this.controleFinanceiro = controleFinanceiro;
    }

}
