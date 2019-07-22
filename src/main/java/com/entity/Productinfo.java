package com.entity;
import com.entity.*;
import java.util.*;
public class Productinfo implements java.io.Serializable{
    private Integer pid;

    private String productid;

    private String productname;

    private Integer productprice;

    private Integer iscanbuy;

    private Integer productnum;

    private String producttaste;

    private Integer seriesid;

    private String productcreateimg;

    private List<Productimg> productimgs;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public Integer getIscanbuy() {
        return iscanbuy;
    }

    public void setIscanbuy(Integer iscanbuy) {
        this.iscanbuy = iscanbuy;
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public String getProducttaste() {
        return producttaste;
    }

    public void setProducttaste(String producttaste) {
        this.producttaste = producttaste;
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public String getProductcreateimg() {
        return productcreateimg;
    }

    public void setProductcreateimg(String productcreateimg) {
        this.productcreateimg = productcreateimg;
    }

    public List<Productimg> getProductimgs() {
        return productimgs;
    }

    public void setProductimgs(List<Productimg> productimgs) {
        this.productimgs = productimgs;
    }

    @Override
    public String toString() {
        return "Productinfo{" +
                "pid=" + pid +
                ", productid='" + productid + '\'' +
                ", productname='" + productname + '\'' +
                ", productprice=" + productprice +
                ", iscanbuy=" + iscanbuy +
                ", productnum=" + productnum +
                ", producttaste='" + producttaste + '\'' +
                ", seriesid=" + seriesid +
                ", productcreateimg='" + productcreateimg + '\'' +
                ", productimgs=" + productimgs +
                '}';
    }
}