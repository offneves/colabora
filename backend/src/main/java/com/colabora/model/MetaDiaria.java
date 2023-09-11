package com.colabora.model;

import java.util.Date;

public class MetaDiaria extends Meta{
    
    private Date dataFim;
    
    public Date getDataFim(){
        return dataFim;
    }

    public void setDataFim(Date dataFim){
        this.dataFim = dataFim;
    }

}
