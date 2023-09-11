package com.colabora.model;

import java.util.Date;

public class ReceitaFixa extends Receita {
    
    private Date dataReceitaFixa;

    public Date getReceitaFixa(){
        return dataReceitaFixa;
    }

    public void setDataReceitaFixa(Date dataReceitaFixa){
        this.dataReceitaFixa = dataReceitaFixa;
    }

}
