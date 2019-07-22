package com.entity;

import java.util.List;

public class Productkind implements java.io.Serializable{
    private Integer kindid;

    private String kindname;

    private List<Productseries> productserieses;

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname == null ? null : kindname.trim();
    }

    public List<Productseries> getProductserieses() {
        return productserieses;
    }

    public void setProductserieses(List<Productseries> productserieses) {
        this.productserieses = productserieses;
    }

    @Override
    public String toString() {
        return "Productkind{" +
                "kindid=" + kindid +
                ", kindname='" + kindname + '\'' +
                ", productserieses=" + productserieses +
                '}';
    }
}